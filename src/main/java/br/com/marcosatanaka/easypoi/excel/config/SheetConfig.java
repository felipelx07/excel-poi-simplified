package br.com.marcosatanaka.easypoi.excel.config;

import org.apache.poi.ss.usermodel.Sheet;

public class SheetConfig {

  public static void process(Sheet sheet) {

    //Set Column Widths
    //TODO:: deixar colunas com resize automatico/dinamico
    sheet.setColumnWidth(0, 4000);
    sheet.setColumnWidth(1, 10000);
    sheet.setColumnWidth(2, 2500);
    sheet.setColumnWidth(3, 5000);
    sheet.setColumnWidth(4, 5000);

    //Setup the Page margins - Left, Right, Top and Bottom
    sheet.setMargin(Sheet.LeftMargin, 0.25);
    sheet.setMargin(Sheet.RightMargin, 0.25);
    sheet.setMargin(Sheet.TopMargin, 0.75);
    sheet.setMargin(Sheet.BottomMargin, 0.75);

    //Setup the Header and Footer Margins
    sheet.setMargin(Sheet.HeaderMargin, 0.25);
    sheet.setMargin(Sheet.FooterMargin, 0.25);
  }
}
