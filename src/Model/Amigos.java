package Model;

import java.util.*;
import DAO.AmigosDAO;
import java.sql.SQLException;

public class Amigos {

    private int id_a;
    private String nome_a;
    private String telefone;

    private final AmigosDAO dao;

    public Amigos() {
        this.dao = new AmigosDAO(); 
    }

    public Amigos(int id_a, String nome_a, String telefone) {
        this.id_a = id_a;
        this.nome_a = nome_a;
        this.telefone = telefone;
        this.dao = new AmigosDAO();
    }

    public int getId_a() {
        return id_a;
    }

    public void setId_a(int id_a) {
        this.id_a = id_a;
    }

    public String getNome_a() {
        return nome_a;
    }

    public void setNome_a(String nome_a) {
        this.nome_a = nome_a;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n Id do Amigo: " + this.getId_a()
                + "\n Nome do Amigo: " + this.getNome_a()
                + "\n Telefone: " + this.getTelefone();
    }

    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    public boolean InsertAmigosBD(String nome_a, String telefone) throws SQLException {
        int id_a = this.maiorID() + 1;
        Amigos objeto = new Amigos(id_a, nome_a, telefone);

        dao.InsertAmigosBD(objeto);
        return true;
    }

    public boolean DeleteAmigosBD(int id_a) {
        dao.DeleteAmigosBD(id_a);
        return true;
    }

    public boolean UpdateAmigosBD(int id_a, String nome_a, String telefone) {
        Amigos objeto = new Amigos(id_a, nome_a, telefone);
        dao.UpdateAmigosBD(objeto);
        return true;
    }

    public Amigos carregaAmigos(int id_a) {
        dao.carregaAmigos(id_a);
        return null;
    }

    public int maiorID() throws SQLException {

        return dao.maiorID();
    }
}