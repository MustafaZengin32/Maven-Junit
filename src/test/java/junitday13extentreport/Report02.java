package junitday13extentreport;

import Utilities.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Report02 extends TestBase {

    /*
    Extent Reports :
    Otomasyon raporları almak icin kullanılır.
    Extent report ayrı bir API dir. Extent reports seleniumin disindada kullanilabirlar. Bu API dan
    gelen metotlar yardımıyla rapor sablonu oluşturabilir.
            3 class kullandık
                ExtentReports -> sablonu olusturu
                ExtentHTMLReporter -> sablonu projeye ekler
                ExtentTest -> raporlama islemini yapar. Loglari rapora yazdırir.
*/

    protected static ExtentReports extentReports;//sablon

    protected static ExtentHtmlReporter extHtmlReporter;//sablonu projeye ekler

    protected static ExtentTest extentTest;//raporlama // loglari rapora yazdirma

    @Test
    public void extentReportTEst(){

        String currentTime=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        String path=System.getProperty("user.dir")+"//target//Reports//"+currentTime+"html_report.html";

        extHtmlReporter=new ExtentHtmlReporter(path);//sablonu projeye ekler// taslak sekil//ilerde baslik vb ekleyebiliriz

        extentReports=new ExtentReports(); //simdi loglari yazip duzenleriz

        //       *************************************RAPORU CUSTOMIZE EDEBILIRIZ*********************
        extentReports.setSystemInfo("Test Environment","Regression");
        extentReports.setSystemInfo("Application","New Education");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Takim","Eagles");
        extentReports.setSystemInfo("Epic","Odeme Sayfasi");
        extentReports.setSystemInfo("Sprint Numarasi","Sprint-1");
        extentReports.setSystemInfo("QA","Can");

        //        *********************************EXTRA RAPOR ISMI VE DOCUMAN ISMI EKLEYEBILIRIZ****

        extHtmlReporter.config().setDocumentTitle("Infotech Extent Reports");
        extHtmlReporter.config().setReportName("Regression Test Sonucu");

        //        Raporu projeme ekliyorum
        extentReports.attachReporter(extHtmlReporter);

        //        Extent Test objesi ni olustur
        extentTest = extentReports.createTest("Extent Report Login Test","Smoke Test Raporu");

        //        TUM AYARLAR BITTI. EXTENT TEST OBJESI ILE LOGLAMA(RAPORA YAZDIRMA) ISLEMINI YAPABILIRIM
        extentTest.pass("Kullanici ana sayfaya gider");

        /*
        extentTest.pass("PASS");
        extentTest.info("BILGILENDIRME NOTU");
        extentTest.fail("FAILED");
        extentTest.warning("UYARI MESAJI");
        extentTest.skip("ATLAMA MESAJI");
        extentTest.fatal("COKUS HATASI");
         */

        driver.get("https://infotechacademy.eu/");

        //        Contact butonuna tiklayalim ve iletisim bilgilerini dogrulayalim
        extentTest.pass("Kullanici Contact kurmak icin contact butonuna basar");

        driver.findElement(By.xpath("//a[text()='Contact']")).click();

        //        TEST BITTI
        extentTest.pass("TEST BASARIYLA GERCEKLESDI");

        //        RAPORU GOSTER. RAPORUN OLUSMASI ICIN BU ADIM ZORUNLUDUR
        extentReports.flush();

        //Rapor a sag tik open in browser chrome yaparsak raporu acar

/*
        ★ Raporlaramalari nasıl yaparsın?
            -> Manual testing yaparken elle ekran goruntusu alip work documanina eklerim. Sonra bu raporları JIRA ya user storye yüklerim
            -> Otomasyonda ise Extent Reports ile html raporlarını cikartip
            -> Extent Reports raporlari değiştirilebilir, özel proje bilgiler eklenebilir raporlardır
            -> Projemde ki raporlama sistemi, test case fail ettiginde otomatik olarak ekran goruntusunu alacak sekilde ayarladim

        ★ Extent Reports kullanmanın avantajları nelerdir? Neden Extent Reports i tercih ettiniz?
            -> Open source- Ücretsiz
            -> Farkli browserlar yada islerim sistemleriyle calisabilir
            -> Junit, testng, cucumber gibi farklı test otomasyon frameworkleriyle entegre olabilir
            -> Her bir test adimini log(rapora yazdirma) yapabiliriz
            -> Customizable-Editlenebilir(istedigimiz biligileri ekleyip cıkarabiliriz)

        ★ Extent reports ile raporlama islemi nasil gerceklesir?Bilgi verirmisiniz?
            -> Oncelikle maven projeleri icin Extent reports dependency oluşturmamız gerekmektedir
            -> Reusable classimda extent reports ile alakalı reusable metotlarım var. Bu metotlar yardımıyla raporlarım oluşuyor.
            -> 3 onemli class vardır:
                    - Extent reports
                    - Extent Html Reporter. ====>>>>>>> are user for generation the reports
                    - Extent Test
            -> Bu sınıflar yardımıyla, platform, browser, environment, tester, takim bilgileri gibi özel proje bilgileri ekleyebilirim.
            Ayrıca extent test
            -> objesi kullanarak pass, fail, skip gibi loglamalar yapabilirim.

         ★ Dependency lerini nerden alıyorsun?
            -> Şirkette internal bir repository miz var. Bu repodan ihtiyacım olacak dependencyi alıp kullanırım.
            (Suan acık kaynaktan maven repository kullanıyoruz) Mesela extentReport dependecy ihityacımız oldu
             o zaman lead e soylerim o da manegera iletir

         ★ Dependency sirket reposunda yoksa ne yapılır?
            -> Istedigim dependency icin istekde bulunuyorum. Managerlerin onayından sonra eklenen dependencyleri kullanıyorum.

     */

    }

}
