package junitday15log4j;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Log4J01TestAddProductToCart extends Log4J01TestBase{

    //Testlerimin fail olup olmadigini bir sekilde tekrar etmem gerekli




    @Test
    @Order(1)
//    @Disabled("Due to BUG-123 disabled")
    public void search_a_product(){

        WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));

        searchbox.sendKeys("Laptop"+ Keys.ENTER);

        wait(5);

        WebElement results=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));

        String expected1="Laptop";
        String actual1=results.getText();

        Assert.assertTrue(actual1.contains(expected1));
        //Amazon a git ve search box a Laptop yaz ve arat

    }

    @Test
    @Order(2)
    public void select_a_product(){

        WebElement firstLaptop=driver.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//div[@class='a-section aok-relative s-image-fixed-height']"));

        wait(3);

        WebElement addToListButton1=driver.findElement(By.xpath("//a[normalize-space()='Add to List']"));

        Assert.assertTrue(addToListButton1.isEnabled());


        //cikan ilk laptop u tikla

    }

    @Test
    @Order(3)
    public void add_product_to_cart(){

        WebElement addToListButton2=driver.findElement(By.xpath("//a[normalize-space()='Add to List']"));

        addToListButton2.click();



        //Bu laptop u cart a ekle

    }

    @Test
    @Order(4)
    public void go_to_cart(){

        WebElement signin=driver.findElement(By.xpath("//h1[normalize-space()='Sign in']"));

        String aa="Sign in";

        String actual=signin.getText();

        Assert.assertTrue(actual.contains(aa));
        //chart eklendigini kontrol et

    }
}
