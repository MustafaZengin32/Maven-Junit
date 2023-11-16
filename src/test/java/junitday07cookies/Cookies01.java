package junitday07cookies;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Cookies01 extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://wwww.amazon.com");

        Thread.sleep(10000);

        Set<Cookie> allcookies = driver.manage().getCookies();

        for (Cookie w:allcookies) {

            System.out.println(w.getName());

        }

        Thread.sleep(3000);

        int cookiesSayi=allcookies.size();

        System.out.println(cookiesSayi);

        //Assert.assertTrue(cookiesSayi>3);

        //Cookies Ekleme

        Cookie favoriCookies=new Cookie("en sevdigim cookies","cikolatali");

        driver.manage().addCookie(favoriCookies);

        //COOKIES SILME

        driver.manage().deleteCookieNamed("sp-cdn");

        Thread.sleep(3000);

        for (Cookie w:allcookies) {

            System.out.println(w.getName());

        }





        //Assert.assertTrue(allcookies.size()>cookiesSayi);



    }



}
