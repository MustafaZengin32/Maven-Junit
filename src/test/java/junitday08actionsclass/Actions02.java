package junitday08actionsclass;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;

public class Actions02 extends TestBase {

    /*
        1 - Amazon home sayfasina git
        2 - Sag ust bolumde bulunan "Account & List" menüsüne git.
        3 - Acilan pencerede Account linkine tikla
        4 - Acilan sayfanin title inin Your Account icerdigini dogrula
     */

    @Test
    public void test(){

        driver.get("https://www.amazon.com/");

        wait(3);

        Actions actions=new Actions(driver);

        WebElement accountlist=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));

        WebElement account=driver.findElement(By.xpath("//span[normalize-space()='Account']"));

        actions.moveToElement(accountlist).perform();

        wait(3);

        account.click();

        Assert.assertTrue(driver.getTitle().contains("Your Account"));




    }




}
