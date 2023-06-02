package dao;

import model.idioma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class idiomaDAO {

    private Connection connection;

    public idiomaDAO(Connection connection) {
        this.connection = connection;
    }

    public void cadIdiomaDAO(idioma iVO) {// INICIO CAD
        try {
            PreparedStatement pst = connection.prepareStatement("INSERT INTO idioma VALUES (null,?)");
            pst.setString(1, iVO.getIdioma());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n" + ex.getMessage());
        }
    }// FIM CAD   

    public ArrayList<idioma> getIdiomaDAO() {// INICIO GET
        ArrayList<idioma> idiomas = new ArrayList<>();
        try ( PreparedStatement pst = connection.prepareStatement("SELECT * FROM idioma ORDER by ididioma;")) {
            pst.execute();

            ResultSet rs = pst.getResultSet();

            while (rs.next()) {
                idioma i = new idioma();
                i.setIdidioma(rs.getInt("ididioma"));
                i.setIdioma(rs.getString("idioma"));

                idiomas.add(i);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar idiomas!\n" + ex.getMessage());
        }
        return idiomas;
    }// FIM GET

    public void delIdiomaDAO(int ididioma) {// INCIO DEL
        try {
            PreparedStatement pst = connection.prepareStatement("DELETE FROM idioma WHERE ididioma = ?");
            pst.setInt(1, ididioma);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar idioma!\n" + ex.getMessage());
        }
    }// FIM DEL

    public void attIdiomabyDOC(idioma iVO) {// Inicio ATT
        try {
            PreparedStatement pst = connection.prepareStatement("UPDATE idioma SET idioma = ? WHERE ididioma = ?");
            pst.setString(1, iVO.getIdioma());
            pst.setInt(2, iVO.getIdidioma());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar idioma!\n" + ex.getMessage());
        }
    }// Fim ATT    

    public idioma getIdiomaID(int ididioma) {// Inicio GET
        idioma i = new idioma();
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT idioma FROM idioma WHERE ididioma = ?");
            pst.setInt(1, ididioma);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                i.setIdioma(rs.getString("idioma"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar id dos idiomas!\n" + ex.getMessage());
        }
        return i;
    }// Fim GET

    public idioma getIdioma(String idioma) {// Inicio GET
        idioma i = new idioma();
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM idioma WHERE idioma = ?");
            pst.setString(1, idioma);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                i.setIdidioma(rs.getInt("ididioma"));
                i.setIdioma(rs.getString("idioma"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar idiomas!\n" + ex.getMessage());
        }
        return i;
    }// Fim GET

    public boolean verTraducao(idioma idioma) {
        try {
            PreparedStatement pst = connection.prepareStatement(" select count(*) from idioma where idioma = ?");
            pst.setString(1, idioma.getIdioma());
            ResultSet rs = pst.executeQuery();
            rs.next();

            int count = rs.getInt(1);

            return count > 0;
        } catch (SQLException ex) {
            System.out.println("Erro ao verificar idiomas!\n" + ex.getMessage());
        }
        return false;
    }// FIM VER
}
