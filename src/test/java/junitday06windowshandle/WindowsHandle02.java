package junitday06windowshandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.Set;

import static Utilities.TestBase.driver;

public class WindowsHandle02 extends TestBase {

    @Test
    public  void test() throws InterruptedException {

        /*
        Amazon sayfasina git
        Url amazon iceriyor mu
        yeni pencere ac ve bestbuy sitesine git
        Title bestbuy iceriyor mu
        Ilk sayfaya don ve sayfada java arat
        Arama sonuclarinin java icerdigini test et
        yeniden bestbuy a git
        logonun gorunurlugunu test et


         */

        driver.get("https://www.amazon.com");

        Thread.sleep(1000);

        String amazonhandle=driver.getWindowHandle();

        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));

        driver.switchTo().newWindow(WindowType.WINDOW);//Bu sekilde bize yeni bir browser acacak segme degil

        //driver.switchTo().newWindow(WindowType.TAB);//burada ise yeni bos bir segme acar yanda

        driver.get("https://www.bestbuy.com");

        String besthandle=driver.getWindowHandle();

        Assert.assertTrue(driver.getTitle().contains("Best Buy"));

        Thread.sleep(1000);

        driver.switchTo().window(amazonhandle);

        WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        search.sendKeys("Java"+ Keys.ENTER);

        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText().contains("Java"));

        driver.switchTo().window(besthandle);

        Assert.assertTrue(driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed());
















    }

}
