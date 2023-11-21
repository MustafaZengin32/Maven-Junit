package junitday14jsexecuter;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class JsExecuter03 extends TestBase {

    //input ile basliyor ise value degerine biseyler yazabiliriz
    //sendkeys kullanamadigimiz durumlarda kullaniriz


    @Test
    public void JsExecuterTest02(){

        driver.get("https://www.obilet.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        setAttributeValueJs("origin-input","Isparta");

/*
1. Sayfa Başlığını Almak:
java
Copy code
// WebDriver nesnesini JavaScriptExecutor'a dönüştür
JavascriptExecutor js = (JavascriptExecutor) driver;

// Sayfa başlığını al
String title = (String) js.executeScript("return document.title;");
System.out.println("Sayfa Başlığı: " + title);
2. Elementin Özelliklerini Değiştirmek:
java
Copy code
// WebElement nesnesini bul
WebElement element = driver.findElement(By.id("elementId"));

// Elementin özelliklerini değiştirmek
js.executeScript("arguments[0].style.border='2px solid red'", element);
3. JavaScript Fonksiyonlarını Çağırmak:
java
Copy code
// JavaScript fonksiyonunu çağırmak
js.executeScript("myFunction();");
4. Sayfayı Aşağı Kaydırmak:
java
Copy code
// Sayfayı aşağı kaydırmak
js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
5. Elemente Odaklanmak:
java
Copy code
// Elemente odaklanmak
WebElement element = driver.findElement(By.id("elementId"));
js.executeScript("arguments[0].scrollIntoView(true);", element);
6. JavaScript ile Yeni Bir Sayfa Açmak:
java
Copy code
// Yeni bir sayfa açmak
js.executeScript("window.open('https://www.example.com','_blank');");
7. JavaScript ile Alert Kontrolü:
java
Copy code
// JavaScript ile bir alert göstermek
js.executeScript("alert('Merhaba, bu bir alert!');");


 */



    }
}
