package br.com.marcosatanaka.easypoi.excel.config;

import br.com.marcosatanaka.easypoi.excel.Planilha;
import br.com.marcosatanaka.easypoi.model.CellStyleFields;
import br.com.marcosatanaka.easypoi.model.RelatorioParam;
import br.com.marcosatanaka.easypoi.util.ReflectionUtils;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.ClientAnchor.AnchorType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;

public class HeaderConfig {

  public static void insertHeaderInfo(Planilha planilha, RelatorioParam param, Class<?> classe) throws Exception {

    //-------------INSERT LOGO----------------------//
    //insertLogo(planilha);
    //---------------------------------------------//

    CellStyleFields cellStyleFields = CellStyleConfig.setCellStyles(planilha, new CellStyleFields());
    planilha.createHeaderLogo(param, cellStyleFields);

    //---- Fill Data Values
    planilha.novaLinha().preencherCom(ReflectionUtils.getExcelColumnNames(classe), cellStyleFields.csBold);
  }

  private static void insertLogo(Planilha planilha) throws Exception {
    //============= Inserting image - START
    /* Read input PNG / JPG Image into FileInputStream Object*/
    InputStream my_banner_image = HeaderConfig.class.getClassLoader().getResourceAsStream("images/logo.png");
    byte[] bytes = IOUtils.toByteArray(my_banner_image);
    my_banner_image.close();

    CreationHelper helper = planilha.getWorkbook().getCreationHelper();
    Drawing drawing = planilha.getSheet().createDrawingPatriarch();
    ClientAnchor anchor = helper.createClientAnchor();
    anchor.setAnchorType(AnchorType.MOVE_AND_RESIZE);
    int pictureIndex = planilha.getWorkbook().addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
    anchor.setRow1(0);
    anchor.setCol1(1);
    final Picture pict = drawing.createPicture(anchor, pictureIndex);
    pict.resize(2, 5);
    //============= Inserting image - END
  }
}
