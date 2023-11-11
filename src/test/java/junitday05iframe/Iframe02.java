package junitday05iframe;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Iframe02 extends TestBase {

    @Test
    public void testIframe(){

        //https://html.com/tags/iframe/ adresine gidiniz
        //Youtube videosunu oynatiniz


        driver.get("https://html.com/tags/iframe/");

        //driver.switchTo().frame(0);//kolay yol

        List<WebElement> iframe1=driver.findElements(By.xpath("//iframe"));

        driver.switchTo().frame(iframe1.get(0));

        WebElement youtubePlayButton = driver.findElement(By.xpath("(//body)[1]"));

        Assert.assertTrue(youtubePlayButton.isEnabled());

        youtubePlayButton.click();

    }


}
