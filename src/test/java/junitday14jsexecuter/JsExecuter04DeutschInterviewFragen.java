package junitday14jsexecuter;

public class JsExecuter04DeutschInterviewFragen {

    /*

Was ist der Unterschied zwischen driver.findElement und JavaScriptExecutor in Selenium?
Antwort: driver.findElement wird verwendet, um ein HTML-Element zu finden und darauf zuzugreifen,
während JavaScriptExecutor verwendet wird, um JavaScript im Browser auszuführen,
was nützlich ist, um mit JavaScript-basierten Aktionen zu interagieren oder Elemente zu manipulieren.

Wie können Sie JavaScript mit Selenium ausführen?
Antwort: JavaScript kann mithilfe des JavaScriptExecutor-Interfaces in Selenium ausgeführt werden. Zum Beispiel:


JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("alert('Hallo Welt!');");

Warum würde man JavaScriptExecutor in Selenium verwenden?
Antwort: JavaScriptExecutor wird verwendet, um JavaScript-Code direkt im Browser auszuführen.
Dies ist nützlich für Aktionen, die mit reinem Selenium schwer umsetzbar sind,
wie das Ändern von Seitenelementen dynamisch oder das Manipulieren von JavaScript-generierten Popups.

Wie scrollen Sie mit JavaScriptExecutor?
Antwort: Hier ist ein Beispiel, wie Sie mit JavaScriptExecutor nach unten scrollen können:


JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0, 500);");

Antwort : Klicken und Scroll Methoden

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement buttonElement = driver.findElement(By.id("exampleButton"));

        js.executeScript("arguments[0].click();", buttonElement);

        ************************************************************************

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(500, 0)");

        js.executeScript("window.scrollBy(0, 1000)");

        js.executeScript("document.getElementById('exampleElement').scrollIntoView();")











 */
}
