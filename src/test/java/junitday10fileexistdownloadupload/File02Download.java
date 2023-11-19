package junitday10fileexistdownloadupload;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class File02Download extends TestBase {

    @Test
    public void test(){

        /*
    Ornek : https://testcenter.techproeducation.com/index.php?page=file-download
    ../download/b10 all test cases, code.docx     indirin
    Dosyanın indiğini kontrol edin

     */

        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        driver.findElement(By.xpath("//a[text()='b10 all test cases, code.docx']")).click();

        wait(3);

        String home=System.getProperty("user.home");

        String dosyaPath=home+"//Downloads//b10 all test cases, code.docx";

        System.out.println(Files.exists(Paths.get(dosyaPath)));

        Assert.assertTrue(Files.exists(Paths.get(dosyaPath)));

    }
}
