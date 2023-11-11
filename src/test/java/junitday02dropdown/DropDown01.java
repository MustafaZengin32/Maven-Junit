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

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }

    @Test
    public void dropDownTest01() throws InterruptedException {


        Thread.sleep(5000);
        /*
        https://testcenter.techproeducation.com/index.php?page=dropdown
        Doğum yılını ayını günün şu şekilde seçin  ==>  2015 January 11
         */

        //year ==> 2015
        //1 web element olustur
        WebElement ddYear= driver.findElement(By.id("year"));
        //2 Select class'ından ddyear web elementi ile obje olustur.
        Select yearSlct=new Select(ddYear);
        //3. yearSlct objesi ile selectByVisibleText() methodu ile dropdown sectik
        yearSlct.selectByVisibleText("2015");

        /*
        WebElement actualselectYear=yearSlct.getFirstSelectedOption();
        String actualYear=actualselectYear.getText();
        */
        String actualYear1=yearSlct.getFirstSelectedOption().getText();

        Assert.assertEquals("2015", actualYear1);

        //month ==> January
        //1 web element olustur
        WebElement month=driver.findElement(By.id("month"));
        //2 Select Class indan month web elementi ile obje olustur
        Select monthSlct=new Select(month);
        //3 monthSlct objesi selectByValue methodu ile dropdown sectik
        monthSlct.selectByValue("0");


        //day ==> 11
        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        Select daySlct=new Select(day);
        daySlct.selectByIndex(10);

    }


    @Test
    public void stateSelection(){


        WebElement state= driver.findElement(By.xpath("//select[@id='state']"));
        Select stateSlct=new Select(state);
        List<WebElement> stateOptions= stateSlct.getOptions();

        for (WebElement w : stateOptions){
            System.out.print(w.getText()+", ");
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Select a State dahil dropdown'daki Eyalet Sayisi "+stateOptions.size());
    }


    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

    public void selectDropDown(WebElement dd, String text){
        /*
         WebElement ddYear= driver.findElement(By.id("year"));
        //2 Select class'ından ddyear web elementi ile obje olustur.
        Select yearSlct=new Select(ddYear);
        //3. yearSlct objesi ile selectByVisibleText() methodu ile dropdown sectik
        yearSlct.selectByVisibleText("2015");
         */

        List <WebElement> allOptionsDD = dd.findElements(By.tagName("option"));
        for (WebElement w : allOptionsDD){
            //System.out.println(w.getText());
            if(w.getText().equals(text)){
                w.click();
                break;
            }
        }
    }

    @Test
    public void methodDenemeTesti() throws InterruptedException {

        Thread.sleep(5000);
        //State Selection
        selectDropDown(driver.findElement(By.xpath("//select[@id='state']")), "Colorado");

        //Doğum yılını ayını günün şu şekilde seçin  ==>  2015 January 12

        //year ==> 2015
        selectDropDown(driver.findElement(By.xpath("//select[@id='year']")), "2015");
        //year dropdown web elementini locate ettim , den sonra ise secmek istediğim degeri String olrak yazdım

        //ay ==> January
        selectDropDown(driver.findElement(By.id("month")),  "January");

        //gun ==> 12
        selectDropDown(driver.findElement(By.xpath("//select[@id='day']")), "12");
    }

}
