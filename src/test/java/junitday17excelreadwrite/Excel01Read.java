package junitday17excelreadwrite;

import Utilities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Excel01Read  {

    //Prooje guvenligi ve sadeligi saglar
    //Excel leri  Resource altinda tutariz
    //Ihtiyac duydugumuz seyler resource da durur
    //Sifreler , ozel veriler vb...



    @Test
    public void test() throws IOException {

        /*
        Satirdaki 2.hucreye gidelim ve yazdiralim
        Satirdaki 1.hucreyi bir string degiskene atayalim ve yazdiralim
        Satir 2.cell’in Englend’in baskenti London oldugunu test edelim
        Satir sayisini bulalim
        Fiziki olarak kullanilan satir sayisini bulun
        Ulke isimleri ve baskentleri bir map olarak kaydedelim
         */

        //WORKBOOK (EXCEL DOSYASI) >
        //WORKSHEET/SHEET(SAYFA) >
        //ROW (SATIR)>
        //CELL(VERI HUCRESI)

        String path = "src//test//java//Resource//ornek.xlsx";

        //Dosyayi ac (Sadece O dosyaya gider , acmaz )

        FileInputStream fileInputStream=new FileInputStream(path);

        //Excel /Workbook u ac(cift tiklamis sayfayi acmisiz gibi dusun)

        Workbook workbook= WorkbookFactory.create(fileInputStream);

        //Excel icindeki Sheetleri ac( //index 0 dan baslar. ilk sayfayi ac)

        Sheet sheet=workbook.getSheetAt(0);
        //Sheet sheet1 = workbook.getSheet("Sheet1");// Sheet1 isimli sayfayi ac,login , testcase vb olabilir
                                                     //Index yerine sheet ismide yazilabilir,daha guvenli
                                                     //Yeni sayfa actikca index kayabilir

        //Ilk satira git

        Row row1= sheet.getRow(0);//Index O dan baslar

        //Ilk satirdaki 2. veriyi al(2.sutunu al)

        Cell cell01=row1.getCell(1);

        //Veriyi yazdir

        System.out.println(cell01);

        //2. Satir(Index 1)  1.Sutun (Index 0) u yazdir

        //FileInputStream fis = new FileInputStream(path);

        //Workbook wb = WorkbookFactory.create(fis);

        //Sheet sht=wb.getSheetAt(0);

        //Yukaridakileri bastan tanimlamaya gerek yok dosya , excel , sheet ortak ,
        //O sebeple sheet kullanilip satir ve sutun alinir ve to String ile Stringe alinacak yazdirilir

        String cell21 = sheet.getRow(1).getCell(0).toString();

        System.out.println(cell21);

        //4.satir(index 3) 2.cell’in(index 1)  London oldugunu test edelim

        String actualCell42 = sheet.getRow(3).getCell(1).toString();

        String expectedCell42="London";

        System.out.println(actualCell42);

        Assert.assertEquals(expectedCell42, actualCell42);

        //Satir sayisini yazdirin

        int satirSayisi=sheet.getLastRowNum()+1;//Burada index 0 dan baslar
                                                //O sebeple +1 eklemeliyiz

        System.out.println(satirSayisi);

        //Fiziki olarak kullanilan satir sayisini bulun

        int aktifSatirSayisi=sheet.getPhysicalNumberOfRows()+1;
        //Arada duzensiz olarak bikac satir silinmis olabilir
        //Bu method sadece aktif yazili olanlari gosterir

        System.out.println(aktifSatirSayisi);

        //Ulke isimleri ve baskentleri bir map olarak kaydedelim

        //Ulkeleri yazdirmak icin siralama su sekildedir
        //Ulke:sheet.getRow(0).getCell(0)
        //Turkey:sheet.getRow(1).getCell(0)
        //USA:sheet.getRow(2).getCell(0)
        //Burada cell hep sifir degismez ancak satirlar yani row sirali artar
        //Bu artis son elemana kadar gider
        //Yani biz ulke isimleri ve baskentleri bir map olarak kaydedebiliriz

        Map<String,String> ulkeBaskent=new LinkedHashMap<>();

        for (int i=1;i<sheet.getLastRowNum()+1;i++) {

            String ulke1=sheet.getRow(i).getCell(0).toString();

            String baskent1=sheet.getRow(i).getCell(1).toString();

            ulkeBaskent.put(ulke1,baskent1);

        }

        System.out.println("ulkeBaskent = " + ulkeBaskent);




    }


}
