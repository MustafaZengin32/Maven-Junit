package junitday01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit05Example {

     /*
    1.Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    2.-https://www.facebook.com adresine gidin
    3.-“Yeni Hesap Oluşturun” button’una basin
    4.-“radio buttons” elementlerini locate edin
    5.-Secili degilse cinsiyet butonundan size uygun olani secin
     */

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void testRadioButtons(){

        // 2.-https://www.facebook.com adresine gidin

        driver.get("https://www.facebook.com");

        //3.-“Yeni Hesap Oluşturun” button’una basin

        WebElement yeniHesapOlustur= driver.findElement(By.xpath("//a[@rel='async']"));
        yeniHesapOlustur.click();

        //4.-“radio buttons” elementlerini locate edin //input[@value='1']

        WebElement kadin=driver.findElement(By.xpath("//input[@value='1']"));
        WebElement erkek=driver.findElement(By.xpath("//input[@value='2']"));
        WebElement ozel=driver.findElement(By.xpath("//input[@value='-1']"));

        if(!erkek.isSelected()){
            erkek.click();
        }else System.out.println("Zaten Erkek secili");
    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
