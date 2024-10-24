package DAO;

import Model.Emprestimo_M;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EmprestimoDAO {

    public static ArrayList<Emprestimo_M> MinhaLista = new ArrayList<>();

    public EmprestimoDAO() {
    }

    public int maiorID() throws SQLException {

        int maiorID = 0;
        try {
            try (Statement stmt = this.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT MAX(id_e) id_e FROM emprestimos");
                res.next();
                maiorID = res.getInt("id_e");
            }

        } catch (SQLException ex) {
        }

        return maiorID;
    }

    public Connection getConexao() {

        Connection connection = null;

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "trabalho";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "Vini240804";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: NãO CONECTADO!");
            }

            return connection;

        } catch (ClassNotFoundException e) {
            System.out.println("O driver nao foi encontrado. " + e.getMessage());
            return null;

        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar...");
            return null;
        }
    }

    public ArrayList<Emprestimo_M> getMinhaLista() {
        MinhaLista.clear();

        try {
            try (Statement stmt = this.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT Id_e, Nome, REGEXP_REPLACE(Ferramenta, '[0-9]', '') AS Ferramenta, DATE_FORMAT(Data_Emprestimo, ' %d / %m / %Y') AS Data_Emprestimo, DATE_FORMAT(Data_Devolucao, ' %d / %m / %Y') AS Data_Devolucao FROM emprestimos;");
                while (res.next()) {
                    int id_e = res.getInt("Id_e");
                    String nome_e = res.getString("Nome");
                    String ferramenta = res.getString("Ferramenta");
                    String emprestimo = res.getString("Data_Emprestimo");
                    String devolucao = res.getString("Data_Devolucao");

                    SimpleDateFormat inputDateFormat = new SimpleDateFormat(" dd / MM / yyyy");
                    SimpleDateFormat outputDateFormat = new SimpleDateFormat(" dd / MM / yyyy");

                    Date dataEmprestimo = inputDateFormat.parse(emprestimo);
                    Date dataDevolucao = inputDateFormat.parse(devolucao);

                    String data_e = outputDateFormat.format(dataEmprestimo);
                    String data_d = outputDateFormat.format(dataDevolucao);

                    Emprestimo_M objeto = new Emprestimo_M(id_e, nome_e, ferramenta, data_e, data_d, null);
                    MinhaLista.add(objeto);
                }
            }

        } catch (SQLException | ParseException ex) {
        }

        return MinhaLista;
    }

    public boolean InsertEmprestimoBD(Emprestimo_M objeto) {
        String sql = "INSERT INTO emprestimos (id_e,nome,ferramenta,data_emprestimo,data_devolucao,cao) VALUES(?,?,?,?,?,?)";

        try {
            try (PreparedStatement stmt = this.getConexao().prepareStatement(sql)) {
                stmt.setInt(1, objeto.getId_e());
                stmt.setString(2, objeto.getNome_e());
                stmt.setString(3, objeto.getFerramenta());
                stmt.setString(4, objeto.getData_e());
                stmt.setString(5, objeto.getData_d());
                stmt.setString(6, objeto.getCod());

                stmt.execute();
            }

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }

    public boolean DeleteEmprestimoBD(int id_e) {
        try {
            try (Statement stmt = this.getConexao().createStatement()) {
                stmt.executeUpdate("DELETE FROM emprestimos WHERE id_e = " + id_e);
            }

        } catch (SQLException erro) {
        }

        return true;
    }

    public boolean UpdateEmprestimoBD(Emprestimo_M objeto) {

        String sql = "UPDATE emprestimos set nome = ? , ferramenta = ? , data_emprestimo = ? , data_devolucao = ?  WHERE id_e = ?";

        try {
            try (PreparedStatement stmt = this.getConexao().prepareStatement(sql)) {
                stmt.setString(1, objeto.getNome_e());
                stmt.setString(2, objeto.getFerramenta());
                stmt.setString(3, objeto.getData_e());
                stmt.setString(4, objeto.getData_d());
                stmt.setInt(5, objeto.getId_e());

                stmt.execute();
            }

            return true;

        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }

    }

    public Emprestimo_M carregaEmprestimo(int id_e) {

        Emprestimo_M objeto = new Emprestimo_M();
        objeto.setId_e(id_e);

        try {
            try (Statement stmt = this.getConexao().createStatement()) {
                ResultSet res = stmt.executeQuery("SELECT * FROM emprestimos WHERE id_e = " + id_e);
                res.next();

                objeto.setNome_e(res.getString("Nome"));
                objeto.setFerramenta(res.getString("Ferramenta"));
                objeto.setData_e(res.getString("Data_Emprestimo"));
                objeto.setData_d(res.getString("Data_Devolucao"));
                objeto.setCod(res.getString("Cod"));
            }

        } catch (SQLException erro) {
        }
        return objeto;
    }
}