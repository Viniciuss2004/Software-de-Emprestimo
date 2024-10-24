package Model;

import java.util.*;
import DAO.FerramentasDAO;
import java.sql.SQLException;

public class Ferramentas {

    private String nome_f;
    private String status;
    private String marca;
    private String aquisicao;
    private int id_f;
    private final FerramentasDAO dao;

    public Ferramentas() {
        this.dao = new FerramentasDAO(); 
    }

    public Ferramentas(int id_f, String nome_f, String status, String marca, String aquisicao) {
        this.id_f = id_f;
        this.nome_f = nome_f;
        this.status = status;
        this.marca = marca;
        this.aquisicao = aquisicao;
        this.dao = new FerramentasDAO();
    }

    public int getId_f() {
        return id_f;
    }

    public void setId_f(int id_f) {
        this.id_f = id_f;
    }

    public String getNome_f() {
        return nome_f;
    }

    public void setNome_f(String nome_f) {
        this.nome_f = nome_f;
    }
    
     public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAquisicao() {
        return aquisicao;
    }

    public void setAquisicao(String aquisicao) {
        this.aquisicao = aquisicao;
    }

    @Override
    public String toString() {
        return "\n Id: " + this.getId_f()
                + "\n Nome da Ferramenta: " + this.getNome_f()
                + "\n Marca: " + this.getMarca()
                + "\n Custo de Aquisição: " + this.getAquisicao()
                + "\n Status: " + this.getStatus();
    }

    public ArrayList getMinhaLista() {
        return dao.getMinhaLista();
    }

    public boolean InsertFerramentasBD(String nome_f, String status, String marca, String aquisicao) throws SQLException {
        int id_f = this.maiorID() + 1;
        Ferramentas objeto = new Ferramentas(id_f, nome_f, status, marca, aquisicao);

        dao.InsertFerramentasBD(objeto);
        return true;
    }

    public boolean DeleteFerramentasBD(int id_f) {
        dao.DeleteFerramentasBD(id_f);
        return true;
    }

    public boolean UpdateFerramentasBD(int id_f, String nome_f, String status, String marca, String aquisicao) {
        Ferramentas objeto = new Ferramentas(id_f, nome_f, status, marca, aquisicao);
        dao.UpdateFerramentasBD(objeto);
        return true;
    }

    public Ferramentas carregaFerramentas(int id_f) {
        dao.carregaFerramentas(id_f);
        return null;
    }

    public int maiorID() throws SQLException {

        return dao.maiorID();
    }
}