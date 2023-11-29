package junitday17excelreadwrite;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel08Write {

    @Test
    public void test() throws IOException, IOException {
        //-Dosya yolunu bir String degiskene atayalim

        //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim

        //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim

        String excel="src//test//java/Resource//takimlar.xlsx";

        FileInputStream fileInputStream=new FileInputStream(excel);

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        //5.hucreye yeni bir cell olusturalim

        //Olusturdugumuz hucreye “PUAN” yazdiralim

        workbook.getSheet("sayfa1").getRow(0).createCell(4).setCellValue("PUAN");

       //2.satir PUAN kolonuna 85 yazdiralim

        workbook.getSheet("sayfa1").getRow(1).createCell(4).setCellValue("85");

       //10.satir PUAN kolonuna 72 yazdiralim

        workbook.getSheet("sayfa1").getRow(9).createCell(4).setCellValue("72");

        //5.satir PUAN kolonuna 72 yazdiralim
        workbook.getSheet("sayfa1").getRow(4).createCell(4).setCellValue("yeni Olusturuldu");

       //Dosyayi kaydedelim

        FileOutputStream fileOutputStream=new FileOutputStream(excel);

        workbook.write(fileOutputStream);

       //Dosyayi kapatalim
        fileInputStream.close();

        fileOutputStream.close();

        workbook.close();
    }
}
