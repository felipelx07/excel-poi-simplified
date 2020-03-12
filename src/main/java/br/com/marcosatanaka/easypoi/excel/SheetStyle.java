package br.com.marcosatanaka.easypoi.excel;

import br.com.marcosatanaka.easypoi.demo.ExportacaoPlanilhaTesteService;
import br.com.marcosatanaka.easypoi.excel.config.DetailConfig;
import br.com.marcosatanaka.easypoi.excel.config.HeaderConfig;
import br.com.marcosatanaka.easypoi.model.EnumNomeRelatorio;
import br.com.marcosatanaka.easypoi.model.RelatorioParam;
import br.com.marcosatanaka.easypoi.service.ExportacaoExcelService;
import java.util.List;

public class SheetStyle {

  public static void main(String[] args) throws Exception {

    RelatorioParam param = new RelatorioParam(EnumNomeRelatorio.RELATORIO_REPIQUE_ATENDENTE, "RAZÃO SOCIAL DA EMPRESA");
    SheetStyle myReport = new SheetStyle();
    myReport.createExcel(param, ExportacaoPlanilhaTesteService.demo());
  }

  public void createExcel(RelatorioParam param, List<?> data) throws Exception {

    //Create Planilha
    Planilha planilha = new Planilha(param);
    HeaderConfig.insertHeaderInfo(planilha, param, data.get(0).getClass());
    DetailConfig.insertDetailInfo(planilha, data);

    //Write the Excel file
    try {
      new ExportacaoExcelService<>(data.getClass()).exportar(param, planilha);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}