package br.com.alura.screenmatch.models;

public class Serie extends Titulo {
  private int temporadas;
  private int episodiosPorTemporada;
  private boolean ativa;
  private int minutosPorEpisodio;

  public Serie(String nome, int anoDeLancamento) {
    super(nome, anoDeLancamento);
  }

  public int getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }

  public int getEpisodiosPorTemporada() {
    return episodiosPorTemporada;
  }

  public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
    this.episodiosPorTemporada = episodiosPorTemporada;
  }

  public boolean getAtiva() {
    return ativa;
  }

  public void setAtiva(boolean ativa) {
    this.ativa = ativa;
  }

  public int getMinutosPorEpisodio() {
    return minutosPorEpisodio;
  }

  public void setMinutosPorEpisodio(int minutosPorEpisodio) {
    this.minutosPorEpisodio = minutosPorEpisodio;
  }

  @Override
  public int getDuracaoEmMinutos() {
    return episodiosPorTemporada * temporadas * minutosPorEpisodio;
  }

  @Override
  public String toString() {
    return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
  }

}
