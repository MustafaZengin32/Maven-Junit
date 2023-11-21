package junitday14jsexecuter;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsExecuter02 extends TestBase {

    @Test
    public void test(){

        /* 1.https://www.amazon.com anasayfaya gidelim
           2.sell butonuna Js executor ile basalim

         */

        driver.get("https://www.amazon.com");

        WebElement careers=driver.findElement(By.xpath("//a[text()='Careers']"));

        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true);",careers);

        wait(3);

        js.executeScript("arguments[0].click();",careers);


    }
}
