package br.com.marcosatanaka.easypoi.util;

import br.com.marcosatanaka.easypoi.model.RelatorioParam;

public class ReplaceNull {

  public static String validate(RelatorioParam param) {
    if (param.getPeriodoInicial() == null || param.getPeriodoInicial().equals("null")
        || param.getPeriodoInicial().contains("null") && param.getPeriodoFinal() == null || param.getPeriodoFinal().equals("null")
        || param.getPeriodoFinal().contains("null"))
      return "Período: Não informado";
    else
      return "Período: " + param.getPeriodoInicial() + " a " + param.getPeriodoFinal();
  }
}
