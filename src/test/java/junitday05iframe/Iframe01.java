package junitday05iframe;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Iframe01 extends TestBase {
    //Ic ice gecmis sayfalar demek ,arada kuyu , duvar var , iframe seklinde yazar html kodlarinda
    //sayfaninin icinde yeniden html ile baslyan bir sayfa gorunuyor
    //Selenium dogrudan goremez swisft methodu kullaniriz
    //ilk iframe degeri 0 cunku oncesi sayfanin kendisidir
    //ilk iframe e girince cikmak icin parentFrame ve en uste cikmak icinde defaultcontent methodu kullanilir.
    //Gecisler zor , siraylaa teyid ederek yap, genel cok gorunmez sayfayi yavaslatir , developer cok tercih etmez
    //Cok buyuk sayfalarda ancak denk gelebilir


    @Test
    public void test00() throws InterruptedException {

        /*
        https://the-internet.herokuapp.com/iframe sayfasına gidin :
        Baslıkta "Editor" texti var mi
        İçerdeki metinde "Your content goes here." yazısını silin
        ve İframe in içindeyim
        footer daki ‘Povered By’ yazisini varligini test edilip
         */

        driver.get("https://the-internet.herokuapp.com/iframe");

        //Thread.sleep(2000);

        String yazi="Editor";

        WebElement editor=driver.findElement(By.tagName("h3"));

        Assert.assertTrue(editor.getText().contains(yazi));

        //Thread.sleep(2000);

        //iframe olup olmadigina bakmak icin inspect ederek iframe yazip aratabiliriz
        //driver.switchTo yazinca iframe alma yollari cikar
        //bir iframe index , nameorId ya da Webelement ile alinir/
        //Index her zaman guvenilir olmayabilir ornegin reklamlar degisebilir vb.

        driver.switchTo().frame(0); // ilk iframe e git

        //Thread.sleep(2000);

        //driver.switchTo().frame("mce_0_ifr");//idorname ile iframe e girmek -alternatif yol
        //driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));//Webelement ile iframe e girmek-alternativ yol


        //driver.switchTo().parentFrame();bu sekilde bir oncekine gider
        //driver.switchTo().defaultContent();//bu sekilde en uste yani sayfaya geri gelir

        driver.findElement(By.tagName("p")).clear();

        //Thread.sleep(2000);

        driver.findElement(By.tagName("p")).sendKeys("İframe in içindeyim");

        //Thread.sleep(2000);

        driver.switchTo().parentFrame();

        //Thread.sleep(2000);

        String anasayfaYazi="Elemental Selenium";

        WebElement anasayfaYazi1=driver.findElement(By.linkText("Elemental Selenium"));

        Assert.assertTrue(anasayfaYazi1.getText().contains(anasayfaYazi));

        /*
        Test Case Fail Sebepleri

        1.Yanlis Locater Alma
        2.Wait/Syncronization
        3.Iframe vardir switch to iframe cozum
        4.Alert vardir switch to alert cozum
        5.New Window , sayfa icinde tiklanan yerde farkli bir sayfa acilmis olabilir sayfalar arasi gecis yapmak gerekir

         */


    }

}
