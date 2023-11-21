package junitday13extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Report01 {

    /*
       Testerlar en fazla ne yapar
       1   pozitif negatif test yazarlar
       2   Raporlama ile alakalı test execution document(testleri calıstırıp tek tek dokumante ederler)

            otomasyon uzun vadede zaman acisindan karli

            Extent Report  --> Junit    --> TestNG  -->Cucumber   (farklı fraklı frema worklarde kullanılabilir)
	*/

    /*
     Extent Reports :
            Otomasyon raporları almak icin kullanılır.
            Extent report ayrı bir API(yardımcı olan kendi basına bir yapı) dir. Extent reports seleniumin disinda da kullanilabirlar.
            Bu API dan gelen metotlar yardımıyla rapor sablonu oluşturabilir.
            3 class kullandık
                   - ExtentReports      -> sablonu olusturu
                   - ExtentHTMLReporter -> sablonu (generate eder) projeye ekler
                   - ExtentTest         -> raporlama islemini yapar. Loglari rapora yazdırir.
     */

    //    HATIRLAMAMIZ GEREKEN 3 CLASS
    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;

    @Test
    public void testExtentReports(){

        //      REPORT  PATH
    String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

    String path = System.getProperty("user.dir")+"//target//Reports//"+currentTime+"html_report.html";

       //creating HTML report in the path
    extentHtmlReporter = new ExtentHtmlReporter(path);//sablonu (generate eder) projeye ekler

        //        creating extent reports object for generating the Entire reports with configuration
        extentReports = new ExtentReports();//sablonu olusturur//veriler girerek sablonu olusturucagiz

        //       *************************************RAPORU CUSTOMIZE EDEBILIRIZ*********************
        extentReports.setSystemInfo("Test Environment","Regression");
        extentReports.setSystemInfo("Application","Infotech Academy");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Takim","Cimbom");
        extentReports.setSystemInfo("Epic","Odeme Sayfasi");
        extentReports.setSystemInfo("Sprint Numarasi","Sprint-1");
        extentReports.setSystemInfo("QA","Musti");

        //        *********************************EXTRA RAPOR ISMI VE DOCUMAN ISMI EKLEYEBILIRIZ****//Taslak Baslik vb
        extentHtmlReporter.config().setDocumentTitle("Infotech Extent Reports");
        extentHtmlReporter.config().setReportName("Regression Test Sonucu");

        //        Raporu projeme ekliyorum
        extentReports.attachReporter(extentHtmlReporter);

}
}