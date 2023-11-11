package junitday04BasicAuthentication;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasicAuthentication extends TestBase {

    /*
    Ornek    : https://the-internet.herokuapp.com/basic_auth sayfasina gidin asagidaki yontem ve test datalarini kullanarak authentication’i yapin
    URL      : https://username:password@URL
    Username : admin
    Password    : admin
    Basarili sekilde sayfaya girin ve ‘Congratulations!’ yasizini içerdiği doğrulayın

    https://admin:admin@the-internet.herokuapp.com/basic_auth

     */

    @Test
    public void basicAuthentication (){

        //Normalde bir web sitesine girdigimizde biz user name ve password girerek girisleri kontrol ederiz
        //Ancak bu islemi BasicAuthentication ile de yapabiiriz

        //driver.get("https://the-internet.herokuapp.com/basic_auth");
        //Normalde site adresi bu sekilde ancak yukaridaki linkin onune
        // user name ve password bilgilerini girerek de sirayla uzumca bu bilgileri girmedem de gidebiliriz
        //Bunun icin https:// den sonra usernme:password degerlerini ve @ isaretini girerek de bu islemi yapariz
        //Yani yeni limk asagidaki gibi olur:https://username:password@URL

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String basariliGiris="Congratulations!";

        WebElement congrat=driver.findElement(By.tagName("p"));

        WebElement basicAuth=driver.findElement(By.tagName("h3"));

        Assert.assertTrue(basicAuth.isDisplayed());

        Assert.assertTrue(congrat.getText().contains(basariliGiris));

    }





}
