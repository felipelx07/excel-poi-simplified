package br.com.marcosatanaka.easypoi.demo;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ExportacaoPlanilhaTesteServiceTest {

  @InjectMocks
  private ExportacaoPlanilhaTesteService service;

  //
  //	@Test
  //	public void importarUsuarios() throws IOException {
  //		File arquivo = service.exportar();
  //
  //		assertThat(arquivo).isNotNull();
  //
  //		List<ImportacaoDTO> produtosImportados = importacaoPlanilhaTesteService.importar(ArquivoDTO.of("asd.xlsx", new FileInputStream(arquivo)));
  //
  //		assertThat(produtosImportados).isNotNull();
  //		assertThat(produtosImportados).hasSize(2);
  //	}

}
