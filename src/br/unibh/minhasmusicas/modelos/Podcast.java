package br.unibh.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String tema;
    private String data;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }
    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }

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

