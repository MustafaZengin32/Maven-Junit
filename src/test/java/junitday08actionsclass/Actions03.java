package junitday08actionsclass;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Actions03 extends TestBase {

    @Test
    public void test(){

        driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");

        Actions actions=new Actions(driver);

        actions.sendKeys(Keys.ARROW_DOWN).perform();//klavye asagi yukari yon tusu , arrow ufsk bir hareket yaptirir

        wait(2);

        actions.sendKeys(Keys.ARROW_DOWN).perform();//klavye asagi yukari yon tusu , arrow ufsk bir hareket yaptirir

        wait(2);

        actions.sendKeys(Keys.ARROW_DOWN).perform();//klavye asagi yukari yon tusu , arrow ufsk bir hareket yaptirir

        wait(2);

        actions.sendKeys(Keys.ARROW_DOWN).perform();//klavye asagi yukari yon tusu , arrow ufsk bir hareket yaptirir

        wait(2);



        actions.sendKeys(Keys.PAGE_DOWN).perform();//mouse ile asagi git , bu arrow dan daha buyuk hareket yapar


        wait(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();//mouse ile asagi git , bu arrow dan daha buyuk hareket yapar


        wait(2);

        actions.sendKeys(Keys.ARROW_UP).perform();//klavye asagi yukari yon tusu , arrow ufsk bir hareket yaptirir

        wait(2);

        actions.sendKeys(Keys.ARROW_UP).perform();//klavye asagi yukari yon tusu , arrow ufsk bir hareket yaptirir

        wait(2);

        actions.sendKeys(Keys.PAGE_UP).perform();//mouse ile yukari git , bu arrow dan daha buyuk hareket yapar


        wait(2);

        actions.sendKeys(Keys.PAGE_UP).perform();//mouse ile yukari git , bu arrow dan daha buyuk hareket yapar


        wait(2);

        //method ile erisilene kadar asagi indir yazilabilir

        /*while(!erisilecek.isDisplayed()){
        Actions actions1 = new Actions(driver);
        actions1.sendKeys(Keys.ARROW_DOWN).perform();}


         */

    }


}
