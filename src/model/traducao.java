package model;

public class traducao {

    private int idtraducao;
    private String palavra;
    private String traducao;
    private idioma origem;
    private idioma destino;

    public traducao() {
    }

    public traducao(int idtraducao, String palavra, String traducao, idioma origem, idioma destino) {
        this.idtraducao = idtraducao;
        this.palavra = palavra;
        this.traducao = traducao;
        this.origem = origem;
        this.destino = destino;
    }

    public int getIdtraducao() {
        return idtraducao;
    }

    public void setIdtraducao(int idtraducao) {
        this.idtraducao = idtraducao;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getTraducao() {
        return traducao;
    }

    public void setTraducao(String traducao) {
        this.traducao = traducao;
    }

    public idioma getOrigem() {
        return origem;
    }

    public void setOrigem(idioma origem) {
        this.origem = origem;
    }

    public idioma getDestino() {
        return destino;
    }

    public void setDestino(idioma destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Traducao{" + "idtraducao=" + idtraducao + ", palavra=" + palavra + ", traducao=" + traducao + ", origem=" + origem + ", destino=" + destino + '}';
    }

}
