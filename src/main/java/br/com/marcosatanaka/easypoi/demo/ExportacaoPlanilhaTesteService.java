package br.com.marcosatanaka.easypoi.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ExportacaoPlanilhaTesteService {

  public static List<RepiqueDTO> demo() {
    List<RepiqueDTO> list = new ArrayList<>();
    list.add(new RepiqueDTO(new Date(), "Não Informado", "S001", 82, BigDecimal.valueOf(365), BigDecimal.valueOf(15)));
    list.add(new RepiqueDTO(new Date(1), "Não Informado", "S003", 88, BigDecimal.valueOf(330), BigDecimal.valueOf(10)));
    list.add(new RepiqueDTO(new Date(3), "Paulo", "S001", 80, BigDecimal.valueOf(35), BigDecimal.valueOf(5)));
    list.add(new RepiqueDTO(new Date(4), "Paulo", "S002", 85, BigDecimal.valueOf(93), BigDecimal.valueOf(2)));
    list.add(new RepiqueDTO(new Date(5), "Marcelo", "S002", 84, BigDecimal.valueOf(22.5), BigDecimal.valueOf(2.5)));
    return list;
  }
}
