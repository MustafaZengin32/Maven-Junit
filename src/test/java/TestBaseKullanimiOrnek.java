import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class TestBaseKullanimiOrnek extends TestBase {

    @Test
    public void test01(){

        driver.get("https://www.youtube.com/");

        Assert.assertTrue(driver.getCurrentUrl().contains("youtube"));


    }




}
