package com.yuhdeveloper.diksiyonhocam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kored on 29.11.2017.
 */

public class DiksiyonClass {


  public static List<String> getDiksiyonDescription() {
    List<String> lstDescription = new ArrayList<>();

    lstDescription.add("Sokakta gördüğünüz herhangi bir insan, kendi duygu , düşünce , bilgilerini diğer insanlara aktarabilmek ister bunun için ise kendini ifade edebilmelidir."
        + "\n Diksiyon, doğru sözcüğü , uyumlu tonda , doğru anlamda kullanabilmektir.Diksiyon kurallarına uyarsak yanlış anlaşılmaktan kurtulur ve isteklerimizin doğru iletilmesini sağlarız. ");
    return lstDescription;
  }

  public static List<String> getDiksiyonBaslik() {
    List<String> lstTitle = new ArrayList<>();

    lstTitle.add("Diksiyonun Önemi");
    return lstTitle;
  }
}
