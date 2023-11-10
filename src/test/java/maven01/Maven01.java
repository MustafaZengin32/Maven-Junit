package maven01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Maven01 {

    public static void main(String[] args) throws InterruptedException {



       //Normalde biz System.setProperty(); ve Web driver=new Chromedriver();
       //yaziyorduk ancak burada pom oldugu icin dependies den hepsini aliyor
       //Biz sadece olani yukleyecegiz

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement searchBox= driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));

        searchBox.sendKeys("Samsung s22", Keys.ENTER);

        WebElement result= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));

        String resultYazi=result.getText();  //1-16 of 93 results for "samsung s22"
                                               /*
                                                0 ==> 1-16
                                                1 ==> of
                                                2 ==> 93
                                                result
                                                for
                                                "samsung
                                                s22"
 */


        System.out.println(result.getText().split(" ")[2]);


        List<WebElement> aramaSonuclari=driver.findElements(By.xpath("//img[@data-image-source-density='1']"));

        aramaSonuclari.get(aramaSonuclari.size()-1).click();

    }

}
