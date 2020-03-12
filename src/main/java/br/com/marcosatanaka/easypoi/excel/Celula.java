package br.com.marcosatanaka.easypoi.excel;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Strings.isNullOrEmpty;

import br.com.marcosatanaka.easypoi.util.DateToString;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Locale;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;

public class Celula {

  private static final DataFormatter DATA_FORMATTER = new DataFormatter(Locale.forLanguageTag("pt-BR"));

  private final Cell cell;

  private final String nomeColuna;

  private Celula(Cell cell, String nomeColuna) {
    this.cell = cell;
    this.nomeColuna = nomeColuna;
  }

  public static Celula of(Cell cell) {
    checkNotNull(cell);
    return new Celula(cell, null);
  }

  public static Celula of(Cell cell, String nomeColuna) {
    checkNotNull(cell);
    return new Celula(cell, nomeColuna);
  }

  public void setValor(Object valor) {
    if (valor instanceof String) {
      cell.setCellValue((String) valor);
    }
    if (valor instanceof Integer) {
      cell.setCellValue(valor.toString());
    }
    if (valor instanceof Long) {
      cell.setCellValue(valor.toString());
    }
    if (valor instanceof BigDecimal) {
      cell.setCellValue(((BigDecimal) valor).doubleValue());
      DATA_FORMATTER.formatCellValue(cell);
    }
    if (valor instanceof Date) {
      cell.setCellValue(DateToString.convertToDate((Date) valor));
    }
    if (valor instanceof Timestamp) {
      cell.setCellValue(DateToString.convertToDate((Timestamp) valor));
    }
  }

  public void setCabecalho(Object valor, CellStyle cellStyle) {
    if (valor instanceof String) {
      cell.setCellValue((String) valor);
      cell.setCellStyle(cellStyle);
    } else if (valor instanceof BigDecimal) {
      cell.setCellValue(((BigDecimal) valor).doubleValue());
    }
  }

  public boolean possuiValor() {
    return !isNullOrEmpty(valor());
  }

  public String valor() {
    return DATA_FORMATTER.formatCellValue(cell);
  }

  public String nomeColuna() {
    return nomeColuna;
  }

}
