package br.com.marcosatanaka.easypoi.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import org.apache.poi.ss.usermodel.Workbook;

public class PastaTrabalho {

  public Planilha planilhaPrincipal(Workbook workbook) {
    return Planilha.of(workbook.getSheetAt(0));
  }

  public File exportar(Workbook workbook) throws IOException {
    File arquivo = File.createTempFile(UUID.randomUUID().toString(), ".xlsx");

    try (OutputStream outputStream = new FileOutputStream(arquivo)) {
      workbook.write(outputStream);
      workbook.close();
    }
    return arquivo;
  }
}
