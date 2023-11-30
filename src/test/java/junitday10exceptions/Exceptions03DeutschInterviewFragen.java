package junitday10exceptions;

public class Exceptions03DeutschInterviewFragen {

/*
1. Frage: Was ist eine NoSuchElementException in Selenium und wie behandeln Sie sie?

Antwort: Eine NoSuchElementException tritt auf,
wenn ein Web-Element durch einen Locator nicht gefunden wird.
Dies kann durch falsche Locator-Strategien
oder wenn das Element noch nicht im DOM geladen wurde, verursacht werden.
Um sie zu behandeln, kann man Wartezeiten implementieren
oder sicherstellen, dass das Element vorhanden ist,
bevor darauf zugegriffen wird.

2. Frage: Erklären Sie die StaleElementReferenceException. Wie können Sie dieses Problem lösen?

Antwort: Eine StaleElementReferenceException tritt auf,
wenn das Web-Element nicht mehr im DOM existiert,
nachdem es gefunden wurde.
Dies kann durch Aktualisierungen der Seite
oder Änderungen am DOM verursacht werden.
Eine Lösung besteht darin, das Element erneut zu finden,
bevor darauf zugegriffen wird.

3. Frage: Was ist eine TimeoutException und wie können Sie damit umgehen?

Antwort: Die TimeoutException tritt auf,
wenn ein Timeout für eine Operation abläuft,
z. B. wenn ein Element nicht innerhalb einer bestimmten Zeitspanne
gefunden wird. Eine Lösung besteht darin, längere Wartezeiten festzulegen
oder explizite Wartebedingungen zu verwenden,
um auf das gewünschte Element zu warten.

4. Frage: Was bedeutet die ElementNotVisibleException und wie können Sie damit umgehen?

Antwort: Die ElementNotVisibleException tritt auf,
wenn ein Element zwar im DOM vorhanden ist, aber nicht sichtbar ist.
Dies kann durch CSS-Stile, JavaScript oder andere Gründe verursacht werden.
Eine mögliche Lösung besteht darin, sicherzustellen,
dass das Element vor dem Interagieren damit sichtbar und aktiviert ist.

5. Frage: Wie behandeln Sie die WebDriverException in Selenium?

Antwort: WebDriverException ist eine generische
Exception-Klasse für WebDriver-Fehler. Es ist wichtig,
den genauen Fehler zu untersuchen, der diese Ausnahme ausgelöst hat,
um eine spezifischere Lösung zu finden.
Dies kann das Überprüfen von Logmeldungen oder Debugging beinhalten,
um die genaue Ursache zu identifizieren.

6. Frage: Was ist die InvalidArgumentException in Bezug auf Selenium?

Antwort: Die InvalidArgumentException wird normalerweise ausgelöst,
wenn ungültige Argumente an eine Selenium-Methode übergeben werden.
Dies kann durch Überprüfen der Argumente und sicherstellen,
dass sie den erwarteten Typen und Werten entsprechen, vermieden werden.

Um Exceptions in Selenium zu behandeln, können verschiedene Ansätze verwendet werden. Hier ist ein einfaches Beispiel
in Java, wie man mit der NoSuchElementException umgehen kann:

public class ExceptionHandlingExample {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();


        String url = "https://example.com";

        driver.get(url);

        try {
            // Versuchen Sie, ein Element zu finden

            WebElement element = driver.findElement(By.id("exampleId"));

            // Falls das Element gefunden wurde, führen Sie die gewünschte Aktion aus

            element.click();
        } catch (org.openqa.selenium.NoSuchElementException e) {

            // Behandeln Sie die NoSuchElementException

            System.out.println("Das Element wurde nicht gefunden: " + e.getMessage());
        } finally {

            // Schließen Sie den WebDriver, unabhängig davon, ob eine Exception aufgetreten ist oder nicht

            driver.quit();
        }
    }

 */

}
