package junitday03Alert;

public class Alert02DeutschInterviewFragen {

    /*

Frage 1: Was ist ein Alert in Selenium und wie behandelt man ihn in Java?

Antwort:
Ein Alert ist ein Popup-Fenster,
das während der Ausführung eines Tests auf einer Webseite angezeigt wird.
In Selenium kann man Alerts mit der Alert-Klasse behandeln. Zum Beispiel:


// Alert initialisieren
Alert alert = driver.switchTo().alert();
oder nur driver.switchTo().alert();

// Alert akzeptieren (OK klicken)
alert.accept();

// Alert ablehnen (Abbrechen klicken)
alert.dismiss();

// Text im Alert abrufen
String alertText = alert.getText();

//Text Schreiben
alert.sendKeys();

Frage 5: Wie simuliert man das Ignorieren von JavaScript-Alerts in Selenium?

Antwort:
Man kann die UnhandledAlertException abfangen
und den Alert ignorieren, wenn er auftritt. Hier ein Beispiel:

try {
    // Aktion, die ein JavaScript-Alert auslöst
    driver.findElement(By.id("someElement")).click();
} catch (UnhandledAlertException e) {
    // JavaScript-Alert ignorieren
    Alert alert = driver.switchTo().alert();
    alert.accept();
}

Frage 2: Wie wartet man auf das Erscheinen eines Alerts,
bevor man ihn behandelt?

Antwort:
Man kann auf das Erscheinen eines Alerts warten,
indem man WebDriverWait in Kombination mit der

ExpectedConditions.alertIsPresent()

-Methode verwendet. Hier ein Beispiel:


WebDriverWait wait = new WebDriverWait(driver, 10);

wait.until(ExpectedConditions.alertIsPresent());

Alert alert = driver.switchTo().alert();
// Weitere Aktionen mit dem Alert durchführen


     */


}
