package junitday11waits;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait01 extends TestBase {

    // driver ile site arasinda hiz farki olabilir , sayfa yuklenmeden driver elementler islem yapmaya calisabilir
    //Locate edemez isek NoSuchelemnt ya da TimeOut Exception  hatasi aliriz , syronization hatasi aliriz
    //Nosuchelemnt hatasi alirsak locate dogru mu , iframe ya da alert var mi bakariz ,bunlar yoksa bekleme yapariz
    //Java waitleri Thread.sleep asker gibi ne kadar dersek o kadar bekler
    //Selenium waitleri //Implicitly wait sayfadaki tum elemanlarin yuklenmesini bekler
                        //Explicitly wait belirli bir elemanin yuklenmesi icin bekler
                        //Fluently wait
    //wait objesi uretmek icin WebDriver dan bir obje uretip icine driver ve ne kadar beklenmeli yazariz
    //Sonra WebElement tanimlayip bu wait in until methodunu kullaniriz(18 tane methodu var)

    @Test
    public void test(){

        /*
        https://the-internet.herokuapp.com/dynamic_loading/1
        Start buttonuna tıkla
        Hello World! Yazının sitede oldugunu test et

         */

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //Start buttonuna tıkla
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));
        startButton.click();

//        //Hello World! Yazının sitede oldugunu test et
//
//        WebElement helloworld = driver.findElement(By.xpath("//div[@id='finish']//h4"));
//        Assert.assertTrue(helloworld.getText().contains("Hello World!"));

        //web element yüklenmedigi  için hata alıyoruz


        //cozum olrak expicityWait kullanıyoruz

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement helloworld=wait.until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));

        ////Hello World! Yazının sitede oldugunu test et
        Assert.assertTrue(helloworld.getText().contains("Hello World!"));

    }


}
