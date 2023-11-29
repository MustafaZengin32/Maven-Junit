package junitday17excelreadwrite;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel04Read {

    @Test
    public void testRead() throws IOException {

        String path="src/test/java/Resource/takimlar.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fis);

        Sheet sheet= workbook.getSheetAt(0);

        Row row= sheet.getRow(3);

        Cell cell=row.getCell(2);

        String expected="Norvec";

        String actual=cell.toString();

        System.out.println(actual);

        Assert.assertEquals(expected, actual);

    }
}
