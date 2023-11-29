package junitday17excelreadwrite;

public class Excel10InterviewFragen {
    /*

    Frage 1: Wie können Sie in Java Selenium Daten aus einer Excel-Datei lesen?

Antwort:



public class ExcelReader {
    public static void main(String[] args) throws IOException {
        String filePath = "Pfad/zur/ExcelDatei.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Blatt1"); // Geben Sie den Blattnamen an

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(0); // Zugriff auf die erste Zelle in jeder Zeile
            System.out.println(cell.getStringCellValue());
        }

        workbook.close();
        fis.close();
    }
}
Frage 2: Wie schreiben Sie Daten in eine Excel-Datei mit Java Selenium?

Antwort:


public class ExcelWriter {
    public static void main(String[] args) throws IOException {
        String filePath = "Pfad/zur/ExcelDatei.xlsx";

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("NeuesBlatt");

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hallo, Welt!");

        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);

        workbook.close();
        fos.close();
    }
}
Frage 3: Wie können Sie Daten aus einer Excel-Datei lesen und sie dann in ein Webformular eingeben?

Antwort:

public class ExcelDataToWebForm {
    public static void main(String[] args) throws IOException {
        String excelPath = "Pfad/zur/ExcelDatei.xlsx";
        FileInputStream fis = new FileInputStream(excelPath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Blatt1");

        WebDriver driver = new ChromeDriver();
        driver.get("URL des Webformulars");

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(0); // Annahme: Die Daten befinden sich in der ersten Spalte der Excel-Datei

            WebElement inputField = driver.findElement(By.id("ID des Eingabefelds"));
            inputField.sendKeys(cell.getStringCellValue());
        }

        workbook.close();
        fis.close();
        driver.close();
    }
}
     */

}
