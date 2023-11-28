package junitday16webtables;

public class WebTables04DeutschInterviewFragen {

    /*
Frage 1: Was ist eine Webtabelle (Web Table) und warum ist sie in Selenium wichtig?

Antwort: Eine Webtabelle ist ein HTML-Element, das zum Anzeigen von Daten in tabellarischer Form verwendet wird.
In Selenium ist es wichtig, Webtabellen zu manipulieren, um Daten zu extrahieren, zu überprüfen oder zu ändern,
die auf einer Webseite in tabellarischer Form angezeigt werden.

Frage 2: Wie können Sie auf eine Zelle in einer Webtabelle zugreifen?

Antwort: Sie können auf eine Zelle in einer Webtabelle mithilfe von XPath oder CSS-Selektoren zugreifen. Zum Beispiel:


// Mit XPath
WebElement cell = driver.findElement(By.xpath("//table[@id='tableId']/tbody/tr[2]/td[3]"));

// Mit CSS-Selektor
WebElement cell = driver.findElement(By.cssSelector("table#tableId tbody tr:nth-child(2) td:nth-child(3)"));

Frage 3: Wie können Sie alle Zeilen einer Webtabelle extrahieren?

Antwort: Sie können alle Zeilen einer Webtabelle extrahieren,
indem Sie die entsprechenden XPath- oder CSS-Selektoren verwenden und dann eine Liste von WebElements erhalten.
Zum Beispiel:

List<WebElement> rows = driver.findElements(By.xpath("//table[@id='tableId']/tbody/tr"));

Frage 4: Wie können Sie den Text aus einer bestimmten Zelle extrahieren?

Antwort: Sie können den Text aus einer bestimmten Zelle extrahieren,
indem Sie die getText()-Methode auf das entsprechende WebElement anwenden. Zum Beispiel:

String cellText = cell.getText();

Frage 5: Wie fügen Sie eine neue Zeile zu einer Webtabelle hinzu?

Antwort: Sie können eine neue Zeile zu einer Webtabelle hinzufügen,
indem Sie zuerst die Referenz zur Tabelle erhalten und
dann eine neue Zeile (<tr>) und Zellen (<td>) erstellen und hinzufügen. Zum Beispiel:

WebElement table = driver.findElement(By.id("tableId"));

WebElement newRow = table.findElement(By.tagName("tbody")).createElement("tr");

newRow.appendChild(table.findElement(By.tagName("tbody")).createElement("td").innerText("New Data"));

table.findElement(By.tagName("tbody")).appendChild(newRow);











     */
}
