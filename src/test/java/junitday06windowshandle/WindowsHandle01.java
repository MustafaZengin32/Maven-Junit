package junitday06windowshandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import static Utilities.TestBase.driver;

public class WindowsHandle01 extends TestBase { //Selenium06 35.dk

    /*
        Test Case Fail Sebepleri

        1.Yanlis Locater Alma
        2.Wait/Syncronization
        3.Iframe vardir switch to iframe cozum
        4.Alert vardir switch to alert cozum
        5.New Window , sayfa icinde tiklanan yerde farkli bir sayfa acilmis olabilir sayfalar arasi gecis yapmak gerekir

     */

    //Her pencerenin bir handle degeri vardir , gecis yapmak icin switch to methodu kullanilir

    //driver.getWindowHandle(); //String icinde bulundugunun sayfanin handle degeri
    //driver.getWindowHandles()//Set<String> birden cok sayfa oldugunda

    //driver.switchTo().window();//Name or handle degeri //yazdigimiz sayfaya gecis icin kullanilir



    @Test
    public void test() throws InterruptedException {

        /*
        https://www.the-internet.herokuapp.com/windows adresine gidin.
        Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        Click Here butonuna basın.
        Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        Sayfadaki textin “New Window” olduğunu doğrulayın.
        Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu  doğrulayın.

         */

        driver.get("https://the-internet.herokuapp.com/windows");

        String expectedOpenwindow="Opening a new window";

        WebElement actualOpenwindow=driver.findElement(By.tagName("h3"));

        String firstPage=driver.getWindowHandle();

        Assert.assertEquals(expectedOpenwindow, actualOpenwindow.getText());

        Assert.assertEquals("The Internet", driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();

        Thread.sleep(3000);

        //Burada yeni sayfayi acmasina ragmen driver eski sekmede kalir

        //Biz komut vererek gecirmemiz gerekir- switch to



        Set<String> twoPageHandle=driver.getWindowHandles();

        for (String w:twoPageHandle) {

            if (!firstPage.equals(w)){
                driver.switchTo().window(w);
                break;
            }
        }

        //Yukarida artik driver im da ikinci segmede , simdi ikinci segme icin dogrulamami yapabilirim

        Thread.sleep(3000);

        String yenitext=driver.findElement(By.tagName("h3")).getText();

        System.out.println(yenitext);

        Assert.assertEquals("New Window",yenitext);

        driver.switchTo().window(firstPage);//Burada tekrar ilk sayfaya geri dondum

        Assert.assertEquals("The Internet",driver.getTitle());



    }

}
