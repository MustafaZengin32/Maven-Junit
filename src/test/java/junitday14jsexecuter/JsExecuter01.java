package junitday14jsexecuter;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.Duration;

public class JsExecuter01 extends TestBase {

    //JS Executer js kodlarini java framework de kullanabilmek icin selenium dan gelen bir API dir
    //Selenium java bazen yetersi kalabilir
    //click, belirli bir elemente scroll etme, type , input dgerelrini okuma ,hiden elementlere ulasma vb
    //js html kodlara direk erisip yonetebilir

    /*

     JavascriptExecutor js = (JavascriptExecutor) driver;

     WebElement sellElementi=driver.findElement(By.xpath(""));

     //click methodu ile istedigimiz elemente click yapariz
     js.executeScript("arguments[0].click;", sellElementi,payelent...);//payelement arguments[1]

     //scrollIntoView(true) methodu ile istedigimiz element gorunur olana  kadar scroll yapariz
     js.executeScript("arguments[0].scrollIntoView(true);", sellElementi);

     */

    /*

    /*
        ★What is JS Executor?
            Javascript Executor javascript kodlarini java frameworkinde kullanabilmek icin oluşturulan bir API dir.
            Bu API seleniumda gelir.

        ★Why you are learning javascript executor?
            Selenium ile web elementlerinin kontrollerini sağlarken selenium komutları yetersiz kalabilir veya sorunlarla
            karşılaşabiliriz. Bu sun da JS Executor kullanabiliriz. Click, belirli bir elemente scroll etme, type, input daki
            degerleri okuma… gibi çok farklı sekillerde islem yapılabilir.
            JavaScript HTML kodlara direk erişip yönetebilen bir script dili olduğundan bize çok fazla kolaylık sağlayabilir.

        ★What we can do with JS executor?
            Click. Hidden elementlere tiklama (SAYFADA SAKLI OLAN ELEMENTLER)
            Belirli elementlerin uzerine gitme, yada saga, sola, asagi ya, yukarıya scroll etme
            Input lara yazı yazma
            Input lara deger atama
            Elementlerin renklerini değiştirme, arka rengini değiştirme, border(çerçeve) ekleme


        1.Adim : JavascriptExecutor kullanmak icin ilk adim olarak driver’imizi JavascriptExecutor’a cast edelim
        JavascriptExecutor js = (JavascriptExecutor)driver;

        2.Adim : Kullanacagimiz WebElement’I locate edelim
        WebElement sellElementi = driver.findElement(By.xpath("//a[text()='Sell']"));

        3.Adim : Js driver ile executeScript method’unu calistiralim, icine parameter olarak ilgili script ve webelemnt’I yazalim
        js.executeScript(scrip:"ilgili Script", WebElement);

        Ornegin Sell elementine click yapmak icin
        js.executeScript(scrip:"arguments[0].click", sellElementi, payelement, ...); //birden fazla elemet olabilir hangisi
                                                           ^             ^           //ile islem yapacagımıza arguments[index] karar veriyoruz
                                arguments[0] --------------'             |
                                arguments[1] ----------------------------'

     */



    @Test
    public void JsExecuterTest01() throws IOException {


        /*
        https://www.isbank.com.tr/ git
        İş Bankası Döviz Kurları gorunur olana kadar in ve ekran goruntusu al
        Kampanyalara görünür olana kadar asağı in ve ekran goruntusunu al

         */

        driver.get(" https://www.isbank.com.tr/");


        //JavascriptExecutor ,'dan js objesini olusturduk
        JavascriptExecutor js=(JavascriptExecutor)driver;


        //işlem yapacagımız web elementi locat ettik
        WebElement dovizKurlari= driver.findElement(By.xpath("//h3[.=' İş Bankası Döviz Kurları']"));

        wait(3);
        //

        js.executeScript("arguments[0].scrollIntoView(true)",dovizKurlari);

        wait(3);
        takeScreenShotOfPage();


        WebElement kampanyalar= driver.findElement(By.xpath("(//a[.='Kampanyalar'])[3]"));

        js.executeScript("arguments[1].scrollIntoView(true)", dovizKurlari,kampanyalar);

        wait(3);

        takeScreenshotOfElement(kampanyalar);

    }

    @Test
    public void JsExecuter01() throws IOException {

        WebElement dovizKurlari= driver.findElement(By.xpath("//h3[.=' İş Bankası Döviz Kurları']"));

        wait(3);

        scrollIntoViewJS(dovizKurlari);

        wait(3);
    }
    @Test
    public void JsExecuter02(){
        driver.get(" https://www.isbank.com.tr/");

        wait(1);

        scrollEndJS();

        wait(3);

        scrollTopJS();

        wait(3);
    }

    @Test
    public void JsExecuter03(){
        driver.get(" https://www.isbank.com.tr/");


        WebElement kampanyalar = driver.findElement(By.xpath("(//a[.='Kampanyalar'])[3]"));

        scrollIntoViewJS(kampanyalar);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        wait(2);
        //js.executeScript("arguments[0].click;", kampanyalar);

        clickJs(kampanyalar);

        // js.executeScript("arguments[0].click();",element);
        wait(3);


    }


}



