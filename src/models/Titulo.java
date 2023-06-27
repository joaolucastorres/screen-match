package models;

public class Titulo {

  private String nome;
  private int anoDeLancamento;
  private int duracaoEmMinutos;
  private boolean incluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalDeAvaliacoes;

  public int getTotalDeAvaliacoes() {
    return totalDeAvaliacoes;
  }

  public String getNome() {
    return nome;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public boolean getIncluidoNoPlano() {
    return incluidoNoPlano;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public void exibeFichaTecnica() {
    System.out.println("Filme: " + nome);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    System.out.println("Duração: " + getDuracaoEmMinutos() + " minutos");
  }

  public void avalia(double nota) {
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }

  public double pegaMedia() {
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }
}
