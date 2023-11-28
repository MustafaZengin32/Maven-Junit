package junitday15log4j;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(Log4J01TestResultLog.class)//Bunu eklersek TestResult sinifina ulasirim , buradaki tum testler icin TestResultdaki
//methodlar kullanilir //Yukaridaki 3 unu Log4J icin yaptik

public abstract class Log4J01TestBase {

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

        driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");

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

}
