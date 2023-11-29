package junitday17excelreadwrite;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel07ReadAll {

    //-Dosya yolunu bir String degiskene atayalim
    //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
    //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim

    @Test
    public void test() throws IOException {

    String excel="src//test//java/Resource//takimlar.xlsx";

    FileInputStream fileInputStream=new FileInputStream(excel);

    Workbook workbook= WorkbookFactory.create(fileInputStream);

    //-Excel tablosundaki tüm tabloyu konsola yazdırınız

    String tablo="";

        for (int i = 0; i<4; i++) {

            for (int j = 0; j <10;j++){

               tablo=workbook.getSheetAt(0).getRow(j).getCell(i).toString();

                System.out.println(tablo);

            }




    }


}

}


