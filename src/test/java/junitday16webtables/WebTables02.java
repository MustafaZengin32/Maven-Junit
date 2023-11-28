package junitday16webtables;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTables02 extends TestBase {

    /* 1.https://www.amazon.com anasayfaya gidin
       2.en altdaki web table'dan home service secenegini tiklayin
       3.ilgili sayfaya gittigini test edin
       4. tum tablo body'sinde care kelimesi gecmedigini test edin
     */

    @Test
    public void test(){
        //1.https://www.amazon.com anasayfaya gidin

        driver.navigate().to("https://www.amazon.com");

        //2.En altdaki web table'dan home service secenegini tiklayin

        driver.findElement(By.xpath("//table//tbody//tr[3]//td[5]")).click();

        wait(3);

        //3.Ilgili sayfaya gittigini test edin

        String expected="Home";

        WebElement actual = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base apb-browse-refinements-indent-1 a-text-bold']"));

        Assert.assertTrue(actual.isEnabled());

        driver.navigate().back();

        wait(3);

        //4.Tum tablo body'sinde care kelimesi gecmedigini test edin

        String aa=driver.findElement(By.xpath("//table//tbody")).getText();

        Assert.assertFalse(aa.contains("care"));










    }
}
