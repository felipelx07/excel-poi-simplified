package br.com.marcosatanaka.easypoi.excel;

import static com.google.common.base.Preconditions.checkNotNull;

import br.com.marcosatanaka.easypoi.excel.config.SheetConfig;
import br.com.marcosatanaka.easypoi.model.CellStyleFields;
import br.com.marcosatanaka.easypoi.model.RelatorioParam;
import br.com.marcosatanaka.easypoi.util.ReplaceNull;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Planilha {

  private final Sheet sheet;

  public Planilha(RelatorioParam param) {
    Workbook wb = new XSSFWorkbook();
    this.sheet = wb.createSheet(param.getNomeRelatorio());
    SheetConfig.process(sheet);
  }

  public Planilha(Sheet sheet) {
    this.sheet = sheet;
  }

  public void createHeaderLogo(RelatorioParam param, CellStyleFields cellStyle) {
    this.novaLinha().novaCelula().setCabecalho(param.getNomeRelatorio(), cellStyle.csHeader);
    this.novaLinha().novaCelula().setCabecalho(param.getRazaoSocial(), cellStyle.csHeader);
    this.novaLinha().novaCelula().setCabecalho(ReplaceNull.validate(param), cellStyle.csHeader);

    this.novaLinha().novaCelula();
    this.novaLinha().novaCelula();
  }

  public Sheet getSheet() {
    return this.sheet;
  }

  public Workbook getWorkbook() {
    return this.sheet.getWorkbook();
  }

  public static Planilha of(Sheet sheet) {
    checkNotNull(sheet);
    return new Planilha(sheet);
  }

  public void breakColumns(int value) {
    sheet.setColumnBreak(value);
  }

  public Linha novaLinha() {
    return Linha.of(sheet.createRow(sheet.getPhysicalNumberOfRows()), this);
  }

  public Linha preencherLinhasEmBranco(int index) {
    return Linha.of(sheet.createRow(sheet.getPhysicalNumberOfRows() + index), this);
  }

  public List<Linha> linhasIgnorandoCabecalho() {
    return StreamSupport.stream(sheet.spliterator(), false).skip(1).map(row -> Linha.of(row, this)).collect(Collectors.toList());
  }

  public List<Linha> linhasAPartirDa(Integer linha) {
    return StreamSupport.stream(sheet.spliterator(), false).skip(linha - 1).map(row -> Linha.of(row, this))
                        .collect(Collectors.toList());
  }

  public String valorNa(Integer coluna, Integer linha) {
    return Linha.of(sheet.getRow(linha - 1), this).valorNa(coluna);
  }

  String nomeColuna(Integer indice) {
    return cabecalho().getCell(indice).getStringCellValue();
  }

  protected Row cabecalho() {
    return sheet.getRow(0);
  }

}
