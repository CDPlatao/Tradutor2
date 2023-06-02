package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.traducao;
import services.factoryServicos;
import services.idiomaServicos;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.idioma;

public class traducaoDAO {

    private Connection connection;

    public traducaoDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadTraducaoDAO(traducao tVO) {// INICIO CAD
        try {
            PreparedStatement pst = connection.prepareStatement(" insert into traducao values (null,?,?,?,?) ");
            pst.setString(1, tVO.getPalavra());
            pst.setString(2, tVO.getTraducao());
            pst.setInt(3, tVO.getOrigem().getIdidioma());
            pst.setInt(4, tVO.getDestino().getIdidioma());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }// FIM CAD   

    public ArrayList<traducao> getTraducaoDAO() {// Inicio GET
        idiomaServicos idiomaS = factoryServicos.getIdiomaServicos();
        ArrayList<traducao> traducao = new ArrayList<>();

        try ( PreparedStatement pst = connection.prepareStatement("select * from traducao")) {
            pst.execute();

            ResultSet rs = pst.getResultSet();

            while (rs.next()) {
                traducao t = new traducao();
                // lado do java'c...'' |x| lado do banco '()''
                t.setIdtraducao(rs.getInt("idtraducao"));
                t.setPalavra(rs.getString("palavra"));
                t.setOrigem(idiomaS.getIdiomabyID(rs.getInt("origem")));
                t.setTraducao(rs.getString("traducao"));
                t.setDestino(idiomaS.getIdiomabyID(rs.getInt("destino")));
                traducao.add(t);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar!\n"
                    + ex.getMessage());
        }
        return traducao;
    }// Fim GET

    public void delTraducaoDAO(int idtraducao) {// INCIO DEL        
        try {
            PreparedStatement pst = connection.prepareStatement(" delete from traducao where idtraducao = ? ");
            pst.setInt(1, idtraducao);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar tradução!\n"
                    + ex.getMessage());
        }
    }// FIM DEL

    public void attTraducaobyDOC(traducao tVO) {// Inicio ATT
        try {
            PreparedStatement pst = connection.prepareStatement("update traducao set palavra = ?, traducao = ?, origem = ?, destino = ? "
                    + "where idtraducao = ?");
            pst.setString(1, tVO.getPalavra());
            pst.setString(2, tVO.getTraducao());
            pst.setInt(3, tVO.getOrigem().getIdidioma());
            pst.setInt(4, tVO.getDestino().getIdidioma());
            pst.setInt(5, tVO.getIdtraducao());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar tradução!\n"
                    + ex.getMessage());
        }
    }// Fim ATT

    public boolean verTraducao(traducao traducao) {
        try {
            PreparedStatement pst = connection.prepareStatement(" select count(*) from traducao where palavra = ? and traducao = ? ");
            pst.setString(1, traducao.getPalavra());
            pst.setString(2, traducao.getTraducao());
            ResultSet rs = pst.executeQuery();
            rs.next();

            int count = rs.getInt(1);

            return count > 0;
        } catch (SQLException ex) {
            System.out.println("Erro ao verificar traduções!\n" + ex.getMessage());
        }
        return false;
    }// FIM VER

    public traducao getTraducaoID(String traducao) {// INICIO GETID
        traducao t = new traducao();
        try {
            PreparedStatement pst = connection.prepareStatement(" select idtraducao from traducao where palavra = ? ");
            pst.setString(1, traducao);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                t.setIdtraducao(rs.getInt("idtraducao"));
                t.setPalavra(rs.getString("palavra"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar traduções!\n" + ex.getMessage());
        }
        return t;
    }// FIM GETID

    public String getTraducao(String palavra, idioma origem, idioma destino) {// INICIO GETT
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT traducao FROM traducao WHERE palavra = ? AND origem = ? AND destino = ?");
            pst.setString(1, palavra);
            pst.setInt(2, origem.getIdidioma());
            pst.setInt(3, destino.getIdidioma());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getString("traducao");
            } else {
                return null; // Retornar null se a tradução não for encontrada no banco de dados
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar traduções!\n" + ex.getMessage());
            return null; // Retornar null em caso de erro
        }
    }// FIM GETT
}
