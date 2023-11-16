package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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

    @Ignore
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






}
