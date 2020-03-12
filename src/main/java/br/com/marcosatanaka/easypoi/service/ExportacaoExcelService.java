package br.com.marcosatanaka.easypoi.service;


import static com.google.common.base.Preconditions.checkNotNull;

import br.com.marcosatanaka.easypoi.excel.Planilha;
import br.com.marcosatanaka.easypoi.model.RelatorioParam;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import lombok.Getter;

@Getter
public class ExportacaoExcelService<T> {

  private final Class<T> classeExportar;

  public ExportacaoExcelService(Class<T> classeExportar) {
    checkNotNull(classeExportar);
    this.classeExportar = classeExportar;
  }

  public File exportar(RelatorioParam param, Planilha planilha) throws Exception {
    File arquivo = File.createTempFile(param.getNomeRelatorio().toLowerCase().replace(" ", "-"), ".xlsx");
    OutputStream outputStream = new FileOutputStream(arquivo);
    planilha.getWorkbook().write(outputStream);
    planilha.getWorkbook().close();
    return arquivo;
  }
}
