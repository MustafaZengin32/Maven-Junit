package junitday06windowshandle;

public class WindowsHandle03DeutschInterviewFragen {

 /*

 Frage 1: Was ist WindowHandle in Java Selenium und wofür wird es verwendet?

Antwort: WindowHandle ist eine Methode in Selenium, die dazu dient, mit mehreren Browserfenstern oder Tabs zu interagieren.
Jedes Fenster oder Tab wird durch einen eindeutigen Bezeichner, den sogenannten "Handle", identifiziert.
Mit WindowHandle können wir zwischen verschiedenen Fenstern wechseln und Aktionen in einem bestimmten Fenster durchführen.

Frage 2: Wie können Sie alle Fensterhandles eines Browsers erhalten?

Antwort: Um alle Fensterhandles zu erhalten, verwenden wir die Methode getWindowHandles().
Diese gibt uns eine Menge von Strings zurück, die die Handles aller offenen Fenster repräsentieren.

Set<String> windowHandles = driver.getWindowHandles();

Frage 3: Wie wechseln Sie zwischen verschiedenen Fenstern?

Antwort: Um zwischen verschiedenen Fenstern zu wechseln, verwenden wir die Methode switchTo().window(handle),
wobei "handle" das spezifische Handle des Fensters ist, zu dem wir wechseln möchten.

for (String handle : driver.getWindowHandles()) {
    driver.switchTo().window(handle);
    // Hier können Aktionen im aktuellen Fenster durchgeführt werden

Frage 4: Wie können Sie prüfen, ob Sie sich im richtigen Fenster befinden?

Antwort: Sie können den Titel oder die URL des aktuellen Fensters überprüfen, um sicherzustellen, dass Sie sich im richtigen Fenster befinden.

String expectedTitle = "Erwarteter Fenstertitel";

if (driver.getTitle().equals(expectedTitle)) {
    // Sie befinden sich im richtigen Fenster
} else {
    // Wechseln Sie gegebenenfalls zum richtigen Fenster
}

Frage 5: Wie schließen Sie ein bestimmtes Fenster?

Antwort: Sie können die Methode driver.close() verwenden, um das aktuelle Fenster zu schließen.
Wenn Sie ein spezifisches Fenster schließen möchten, wechseln Sie zu diesem Fenster und verwenden Sie dann driver.close().

String windowHandle = "Handle des zu schließenden Fensters";
driver.switchTo().window(windowHandle);
driver.close();

  */


}
