package br.unibh.minhasmusicas.principal;

import br.unibh.minhasmusicas.modelos.Musica;
import br.unibh.minhasmusicas.modelos.Podcast;
import br.unibh.minhasmusicas.modelos.Preferidas;

public class Principal {

        public static void main(String[] args) {

            Musica minhaMusica = new Musica();
            minhaMusica.setTitulo("Revoada");
            minhaMusica.setCantor("Wesley Safadão");

            for (int i = 0; i < 1000; i++) {
                minhaMusica.reproduz();
            }
            for (int i = 0; i < 50; i++) {
                minhaMusica.curte();
            }
            Podcast meuPodcast = new Podcast();
            meuPodcast.setTitulo("Favelacast");
            meuPodcast.setApresentador("Kelvyn");
            meuPodcast.setTema("Favela");
            meuPodcast.setDescricao("Podcast sobre a favela");
            meuPodcast.setData("01/01/2020");
            meuPodcast.getClassificacao();


            for (int i = 0; i < 1000; i++) {
                meuPodcast.reproduz();
            }
            for (int i = 0; i < 50; i++) {
                meuPodcast.curte();
            }

            Preferidas preferidas = new Preferidas();

            preferidas.inclui(meuPodcast);
            preferidas.inclui(minhaMusica);


        }

}
