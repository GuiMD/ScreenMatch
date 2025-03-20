package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2020);
        outroFilme.avalia(6);
        var filme3 = new Filme("Dogville", 2003);
        filme3.avalia(10);

        Serie lost = new Serie("Lost", 2000);



        ArrayList<Titulo> lista1 = new ArrayList<>();
        lista1.add(meuFilme);
        lista1.add(outroFilme);
        lista1.add(filme3);
        lista1.add(lost);

        for (Titulo item: lista1) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
        }
    }
}
