package junitday11waits;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait02 extends TestBase {

    @Test
    public void test(){

        /*
        1.https://the-internet.herokuapp.com/dynamic_controls sayfasina git
        2.Enable/disable altindaki segmenin tiklanmadigini kontol et
        3.Enable butonuna bas
        4.It's enabled! yazisinin ciktigini kontrol et
        5.Enable/disable altindaki segmenin tiklandigini kontrol et
         */


        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement endistextbox=driver.findElement(By.xpath("//form[@id='input-example']//input"));

        Assert.assertFalse(endistextbox.isEnabled());

        WebElement enablebutton=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        enablebutton.click();

        WebDriverWait expwait=new WebDriverWait(driver, Duration.ofSeconds(20));

        expwait.until(ExpectedConditions.elementToBeClickable(endistextbox));

        wait(3);

        String sonyaziexpected="It's enabled!";

        String sonyaziactual=driver.findElement(By.xpath("//p[@id='message']")).getText();

        Assert.assertEquals(sonyaziexpected, sonyaziexpected);










    }
}
