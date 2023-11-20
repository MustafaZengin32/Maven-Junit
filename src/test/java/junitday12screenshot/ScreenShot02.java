package junitday12screenshot;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot02 extends TestBase {

    @Test
    public void testScreenShot1() throws IOException {

        driver.get("https://www.n11.com/");
        takeScreenShotOfPage();

    }
    @Test
    public void testScreenShot2() throws IOException {

        /*
        1.https://the-internet.herokuapp.com/
        2."Fork me on GitHub" ELEMENTİNİN GÖRÜNTÜSÜNÜ AL
         */

        driver.get("https://the-internet.herokuapp.com/");

        WebElement goruntualinanelement = driver.findElement(By.xpath("//img[@alt='Fork me on GitHub']"));

        //TakesScreenshot ts= (TakesScreenshot) driver;//Bu selenium 3 un ozelligi TakeScreenshot dan obje olusturma

        File screenshot=goruntualinanelement.getScreenshotAs(OutputType.FILE);

        String currentTime=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        String path=System.getProperty("user.dir")+"//target//EkranGoruntuleri//"+currentTime+"screenshot.png";

        File screenshot1=new File(path);

        FileUtils.copyFile(screenshot,screenshot1);

    }

    @Test
    public void testScreenShot3(){

        /*
        1.https://www.blablacar.com/ adresine git
        2.BlaBlacar Logosu ELEMENTİNİN GÖRÜNTÜSÜNÜ method ile al
         */

        driver.get("https://www.blablacar.com/");

        WebElement checkElement = driver.findElement(By.xpath("(//img[@alt='Blablacar logo'])[2]"));

        takeScreenshotOfElement(checkElement);


    }





}
