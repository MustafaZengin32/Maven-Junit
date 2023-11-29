package junitday17excelreadwrite;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel03Write {

    @Test
    public void test() throws IOException {

        String path="src/test/java/Resource/ornekwrite.xlsx";

        FileInputStream fis=new FileInputStream(path);

        Workbook wb= WorkbookFactory.create(fis);

        Sheet sheet=wb.getSheetAt(0);

        Row row =sheet.getRow(1);

        Cell cell1=row.createCell(2);

        cell1.setCellValue("Antartika");

        FileOutputStream out = new FileOutputStream(path);

        wb.write(out);







    }
}
