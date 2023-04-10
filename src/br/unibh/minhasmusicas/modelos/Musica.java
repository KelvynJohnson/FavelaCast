package br.unibh.minhasmusicas.modelos;

public class Musica extends Audio {
    private String cantor;
    private String album;
    private String ano;


    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }


    @Override
    public int getClassificacao() {
        if  (getCurtidas() > 1000) {
            return 5;
        } else if (getCurtidas() > 500) {
            return 4;
        } else if (getCurtidas() > 100) {
            return 3;
        } else if (getCurtidas() > 50) {
            return 2;
        } else {
            return 1;
        }
    }
}

