package junitday10fileexistdownloadupload;

public class File04DeutschInterviewFragen {
    /*

Frage: Wie laden Sie eine Datei mit Selenium hoch?

Antwort: Sie können dies durch Senden des Dateipfads an das Eingabefeld des Dateiuploads erreichen. Hier ist ein Beispiel:

WebElement uploadInput = driver.findElement(By.id("fileUploadInput"));

String filePath = "Pfad/zur/Datei/testdatei.txt";

uploadInput.sendKeys(filePath);

Frage: Wie können Sie mit Selenium eine Datei herunterladen?

Antwort: Selenium selbst kann keine Dateien herunterladen.
Sie können jedoch den Pfad des Download-Ordners in Ihrem Browser steuern, um sicherzustellen,
dass die Datei an den gewünschten Ort heruntergeladen wird. Beispiel für Chrome:


ChromeOptions options = new ChromeOptions();

String downloadPath = "/Pfad/zum/Download/Ordner";

options.addArguments(downloadPath);

WebDriver driver = new ChromeDriver(options);


Frage: Wie können Sie mit Selenium den Download einer Datei überwachen?

Antwort: Sie können auf den Download-Ordner zugreifen und überprüfen,
ob die Datei heruntergeladen wurde. Beachten Sie jedoch, dass dies browserabhängig ist.
Hier ist ein Beispiel für Chrome:

// Warte auf das Herunterladen der Datei (nehmen Sie an, dass es einige Zeit dauert)
Thread.sleep(5000);

// Überprüfen Sie, ob die Datei im Download-Ordner vorhanden ist
File downloadedFile = new File("/Pfad/zum/Download/Ordner/testdatei.txt");

if (downloadedFile.exists()) {
    System.out.println("Die Datei wurde erfolgreich heruntergeladen.");
} else {
    System.out.println("Fehler beim Herunterladen der Datei.");
}




     */
}
