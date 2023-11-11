package junitday01AnotationsAssertations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit01 {

        //Anatation @before @after ...

        //@Test test methoduna yazilir ki run edebilelim

    @Test
    public void test00(){
        System.out.println("Deneme Test00");
    }

    @Test
    public void test001(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.google.com");


    }

    @Test
    public void test02(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.hepsiburada.com");

        driver.close();
    }


}
