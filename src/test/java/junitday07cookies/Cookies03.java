package junitday07cookies;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class Cookies03 extends TestBase {

    @Test
    public void test01() {

        driver.get("https://www.youtube.com");

        wait(5);

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        WebElement aa = driver.findElement(By.xpath("//*[text()='Accept all']"));

        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        WebElement targetElement = null;

        while (targetElement == null) {
            // Sayfa sonuna kadar scroll yap
            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

            // Elementi bulma denemesi
            try {
                targetElement = aa; // Hedef elementin ID'sini değiştirin
            } catch (org.openqa.selenium.NoSuchElementException e) {
                // Element bulunamazsa devam et
            }

            wait(5000);
        }



            targetElement.click();


            Set<Cookie> cookiesSeti = driver.manage().getCookies();

            for (Cookie eachCookie : cookiesSeti
            ) {
                System.out.println(eachCookie);
            }

            System.out.println("==========");

            Cookie cookie = new Cookie("en guzel cookie", "bizim cookie");
            driver.manage().addCookie(cookie);

            cookiesSeti = driver.manage().getCookies();

            for (Cookie eachCookie : cookiesSeti
            ) {
                System.out.println(eachCookie);
            }

            wait(3);
        }
    }

