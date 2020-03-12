package br.com.marcosatanaka.easypoi.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.poi.ss.usermodel.CellStyle;


@Getter
@Setter
public class CellStyleFields {

  public CellStyle cs = null;
  public CellStyle csHeader = null;
  public CellStyle csBold = null;
  public CellStyle csTop = null;
  public CellStyle csRight = null;
  public CellStyle csBottom = null;
  public CellStyle csLeft = null;
  public CellStyle csTopLeft = null;
  public CellStyle csTopRight = null;
  public CellStyle csBottomLeft = null;
  public CellStyle csBottomRight = null;
}
