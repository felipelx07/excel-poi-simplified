package br.com.marcosatanaka.easypoi.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

  public static String convertToDate(Date date) {
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    return df.format(date);
  }

  public static String convertToDate(java.sql.Date date) {
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    return df.format(date);
  }

  public static String convertToDate(Timestamp date) {
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    return df.format(date);
  }

  public static String convertToTimestamp(Timestamp date) {
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    return df.format(date);
  }

  public static String convertToTimestamp(Date date) {
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    return df.format(date);
  }

  public static String convertToTimestamp(java.sql.Date date) {
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    return df.format(date);
  }
}
