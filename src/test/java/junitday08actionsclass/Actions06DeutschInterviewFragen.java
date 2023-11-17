package junitday08actionsclass;

public class Actions06DeutschInterviewFragen {

    /*

Was sind Actions-Klassen in Selenium und warum sind sie wichtig?

Antwort: Die Actions-Klasse in Selenium wird verwendet, um komplexe Aktionen wie das Bewegen des Mauszeigers,
das Drücken von Tasten und das Erstellen von Drag-and-Drop-Vorgängen auszuführen.
Sie sind wichtig, um fortgeschrittenere Benutzerinteraktionen zu automatisieren.

Wie erstellen Sie ein Objekt der Actions-Klasse in Selenium?

Antwort: Actions actions = new Actions(driver);

Wie können Sie den Mauszeiger zu einem bestimmten Element bewegen?

Antwort: actions.moveToElement(webElement).perform();

Was ist der Zweck von contextClick() in der Actions-Klasse?

Antwort: contextClick() wird verwendet, um einen Kontextmenü-Klick (Rechtsklick) auf ein Element auszuführen.

Wie können Sie Tastenaktionen wie Tasten drücken und loslassen simulieren?

Antwort: actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
(Beispiel für das Drücken und Loslassen der Strg-Taste und dann Drücken der Taste "a").

Antwort: sendKeys(Keys.chord()) wird verwendet, um mehrere Tastenaktionen gleichzeitig auszuführen.
Beispiel: actions.sendKeys(Keys.chord(Keys.CONTROL, "c")).perform(); für das Kopieren von Text.

Was ist die Verwendung von dragAndDrop() in der Actions-Klasse?

Antwort: dragAndDrop(WebElement source, WebElement target) wird verwendet,
um ein Element von seiner aktuellen Position zu einem anderen Element zu ziehen und abzulegen.

Wie können Sie mit Selenium einen Doppelklick simulieren?

Antwort: actions.doubleClick(webElement).perform();





     */
}
