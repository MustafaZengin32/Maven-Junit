package junitday16webtables;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables01 extends TestBase {

    /*

        //    https://the-internet.herokuapp.com/tables
        //    Create a class: WebTables
        //    Task 1 : Table1’i print edin
        //    Task 2 : 3. Row’ datalarını print edin
        //    Task 3 : Son row daki dataları print edin
        //    Task 4 : 5. Column datalarini print edin
        //    Task 5 : Iki parametreli bir Java metot oluşturalım: printData
        //    Parameter 1 = row numarasi
        //    Parameter 2 = column numarasi
        //    printData(2,3);  => 2nd row, 3rd column daki datayı print etsin

     */

    //Exel Dokumaninin siteye dokulmus hali
    //Table larin html ile yazmanin belli bir formati var
    //Excel dokumaninin siteye konulmasi icin tr ve td mutlaka yazilmali
    //table olusturmak icin table tag ini kullaniyor , inspect yapip //table diye aratirsak tum tablolari buluruz
    // bir baslik verecek ise thead i kullanir(optional)
    //altina her satir icin tr(table rows) yazar ,
    // onun icine de sutunlar olacaksa onlarin basligi th(table header data) ile yazilir
    //Thead den sonra tbody nin altinda sutunlarin oldugu yerde tr nin altindaki td(table data cell) nin altinda olur
    //Tablolari kullanirken xpath kullaniriz cunku asagilara // ile inmemizi saglayan xpath dir.

    /*
    <table>tablo //Tablonun tag i hep table olur
	<thead>tablo header
			<tr>Satır (tablo row)
					<th> başlık sütünü
					</th>
			</tr>
	</thead>
	<tbody>tablo body
			<tr>Satır (tablo row)
					<td>Sütün (tablo data cell)
					</td>
			</tr>
	<tbody>
</table>
     */

    //Mesela sitede thead basligindaki "LastName" e ulasmak istersem table dan asagi // ile gelerek o elemente ulasirim
    //baslik icin th ler baslik sayisi kadardir , bu kisimdada index ile istedigim basliga dogru 1 den baslayip kayarim
    ////table[@id='table1']//thead//tr//th[1] bu mesela ilk elemani verir ve index 1 ise ikinci eleman ...

    //Mesela Jason icin gene table dan asagi // ile gelerek o elemente ulasirim
    //burada baslikla isim yok ayrica thead ile tbody esdeger oldugu icin direk tbody nin icine girebilirim
    //tr ile hangi satirda ise index inin secerim , daha sonra td ile hangi sutun onun icin index secerim
    ////table[@id='table1']//tbody//tr[3]//td[2]

    @Test
    public void test(){

        //Task 1 : Table1’i print edin

        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement table=driver.findElement(By.xpath("//table[@id='table1']"));

        table.getText();

        System.out.println(table.getText());//Bu sekilde String bir ifade gibi yazdirir , elemanlari ayri yazmaz
                                             //Bu sebeple biz bu webelementi list e atariz o sekilde foreach ile yazdiririz

        System.out.println("----------------------------------------------------------------------------------------");

        List<WebElement>table1=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
        //coklu elemment oldugu icin findElements
        //burada basliklar haric yazdiririz

        for (WebElement w:table1) {

            System.out.println(w.getText());
            
        }

        System.out.println("******************************************************************************************");

        //Task 2 : 3. Row’ datalarını print edin

        List<WebElement>rowThree=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]"));

        for (WebElement k :rowThree) {

            System.out.println(k.getText());

        }

        System.out.println("#########################################################################################");

        //Task 4 : 5. Column datalarini print edin

        List<WebElement>fifthColomn=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[5]"));

        for (WebElement m : fifthColomn) {

            System.out.println(m.getText());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        tableYAzdir(2,3);


        }

        public void tableYAzdir(int satir,int sutun){ //Bunlari method ile de yazdiririz

        //table[@id='table1']//tbody//tr[1]//td[5] tr ve td ye kadar hersey ayni burada degiskenler sayilar
        //row satir , data cell sutun

            WebElement istenen= driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+satir+"]"+"//td["+sutun+"]"));

            System.out.println(istenen.getText());


        }

    }








