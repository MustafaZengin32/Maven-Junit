package junitday17excelreadwrite;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel05ReadMethod {

    @Test
    public void testRead() throws IOException {

        String path="src/test/java/Resource/takimlar.xlsx";

        FileInputStream fis=new FileInputStream(path);

        Workbook wb= WorkbookFactory.create(fis);

        //-Takim A  sutununu yazdiralim

        for (int i=0; i<wb.getSheetAt(0).getLastRowNum()+1; i++) {

            System.out.println(i+" inci Takim : " + wb.getSheetAt(0).getRow(i).getCell(1).toString());
        }



    }

}
