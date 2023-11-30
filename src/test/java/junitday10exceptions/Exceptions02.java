package junitday10exceptions;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Exceptions02 extends TestBase {

    /*
    "facebook" sayfasına gidiniz
    Yeni hesap olustura tıklayınız (3 sn bekleyiniz)
    Sayfayı refresh() yapınız. (3 sn bekleyiniz)
    Sifremi unuttuma gidiniz (3 sn bekleyiniz)
    Geri geliniz (3 sn bekleyiniz)
    Yeni hesap olustura tıklayınız

     */

    @Test
    public void StaleElementReferenceExceptionTest01(){


        // "facebook" sayfasına gidiniz
        driver.get("https://www.facebook.com/");

        //Yeni hesap olustura tıklayınız (3 sn bekleyiniz)
        WebElement yeniHesapOlustur = driver.findElement(By.xpath("//a[@rel='async']"));

        yeniHesapOlustur.click();

        wait(3);

        //Sayfayı refresh() yapınız. (3 sn bekleyiniz)
        driver.navigate().refresh();
//        WebElement exit=driver.findElement(By.id("u_5_9_gd"));
//        exit.click();
//        driver.navigate().refresh();

        //Sifremi unuttuma gidiniz (3 sn bekleyiniz)
        WebElement sifremiUnuttum = driver.findElement(By.xpath("//a[.='Şifreni mi Unuttun?']"));

        sifremiUnuttum.click();

        wait(3);


        driver.navigate().back();

        wait(3);


        yeniHesapOlustur = driver.findElement(By.xpath("//a[@rel='async']"));

        yeniHesapOlustur.click();

        //WebElement yeniHesapOlustur = driver.findElement(By.id("u_0_5_fw"));


    }
}
