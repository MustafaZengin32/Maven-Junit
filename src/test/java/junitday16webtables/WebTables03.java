package junitday16webtables;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables03 extends TestBase {

    /* 1.https://www.amazon.com anasayfaya gidin

     2.En alttaki web table'da 10 satir oldugunu test edin

     3.Sutun sayisinin 14 oldugunu test edin

     4. 3. sutunu yazdirin

     5. 5.satiri yazdirin

     6. 3.satir, 5.sutundaki basligin Home Service oldugunu test edin

     7. Satir ve sutun degerlerini verdigimizde tablodaki o bolumu yazdiracak bir method olusturun

         */

    @Test
    public void test(){
       //1.https://www.amazon.com anasayfaya gidin

        driver.get("https://www.amazon.com");

        //2.En alttaki web table'da 7 satir oldugunu test edin

        List<WebElement>tabloSize=driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']//tr"));

        Assert.assertTrue(tabloSize.size()==7);

        //3.Sutun sayisinin 4 oldugunu test edin

        List<WebElement>ucuncuSutun=driver.findElements(By.xpath(" //table[@class='navFooterMoreOnAmazon']//tbody//tr//td[3]"));

        Assert.assertTrue(ucuncuSutun.size()==4);

        //4. 3. sutunu yazdirin

        for (WebElement w:ucuncuSutun) {

            System.out.println(w.getText());

        }

        System.out.println("=========================================================================================");

        //5. 5.satiri yazdirin

        List<WebElement> besinciSatirDataListesi = driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']//tbody//tr[5]"));
        for (WebElement each: besinciSatirDataListesi
        ) {
            System.out.println(each.getText());
        }

        System.out.println("=========================================================================================");

        //6. 3.satir, 5.sutundaki basligin Home Service oldugunu test edin

        WebElement ucuncuSatirBesinciSutun= driver.findElement(By.xpath("//table//tr[3]/td[5]"));

        String expectedIcerik="Home Service";

        String actualData=ucuncuSatirBesinciSutun.getText();

        Assert.assertTrue(actualData.contains(expectedIcerik));

        System.out.println("=========================================================================================");

        //7. Satir ve sutun degerlerini verdigimizde tablodaki o bolumu yazdiracak bir method olusturun

        wait(5);

        dataYazdir(1,   1);

        wait(5);
    }

    public  void dataYazdir(int satir , int sutun){

        String dataXpathi= "//table[@class='navFooterMoreOnAmazon']//tbody//tr["+satir+"]//td["+sutun+"]";


        WebElement arananData= driver.findElement(By.xpath(dataXpathi));

        System.out.println(arananData.getText());


    }

}
