package junitday01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit03BeforeAfter {

    WebDriver driver; // eger sadece before da tanimlarsan icindekini diger methodlar goremez



    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup();

        driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01(){
        driver.get("http://www.google.com");

    }

    @Test
    public void test02(){
        driver.get("http://www.hepsiburada.com");
    }

    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void test03(){

        driver.get("https://www.trendyol.com/");
    }

}
