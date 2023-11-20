package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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












}
