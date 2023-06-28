package calculos;

import models.Titulo;

public class CalculadoraDeTempo {
  private int tempoTotal = 0;

  public int getTempoTotal() {
    return tempoTotal;
  }

  public void inclui(Titulo titulo) {
    this.tempoTotal += titulo.getDuracaoEmMinutos();
  }
}
