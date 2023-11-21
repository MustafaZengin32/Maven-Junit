package junitday13extentreport;

import Utilities.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Report03 extends TestBase {


    protected static ExtentReports extentReports;

    protected static ExtentHtmlReporter extentHtmlReporter;

    protected static ExtentTest extentTest;


    @Test
    public void test(){

        String currentTime=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        String path=System.getProperty("user.dir")+"//target//Reports//"+currentTime+"html_report.html";

        extentHtmlReporter=new ExtentHtmlReporter(path);

        extentReports=new ExtentReports();

        extentReports.setSystemInfo("Test Environment","Regression");
        extentReports.setSystemInfo("Application","New Education");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Takim","Eagles");
        extentReports.setSystemInfo("Epic","Odeme Sayfasi");
        extentReports.setSystemInfo("Sprint Numarasi","Sprint-1");
        extentReports.setSystemInfo("QA","Can");

        extentHtmlReporter.config().setReportName("Yeni bir Rapor");
        extentHtmlReporter.config().setDocumentTitle("Sahane");

        extentReports.attachReporter(extentHtmlReporter);

        extentTest=extentReports.createTest("Extent Report Login Test","Smoke Test Raporu");

        extentTest.pass("Kullanici ana sayfaya gider");

        driver.get("https://infotechacademy.eu/");

        //        Contact butonuna tiklayalim ve iletisim bilgilerini dogrulayalim
        extentTest.pass("Kullanici Contact kurmak icin contact butonuna basar");

        driver.findElement(By.xpath("//a[text()='Contact']")).click();

        //        TEST BITTI
        extentTest.pass("TEST BASARIYLA GERCEKLESDI");

        //        RAPORU GOSTER. RAPORUN OLUSMASI ICIN BU ADIM ZORUNLUDUR
        extentReports.flush();

    }
}
