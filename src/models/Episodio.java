package models;

import interfaces.Classificavel;

public class Episodio implements Classificavel {
  private int numero;
  private Serie serie;
  private String nome;
  private int totalAvaliacoes;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Serie getSerie() {
    return serie;
  }

  public void setSerie(Serie serie) {
    this.serie = serie;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getTotalAvaliacoes() {
    return totalAvaliacoes;
  }

  public void setTotalAvaliacoes(int totalAvaliacoes) {
    this.totalAvaliacoes = totalAvaliacoes;
  }

  @Override
  public int getClassificacao() {
    if (totalAvaliacoes > 100) {
      return 4;
    } else
      return 2;
  }

}
