package junitday10fileexistdownloadupload;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class File03Upload extends TestBase {

    @Test
    public void test(){

        /*
    Ornek : http://the-internet.herokuapp.com/upload    adresine gidelim
    chooseFile butonuna basalım
    Yuklemek istediginiz dosyayi secelim.
    Upload butonuna basalim.
    "File Uploaded!" textinin goruntulendigini test edelim.

     */

        //<input id="file-upload" type="file" name="file">
        //Dosya sec bolumu inspect de bu sekilde
        //input ile baslayip type="file" ise biz bunu java selenium ile yapabiliriz
        //Bu sartlar saglanirsa biz dosya sec yerine tiklayip sendkeys ile dosya path ini yazip upload a basarsak olur

        driver.get("http://the-internet.herokuapp.com/upload");

        String yuklenecekDosya=System.getProperty("user.home")+"//Downloads//Logo.png";//Bunu onceden dosya ozelliklerden bakariz

        driver.findElement(By.id("file-upload")).sendKeys(yuklenecekDosya);

        driver.findElement(By.xpath("//input[@value='Upload']")).click();

        wait(3);

        String expected="File Uploaded!";

        String actual=driver.findElement(By.tagName("h3")).getText();

        Assert.assertEquals(expected, actual);



    }

}
