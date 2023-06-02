package model;

public class idioma {

    private int ididioma;
    private String idioma;

    public idioma() {
    }

    public idioma(int ididioma, String idioma) {
        this.ididioma = ididioma;
        this.idioma = idioma;
    }

    public int getIdidioma() {
        return ididioma;
    }

    public void setIdidioma(int ididioma) {
        this.ididioma = ididioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Traducao{" + "ididioma=" + ididioma + ", idioma=" + idioma + '}';
    }

}
