package br.com.marcosatanaka.easypoi.excel.config;

import br.com.marcosatanaka.easypoi.excel.Planilha;
import br.com.marcosatanaka.easypoi.model.CellStyleFields;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

public class CellStyleConfig {

  public static CellStyleFields setCellStyles(Planilha planilha, CellStyleFields cellStyleDef) {

    //font size 10
    Font f = planilha.getWorkbook().createFont();
    f.setFontHeightInPoints((short) 10);

    //Simple style
    cellStyleDef.cs = planilha.getWorkbook().createCellStyle();
    cellStyleDef.cs.setFont(f);

    //font size 16 / Header
    Font f16 = planilha.getWorkbook().createFont();
    f16.setFontHeightInPoints((short) 16);
    f16.setBold(true);
    cellStyleDef.csHeader = planilha.getWorkbook().createCellStyle();
    cellStyleDef.csHeader.setFont(f16);

    //Bold Fond
    Font bold = planilha.getWorkbook().createFont();
    bold.setBold(true);
    bold.setFontHeightInPoints((short) 10);

    //Bold style
    cellStyleDef.csBold = planilha.getWorkbook().createCellStyle();
    cellStyleDef.csBold.setBorderBottom(BorderStyle.THIN);
    cellStyleDef.csBold.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csBold.setFont(bold);

    //Setup style for Top Border Line
    cellStyleDef.csTop = planilha.getWorkbook().createCellStyle();
    cellStyleDef.csTop.setBorderTop(BorderStyle.THIN);
    cellStyleDef.csTop.setTopBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csTop.setFont(f);

    //Setup style for Right Border Line
    cellStyleDef.csRight = planilha.getWorkbook().createCellStyle();
    cellStyleDef.csRight.setBorderRight(BorderStyle.THIN);
    cellStyleDef.csRight.setRightBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csRight.setFont(f);

    //Setup style for Bottom Border Line
    cellStyleDef.csBottom = planilha.getWorkbook().createCellStyle();
    cellStyleDef.csBottom.setBorderBottom(BorderStyle.THIN);
    cellStyleDef.csBottom.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csBottom.setFont(f);

    //Setup style for Left Border Line
    cellStyleDef.csLeft = planilha.getWorkbook().createCellStyle();
    cellStyleDef.csLeft.setBorderLeft(BorderStyle.THIN);
    cellStyleDef.csLeft.setLeftBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csLeft.setFont(f);

    //Setup style for Top/Left corner cell Border Lines
    cellStyleDef.csTopLeft = planilha.getWorkbook().createCellStyle();
    cellStyleDef.csTopLeft.setBorderTop(BorderStyle.THIN);
    cellStyleDef.csTopLeft.setTopBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csTopLeft.setBorderLeft(BorderStyle.THIN);
    cellStyleDef.csTopLeft.setLeftBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csTopLeft.setFont(f);

    //Setup style for Top/Right corner cell Border Lines
    cellStyleDef.csTopRight = planilha.getWorkbook().createCellStyle();
    cellStyleDef.csTopRight.setBorderTop(BorderStyle.THIN);
    cellStyleDef.csTopRight.setTopBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csTopRight.setBorderRight(BorderStyle.THIN);
    cellStyleDef.csTopRight.setRightBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csTopRight.setFont(f);

    //Setup style for Bottom/Left corner cell Border Lines
    cellStyleDef.csBottomLeft = planilha.getWorkbook().createCellStyle();
    cellStyleDef.csBottomLeft.setBorderBottom(BorderStyle.THIN);
    cellStyleDef.csBottomLeft.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csBottomLeft.setBorderLeft(BorderStyle.THIN);
    cellStyleDef.csBottomLeft.setLeftBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csBottomLeft.setFont(f);

    //Setup style for Bottom/Right corner cell Border Lines
    cellStyleDef.csBottomRight = planilha.getWorkbook().createCellStyle();
    cellStyleDef.csBottomRight.setBorderBottom(BorderStyle.THIN);
    cellStyleDef.csBottomRight.setBottomBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csBottomRight.setBorderRight(BorderStyle.THIN);
    cellStyleDef.csBottomRight.setRightBorderColor(IndexedColors.BLACK.getIndex());
    cellStyleDef.csBottomRight.setFont(f);

    return cellStyleDef;
  }
}
