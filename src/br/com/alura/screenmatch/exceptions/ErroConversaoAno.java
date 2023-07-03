package br.com.alura.screenmatch.exceptions;

public class ErroConversaoAno extends RuntimeException {
  String mensagem;

  public ErroConversaoAno(String mensagem) {
    this.mensagem = mensagem;
  }

  @Override
  public String getMessage() {
    return this.mensagem;
  }
}
