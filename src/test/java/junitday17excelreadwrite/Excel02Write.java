package junitday17excelreadwrite;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel02Write {

    @Test
    public void test() throws IOException {

        String path="src//test//java//Resource//ornekwrite.xlsx";

        FileInputStream fis =new FileInputStream(path);

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet=wb.getSheetAt(0);

        Row row = sheet.getRow(0);

        Cell cell3=row.createCell(2);//Olmayan birsey olusturuyoruz
                                        //Hangi hucre yaziyoruz

        cell3.setCellValue("KITA");//Burada veriyi set ediyoruz


        //Burada artik yazdirmak icin output olustururuz
        FileOutputStream fileOutputStream=new FileOutputStream(path);

        //En son uzerinde calistigimiz wb a bunu yazdiririz
        wb.write(fileOutputStream);










    }


}
