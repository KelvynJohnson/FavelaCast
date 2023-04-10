package br.unibh.minhasmusicas.modelos;

public class Audio {

        private String titulo;
        private int duracao;
        private int totaldDeReproducoes;
        private int curtidas;
        private int genero;
        private int classificacao;


         public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getDuracao() {
            return duracao;
        }

        public int getTotaldDeReproducoes() {
            return totaldDeReproducoes;
        }

        public int getCurtidas() {
            return curtidas;
        }

        public int getGenero() {
            return genero;
        }

        public int getClassificacao() {
            return classificacao;
        }

        public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
        }

        public void curte() {
            this.curtidas++;
        }
        public void reproduz() {
            this.totaldDeReproducoes++;
        }

}

