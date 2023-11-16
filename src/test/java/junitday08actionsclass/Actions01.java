package junitday08actionsclass;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class Actions01 extends TestBase {

    //Fare ve Klavye ile yapilabilecek islemler icin olusturulan class dir
    //doubleclick , drag and drop , mouse actions, pageup , pagedown , shift , arrowdown up...
    //Action class dan obje olustur , web elementi bul , islemleri bu elemnt uzerinde yap
    //actions.contextClick(element).perform
    //perform yazmadan islem gerceklesmez

    //doubleClick cift tikla
    //clickAndHold fareyi serbest birakmadan uzun tiklama
    //dragAndDrop ogeyi bir noktadan al digerine surukle ve birak
    //movetoELement fare isaretini ogenin ortasina kaydirir
    //contextClick sag tiklama

    /*
1 - https://the-internet.herokuapp.com/context_menu sitesine gidelim
2 - Cizili alan uzerinde sag clickyapalim
3 - Alert’te cikan yazinin “You selected a context menu”oldugunu Test edelim.
4 - Tamam diyerek alert’ikapatalim
5 - Elemental Selenium linkinetiklayalim
6 - Acilan sayfada h1 taginda “Elemental Selenium” yazdigini testedelim (edited)
     */

    @Test
    public void test()  {

        driver.get("https://the-internet.herokuapp.com/context_menu");

        String windowHandle1 = driver.getWindowHandle();

        WebElement rightclick=driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);//burada icine element yazmayiz driver yazariz genel olur yani
                                              //Ancak ozel islem yapilacak adimlarin icine o elementi yazariz

        actions.contextClick(rightclick).perform();

        String actualtext = driver.switchTo().alert().getText();

        String expectedtext ="You selected a context menu";

        Assert.assertEquals(expectedtext, actualtext);

        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();

        wait(3);

        List<String>aa = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(aa.get(1));

        wait(3);

       WebElement text1 = driver.findElement(By.tagName("h1"));

       String expectedtext1="Make sure your code lands";
       String actualtext1 = text1.getText();

       System.out.println(actualtext1);

       Assert.assertTrue(text1.isDisplayed());
       Assert.assertEquals(expectedtext1, actualtext1);




    }


}
