package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import junitday15log4j.Log4J01TestResultLog;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public abstract class TestBase {

    //Utilities tekrar tekrar kullandigimiz seyleri koyariz
    //Defalarca ayni methodu yazmayiz
    //Test Case yazmayiz setup , teardown vb koyariz
    //Test Base class i genelde abstract yapariz
    //methodlar public ya da protected yapariz cunku surekli ulasmak isticez
    //Diger classlari TestBase e extends ederiz
    //Burada driver i static yapariz ki diger class lardan da ulasabilelim


    public static WebDriver driver ;

    @Before
    public void setUp(){

        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

    public void wait(int a){
        try {
            Thread.sleep(a*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Multiple Window
    //- windowNumber 0 dan baslar
    //- index numarasini parametre olarak alir.
    //ve o indexli pencereye gecis yapar

    public static void switchToWindow(int windowNumber){
        List<String> list=new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(list.get(windowNumber));
    }

    //SCREENSHOT

    public void takeScreenShotOfPage()  {
//        1. Take screenshot
        TakesScreenshot ts= (TakesScreenshot) driver;

        File image = ts.getScreenshotAs(OutputType.FILE);

//       2. Save screenshot

        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

//       3.Path
        String path = System.getProperty("user.dir")+"//target//EkranGoruntuleri//"+currentTime+"screenshot.png";

        File file=new File(path);

        try {
            FileUtils.copyFile(image,file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //    SCREENSHOT
    //    @params: WebElement

    public void takeScreenshotOfElement(WebElement element)  {
//        1. take screenshot
        File image = element.getScreenshotAs(OutputType.FILE);
//        2.path and save screenshot
        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        String path = System.getProperty("user.dir")+"//target//EkranGoruntuleri//"+currentTime+"screenshot.png";

        File file=new File(path);

        try {
            FileUtils.copyFile(image,file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //SCROLLINTOVIEWJS
    public void scrollIntoViewJS(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    //SAYFANIN EN ALTINA IN
    //    Bu method ile sayfanin en altina inebiliriz
    public void scrollEndJS(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript(("window.scrollTo(0,document.body.scrollHeight)"));

    }

    //JS EXECUTER ILE SAYFANIN EN USTUNE CIKMA
    public void scrollTopJS(){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript(("window.scrollTo(0,-document.body.scrollHeight)"));

    }

    //JS EXECUTER ILE ELEMANA TIKLAMA
    public void clickJs(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);
    }


    //JS EXECUTER ILE LOCATE ID OLAN WEB ELEMETE TEXT YAZDIRMA

    public void setAttributeValueJs(String id, String text){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("document.getElementById('OriginInput').setAttribute('value','Istanbul')");

        js.executeScript("document.getElementById(' "+id+" ').setAttribute('value','"+text+"')");
    }

    //JS ILE ID OLAN WEB ELEMENTIN GET VALUE ALMA (GET TEXT GIBI)

    public void getValueByJS(String idOfElement) {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        String text = js.executeScript("return document.getElementById('" + 			idOfElement + "').value").toString();
        //driver.findElementById() ==>  javascriptExecutorversiyonu
        System.out.println("Kutudaki value: " + text);
    }














}
