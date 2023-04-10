package br.unibh.minhasmusicas.modelos;

public class Preferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " E sucesso absoluto"
            + "é preferida de todos");
        } else {
            System.out.println(audio.getTitulo() + " Também é sucesso " +
                    "vale a pena conferir");
        }
    }
}
