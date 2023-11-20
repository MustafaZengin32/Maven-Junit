package junitday11waits;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Wait03 extends TestBase {

    /*

    Fluent Wait, belirli bir koşul gerçekleşene kadar belirli bir aralıkla (polling) beklemeyi sağlar.

    FluentWait sınıfı kullanılarak oluşturulur ve bekleme süresi, polling aralığı, yoksayılacak istisnalar gibi özellikler belirlenebilir.
     */

    @Test
    public void test(){

        /*
        https://the-internet.herokuapp.com/dynamic_loading/1
        Start buttonuna tıkla
        Hello World! Yazının sitede oldugunu test et

         */

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));

        startButton.click();

        //Fluent wait in farki ekstra methodlar ve surekli degil belli araliklarla kontrol

        Wait< WebDriver> fluentwait=new FluentWait<>(driver)  //farki obje olustururken sonrasi ayni
                .withTimeout(Duration.ofSeconds(20)) //max bekleme
                .pollingEvery(Duration.ofSeconds(3))//deneme sikligi
                .withMessage("Ignore Exception")//mesaj optional
                .ignoring(NoSuchElementException.class);//exp handle optional

        WebElement until = fluentwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));

        ////Hello World! Yazının sitede oldugunu test et
        Assert.assertTrue(until.getText().contains("Hello World!"));


    }

}
