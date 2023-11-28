package junitday16webtables;

public class WebTables04EnglishInterviewQuestions {
    /*

1. How do you locate a table using Selenium WebDriver?


WebElement table = driver.findElement(By.tagName("table"));

2. How do you get the total number of rows in a table?

List<WebElement> rows = table.findElements(By.tagName("tr"));
int rowCount = rows.size();

3. How can you get the total number of columns in a table?


List<WebElement> columns = table.findElements(By.tagName("td")); // Assuming data is in <td> elements
int columnCount = columns.size();

4. How do you get the text from a specific cell in a table?

WebElement cell = table.findElement(By.xpath("//tr[1]/td[1]")); // Example: First row, first column
String cellText = cell.getText();

5. How can you iterate through all the rows in a table and print the text of each cell?


List<WebElement> rows = table.findElements(By.tagName("tr"));

for (WebElement row : rows) {

    List<WebElement> cells = row.findElements(By.tagName("td"));

    for (WebElement cell : cells) {
        System.out.print(cell.getText() + "\t");
    }

    System.out.println();
}




     */
}
