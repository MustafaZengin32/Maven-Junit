package junitday02dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown01 {

    WebDriver driver;


    //acilir menuler
    //bunu tasarlamak icin developerlar select ozelligi kullanir
    //sitede cok fazla yer kaplamamasi icin tasarlanir ,
    // alt sekmeleri options dir.
    //multiple olursa coklu secme yapabiliriz
    //bu ozelligi test icin Select objesi olustururuz
    //index value visible ozelliklerinde option lari secebiliriz

    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        Thread.sleep(3000);

        //Doğum yılını ayını günün şu şekilde seçin  ==>  2015 January 11

        WebElement dropdownyear=driver.findElement(By.id("year"));

        Select year=new Select(dropdownyear);

        //year.selectByIndex(8);//select altindaki option lar 0 dan baslar ilk eleman index i 0 dir
        //year.selectByValue();////value="2023">2023< buradaki value degeri ortadakidir
        year.selectByVisibleText("2015");//value="2023">2023< burada visibale degeri en sondakidir
                                         //bazen value degerinden farkli olabilir kontrol et

        Thread.sleep(3000);

        Assert.assertEquals("2015",year.getFirstSelectedOption().getText());

        //year.getFirstSelectedOption(); //Bu islemle secilen degeri test ederiz

        WebElement dropdownmonth=driver.findElement(By.id("month"));

        //Sayet bu sekilde alamaz isek JavascriptExecutor ve executeScript ile almayi deneriz

        //WebElement dropdownmonth = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.getElementById('month');");

        Select month=new Select(dropdownmonth);

        month.selectByValue("0");

        Thread.sleep(3000);

        WebElement dropdownday=driver.findElement(By.id("day"));

        Select day=new Select(dropdownday);

        day.selectByIndex(10);

        Thread.sleep(3000);



    }

    @Ignore
    @Test
    public void test02(){

        //Select deki tum elemanlari yazdirma getoptions

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement dropdownstate=driver.findElement(By.id("state"));

        Select state=new Select(dropdownstate);

        List<WebElement> stateoptions = state.getOptions();

        for (WebElement w : stateoptions) {

            System.out.println(w.getText());
        }

        System.out.println(stateoptions.size());

    }


    @After
    public void teardown(){

        driver.close();
    }


}
