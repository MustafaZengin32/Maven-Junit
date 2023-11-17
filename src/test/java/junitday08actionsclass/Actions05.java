package junitday08actionsclass;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Actions05 extends TestBase {

    /*
    Google a gidin https://www.google.com"
    ‘iPhone 14 plus fiyatlari’ yazdir (SHIFT TUSUNA BASILARAK)
    ‘ cok pahali!’ Yazdır (SHIFT TUSUNA BASILMAYARAK)
    Ve ENTER tusuna bas

     */

    @Test
    public void test(){
        //


        driver.get("https://www.google.com");

        wait(2);

        WebElement accept=driver.findElement(By.id("L2AGLb"));

        accept.click();

        Actions actions=new Actions(driver);

        WebElement search=driver.findElement(By.id("APjFqb"));

        actions.keyDown(search,Keys.SHIFT).perform(); //search de shift e basili tut ,bunu keyDown ile saglar

        actions.sendKeys("iPhone 14 plus fiyatlari").perform();

        actions.keyUp(search,Keys.SHIFT).perform();//search de shift i birak ,bunu keyUp ile saglar

        wait(2);

        actions.sendKeys(Keys.ENTER).perform();



}
}