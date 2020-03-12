package br.com.marcosatanaka.easypoi.excel.config;

import br.com.marcosatanaka.easypoi.excel.Planilha;
import br.com.marcosatanaka.easypoi.util.ReflectionUtils;
import java.util.List;

public class DetailConfig {

  public static void insertDetailInfo(Planilha planilha, List<?> data) {
    data.stream().map(ReflectionUtils::getValues).forEach(valores -> planilha.novaLinha().preencherCom(valores));
  }
}
