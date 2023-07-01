package br.com.alura.screenmatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

public class App {
    public static void main(String[] args) throws Exception {
        Filme starWars = new Filme("Star Wars", 2010);
        starWars.setDuracaoEmMinutos(180);
        // starWars.exibeFichaTecnica();
        starWars.avalia(10);
        starWars.avalia(8);
        starWars.avalia(6);
        // System.out.println("Avaliação: " + starWars.pegaMedia() + "/10");
        // System.out.println("Total de avaliações: " +
        // starWars.getTotalDeAvaliacoes());

        Serie breakingBad = new Serie("Breaking Bad", 2005);
        breakingBad.setTemporadas(6);
        breakingBad.setMinutosPorEpisodio(45);
        breakingBad.setEpisodiosPorTemporada(8);
        // breakingBad.exibeFichaTecnica();

        Episodio episodio = new Episodio();
        episodio.setTotalAvaliacoes(90);
        episodio.setSerie(breakingBad);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(episodio);
        filtro.filtra(starWars);

        Serie theWalkingDead = new Serie("The Walking Dead", 2000);

        Filme creed = new Filme("Creed", 2018);

        Filme carros = new Filme("Carros", 2008);

        List<Titulo> lista = new ArrayList<>();
        lista.add(starWars);
        lista.add(creed);
        lista.add(carros);
        lista.add(theWalkingDead);
        lista.add(breakingBad);

        Collections.sort(null, null);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println(lista);

    }
}
