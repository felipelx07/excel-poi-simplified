package br.com.marcosatanaka.easypoi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RelatorioParam {

  public String nomeRelatorio;
  public String razaoSocial;
  public String periodoInicial;
  public String periodoFinal;

  public RelatorioParam(String nomeRelatorio, String razaoSocial, String periodoInicial, String periodoFinal) {
    this.nomeRelatorio = nomeRelatorio;
    this.razaoSocial = razaoSocial;
    this.periodoInicial = periodoInicial;
    this.periodoFinal = periodoFinal;
  }

  public RelatorioParam(String nomeRelatorio, String razaoSocial) {
    this.nomeRelatorio = nomeRelatorio;
    this.razaoSocial = razaoSocial;
  }
}
