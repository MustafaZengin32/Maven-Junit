package junitday04BasicAuthentication;

public class BasicAuthenticationDeutschInterviewFragen {

    /*

1. Was ist Basic Authentication und wie funktioniert es?
Antwort: Basic Authentication ist ein einfaches Authentifizierungsschema,
bei dem Benutzername und Passwort als Base64-kodierter String im Header einer HTTP-Anfrage übertragen werden.
Der Header lautet Authorization:
Basic

base64(username:password
https://username:password@URL

2. Wie kann man Basic Authentication in Selenium WebDriver verwenden?
Antwort: Man kann Basic Authentication in Selenium WebDriver verwenden,
indem man die WebDriver-Instanz konfiguriert, um Benutzername und Passwort in der URL zu übergeben. Beispiel:


WebDriver driver = new ChromeDriver();
String username = "yourUsername";
String password = "yourPassword";
String urlWithCredentials = "http://" + username + ":" + password + "@example.com";
driver.get(urlWithCredentials);

3. Welche Sicherheitsbedenken gibt es bei der Verwendung von Basic Authentication?
Antwort: Basic Authentication überträgt Benutzername und Passwort in Base64-kodierter Form,
was leicht zu entschlüsseln ist. Es wird daher empfohlen, HTTPS zu verwenden,
um die Kommunikation zu verschlüsseln und die Sicherheit zu verbessern.

4. Wie können Sie Benutzernamen und Passwörter sicher in Ihrem Code verwalten?
Antwort: Es ist nicht sicher, Benutzernamen und Passwörter direkt im Code zu hinterlegen.
Besser ist die Verwendung von Konfigurationsdateien, Umgebungsvariablen oder Sicherheitsspeichern wie dem Java KeyStore,
um sensible Informationen zu schützen.

5. Wie können Sie Tests schreiben, die mit einer authentifizierten Seite interagieren?
Antwort: Sie können die Alert-Klasse in Selenium verwenden, um mit dem Basic Authentication-Popup umzugehen. Beispiel:


Alert alert = driver.switchTo().alert();
alert.authenticateUsing(new UserAndPassword(username, password));

6. Wie können Sie sicherstellen, dass Ihre Tests stabil bleiben, wenn sich die Authentifizierungsinformationen ändern?
Antwort: Es ist ratsam, Authentifizierungsinformationen von Testdaten zu trennen.
Dadurch können Sie die Authentifizierungsinformationen an zentraler Stelle aktualisieren,
ohne den Testcode zu ändern.





     */
}
