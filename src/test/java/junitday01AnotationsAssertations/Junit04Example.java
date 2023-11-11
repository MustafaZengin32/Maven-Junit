package junitday01AnotationsAssertations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit04Example {

    WebDriver driver;

/*
    : https://the-internet.herokuapp.com/checkboxes sayfasina gidin.
        1.Checkbox1 ve checkbox2 elementlerini locate edin.
        2.Checkbox1 seçili değilse onay kutusunu tıklayın
        3.Checkbox2 seçili değilse onay kutusunu tıklayın
     */

    @Before
    public  void setup(){

        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @After
    public  void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        Thread.sleep(3000);

        WebElement checkbox01=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        WebElement checkbox02=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        if (!checkbox01.isSelected()){
            checkbox01.click();
        }
        else
            System.out.println("Checkbox1 Zaten Secili");


        Thread.sleep(3000);


        if (!checkbox02.isSelected()){
            checkbox02.click();
        }
        else
            System.out.println("Checkbox2 Zaten Secili");


    }


}
