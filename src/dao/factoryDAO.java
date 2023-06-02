package dao;

import conexao.conexao;

public class factoryDAO {   

    private static traducaoDAO tDao = new traducaoDAO(new conexao().getConexao());
    private static idiomaDAO iDAO = new idiomaDAO(new conexao().getConexao());
    private static carregarcomboDAO cDAO = new carregarcomboDAO(new conexao().getConexao());

    public static traducaoDAO getTraducaoDAO() {
        return tDao;
    }

    public static idiomaDAO getIdiomaDAO() {
        return iDAO;
    }

    public static carregarcomboDAO getComboDAO() {
        return cDAO;
    }
}
