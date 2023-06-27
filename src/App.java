import models.Filme;
import models.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Filme starWars = new Filme();
        starWars.setNome("Star Wars");
        starWars.setAnoDeLancamento(2010);
        starWars.setDuracaoEmMinutos(180);

        starWars.exibeFichaTecnica();
        starWars.avalia(10);
        starWars.avalia(8);
        starWars.avalia(6);

        System.out.println("Avaliação: " + starWars.pegaMedia() + "/10");
        System.out.println("Total de avaliações: " + starWars.getTotalDeAvaliacoes());

        Serie breakingBad = new Serie();

        breakingBad.setNome("Breaking Bad");
        breakingBad.setAnoDeLancamento(2005);
        breakingBad.setTemporadas(6);
        breakingBad.setMinutosPorEpisodio(45);
        breakingBad.setEpisodiosPorTemporada(8);

        breakingBad.exibeFichaTecnica();

    }
}
