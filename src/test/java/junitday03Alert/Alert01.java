package junitday03Alert;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert01 extends TestBase {
    //Bilgi vermek , gerceklestirme izni istemek
    //Iki tip alert var Html Alert ve JavaSkript Alert
    //Htm alert ise inspect yapilabilir , sag click yapilabilir ,extra isleme gerek yok
    //JS Alert ise inspect yapilamaz ekstra isleme ihtiyac vardir
    //1.Simple Alert Ok denilerek kapatilir
    //2.ConfirmationAlert Ok ya da Cancel secilir
    //3.Prompt Alert Bazi girdiler girilerek onay ister ,sendKeys...


    @Test
    public void test01() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsalert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

        Thread.sleep(2000);

        jsalert.click();

        Thread.sleep(2000);

        driver.switchTo().alert().accept();


        WebElement result=driver.findElement(By.xpath("//p[@id='result']"));

        Assert.assertEquals("You successfully clicked an alert",result.getText());

        Thread.sleep(2000);



    }
    @Test
    public void test02() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsconfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

        jsconfirm.click();

        Thread.sleep(2000);

        driver.switchTo().alert().dismiss();

        Assert.assertEquals("You clicked: Cancel",driver.findElement(By.xpath("//p[@id='result']")).getText());

    }

    @Test
    public void test03() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsprompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        jsprompt.click();

        Thread.sleep(2000);

        String promptyazi="Mustafa";

        driver.switchTo().alert().sendKeys(promptyazi);

        driver.switchTo().alert().accept();

        Thread.sleep(2000);

        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='result']")).getText().contains(promptyazi));

    }



}
