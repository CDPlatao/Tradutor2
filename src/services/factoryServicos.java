package services;

public class factoryServicos {

    private static traducaoServicos tServicos = new traducaoServicos();
    private static idiomaServicos iServicos = new idiomaServicos();
    private static comboServicos cServicos = new comboServicos();

    public static traducaoServicos getTraducaoServicos() {//Inicio GET
        return tServicos;
    }//Fim GET

    public static idiomaServicos getIdiomaServicos() {//Inicio GET
        return iServicos;
    }//Fim GET

    public static comboServicos getComboServicos() {//Inicio GET
        return cServicos;
    }//Fim GET
}
