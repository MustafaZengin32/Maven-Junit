package junitday09fakerclass;

import Utilities.TestBase;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Faker02 extends TestBase {

    /*
    1.https://www.facebook.com/ adresine gidelim
    2.Yeni hesap olustur butonuna basalim
    3.Ad , Soyad , mail ve sifre kutularina deger yazalim ve kaydol butonuna basalim

     */

    @Test
    public void test(){

        Faker faker=new Faker();

        driver.get("https://www.facebook.com");

        wait(5);

        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();

        wait(2);

       driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();


        wait(2);

        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys(faker.name().firstName());

        wait(2);

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName());

        wait(2);


        String emailAddress = faker.internet().emailAddress();

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(emailAddress);

        wait(2);

        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(emailAddress);

        wait(2);

        driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys(faker.internet().password(8,10));

        wait(2);


        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

        wait(2);


        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        wait(2);

    }
}
