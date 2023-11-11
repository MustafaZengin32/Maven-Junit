package junitday01AnotationsAssertations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit07Example {

    WebDriver driver;


    /*
        2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
        3) Sayfa URL’inin https://www.bestbuy.com/‘a esit oldugunu test edin
        4) titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        5) logoTest => BestBuy logosunun görüntülendigini test edin


         */

    @Before
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.bestbuy.com/");

        Thread.sleep(3000);

    }

    @Test
    public void test01(){

        String expectedUrl="https://www.bestbuy.com/";

        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test
    public void test02(){

        String unexpectedTitel="Rest";

        String actualTitle=driver.getTitle();

        Assert.assertFalse(actualTitle==unexpectedTitel);
    }

    @Test
    public void test03(){

        WebElement logo=driver.findElement(By.xpath("(//img[@class='logo'])[1]"));

        Assert.assertTrue(logo.isDisplayed());


    }


    @After
    public void tearDown() {
        driver.close();
    }


}
