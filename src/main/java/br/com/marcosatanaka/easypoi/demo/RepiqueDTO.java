package br.com.marcosatanaka.easypoi.demo;

import br.com.marcosatanaka.easypoi.excel.ExcelColumn;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RepiqueDTO {

  @ExcelColumn(name = "Data")
  private Date date;

  @ExcelColumn(name = "Atendente")
  private String atendente;

  @ExcelColumn(name = "Caixa")
  private String caixa;

  @ExcelColumn(name = "Nº Documento")
  private int nDocumento;

  @ExcelColumn(name = "Valor Documento")
  private BigDecimal valorDocumento;

  @ExcelColumn(name = "Valor Repique")
  private BigDecimal valorRepique;

  ///////////////////////////////////////////////////////
  //                   CONSTRUCTORS                    //
  ///////////////////////////////////////////////////////
  public RepiqueDTO(Date date, String atendente, String caixa, int nDocumento, BigDecimal valorDocumento,
                    BigDecimal valorRepique) {
    this.date = date;
    this.atendente = atendente;
    this.caixa = caixa;
    this.nDocumento = nDocumento;
    this.valorDocumento = valorDocumento;
    this.valorRepique = valorRepique;
  }
}
