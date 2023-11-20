package junitday12screenshot;

import Utilities.TestBase;
import com.github.javafaker.DateAndTime;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ScreenShot01 extends TestBase {
    //Yaptigin testlerde hata bulursan bunu raporlarken ihtiyac duyulur
    //Tum ekran goruntusunu ya da belli bir Web element goruntusunu alabiliriz

    //TakeScreenshot api dan gelen getScreenshotAs methodu kullanilir
    //Sonrasinda nereye kaydedilecegini, adini , hangi durumlarda kaydedilcegini belirleyebiliriz
    //Reuasable method a ekleriz

    @Test
    public void testScreenshot() throws IOException {

        /*
        1.https://www.hepsiburada.com/ sayfasına gidin "https://www.amazon.com/"
        2.sayfanın ekran görüntüsünü alın
        3.search box bike yazın
        4.cıkan sayfada "Result for bike" yazısının var oldugunu test etsin


         */

        driver.get("https://www.hepsiburada.com/");

        TakesScreenshot ts= (TakesScreenshot) driver; //Zaten ifadeyi driver a esitledidigimiz zaman
                                                      // driver i TakeScreenshot a cast etmemizi istiyor
        File goruntu=ts.getScreenshotAs(OutputType.FILE);//goruntu kopyasi

        //getScreenshotAs metodunun aldığı parametre olan OutputType.FILE, ekran görüntüsünün bir dosya
        // olarak alınmasını sağlar. Yani, ekran görüntüsü bir dosya olarak kaydedilir ve bu dosyanın referansı
        // goruntu değişkenine atanır.

        String currentTime=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        //isim karisikligi olmasim diye ss alinan tarih gun saat saniye vb ekledik

        String kayityeri=System.getProperty("user.dir")+"//target//EkranGoruntuleri//"+currentTime+"screenshot.png";

        File ekrankayityeri=new File(kayityeri);//asil kayit yeri

        //FileUtils.copyFile// Bir dosyayi belirtilen yere kopyalar

        FileUtils.copyFile(goruntu,ekrankayityeri);
        //Kaydedilen Bu goruntuyu dosyada sag tik open in explorer yazarsak gorebiliriz

        ///search box bike yazın
        WebElement searchBox= driver.findElement(By.xpath("(//div[.='Ürün, kategori veya marka ara'])[1]"));
        searchBox.sendKeys("Bisiklet", Keys.ENTER);

        //ıkan sayfada "bisiklet ile ilgili" yazısının var oldugunu test etsin

        WebElement result = driver.findElement(By.xpath("//div[@class='Xs2_MQciV4EY5k39UPSg']//div"));

        Assert.assertTrue(result.getText().contains("bisiklet ile ilgili"));

        //Burada ekran goruntusu almak icin Tekrar Tekrar Methodlari yazmak yerine TestBase e methodlari ekleriz






    }

}
