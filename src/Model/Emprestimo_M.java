package Model;

import java.util.*;
import DAO.EmprestimoDAO;
import java.sql.SQLException;

public class Emprestimo_M {

    private int id_e;
    private String nome_e;
    private String ferramenta;
    private String data_e;
    private String data_d;
    private String cod;
    private final EmprestimoDAO dao;

    public Emprestimo_M() {
        this.dao = new EmprestimoDAO(); 
    }

    public Emprestimo_M(int id_e, String nome_e, String ferramenta, String data_e, String data_d, String cod) {
        this.id_e = id_e;
        this.nome_e = nome_e;
        this.ferramenta = ferramenta;
        this.data_e = data_e;
        this.data_d = data_d;
        this.cod = cod;
        this.dao = new EmprestimoDAO();
    }

    public int getId_e() {
        return id_e;
    }

    public void setId_e(int id_e) {
        this.id_e = id_e;
    }

    public String getNome_e() {
        return nome_e;
    }

    public void setNome_e(String nome_e) {
        this.nome_e = nome_e;
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }

    public String getData_e() {
        return data_e;
    }

    public void setData_e(String data_e) {
        this.data_e = data_e;
    }

    public String getData_d() {
        return data_d;
    }

    public void setData_d(String data_d) {
        this.data_d = data_d;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "\n Id: " + this.getId_e()
                + "\n Nome: " + this.getNome_e()
                + "\n Ferramenta: " + this.getFerramenta()
                + "\n Data_Emprestimo: " + this.getData_e()
                + "\n Data_Devolução: " + this.getData_d()
                +"\n Cód Ferramenta: " + this.getCod();
    }

    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    public boolean InsertEmprestimoBD(String nome_e, String ferramenta, String data_e, String data_d, String cod) throws SQLException {
        int id_e = this.maiorID() + 1;
        Emprestimo_M objeto = new Emprestimo_M(id_e, nome_e, ferramenta, data_e, data_d, cod);

        dao.InsertEmprestimoBD(objeto);
        return true;
    }

    public boolean DeleteEmprestimoBD(int id_e) {
        dao.DeleteEmprestimoBD(id_e);
        return true;
    }

    public boolean UpdateEmprestimoBD(int id_e, String nome_e, String ferramenta, String data_e, String data_d, String cod) {
        Emprestimo_M objeto = new Emprestimo_M(id_e, nome_e, ferramenta, data_e, data_d, cod);
        dao.UpdateEmprestimoBD(objeto);
        return true;
    }

    public Emprestimo_M carregaEmprestimo(int id_e) {
        dao.carregaEmprestimo(id_e);
        return null;
    }

    public int maiorID() throws SQLException {

        return dao.maiorID();
    }
}