package junitday17excelreadwrite;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel09Delete {

    @Test
    public void test() throws IOException {
        //- Dosya yolunu bir String degiskene atayalim

        String excel="src//test//java/Resource//takimlar.xlsx";

        //- FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim

        FileInputStream fis=new FileInputStream(excel);

        // - Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim

        Workbook workbook= WorkbookFactory.create(fis);

        //- Sheet objesi olusturun

        Sheet sheet=workbook.getSheet("Sayfa1");

        //- Row objesi olusturun

        Row row=sheet.getRow(8);

        //- Cell objesi olusturun

        Cell cell=row.getCell(4);

        //-8. Satır 4. Cell'deki veriyi silelim

        row.removeCell(cell);

        FileOutputStream fileOutputStream=new FileOutputStream(excel);

        workbook.write(fileOutputStream);
    }

}
