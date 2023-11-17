package junitday08actionsclass;

import Utilities.TestBase;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actions04 extends TestBase {

    @Ignore
    @Test
    public void test() { //Tek method ile yapmak

         /*
         Ornek : https://jqueryui.com/droppable/ git
         Kaynak elementi, hedef elemente sürükleyiniz

        */

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        wait(2);

        WebElement kaynak = driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement hedef = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(kaynak, hedef).perform();

    }

    @Ignore
    @Test
    public void test01() { //farkli method ile yapma,ard arda methodlar

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        wait(2);

        WebElement kaynak = driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement hedef = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions = new Actions(driver);

        //tikla ve tut sonra bunu tasi
        //pespese method kullanirsan build i kullan , bu methodlarin birbirine baglanmasini saglar

        actions.clickAndHold(kaynak).moveToElement(hedef).build().perform();

    }

    @Test
    public void test02() { //farkli method ile yapma, elemnt koordinati ile yapma

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        wait(2);

        WebElement kaynak = driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement hedef = driver.findElement(By.xpath("//div[@id='droppable']"));

        Point location = hedef.getLocation();
        int x = location.getX();
        int y = location.getY();

        System.out.println(x);
        System.out.println(y);

        Actions actions = new Actions(driver);

        actions.dragAndDropBy(kaynak, 146, 18).perform(); //target in x ve y koordinati

    }
}