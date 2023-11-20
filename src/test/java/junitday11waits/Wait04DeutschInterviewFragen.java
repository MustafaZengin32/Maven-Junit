package junitday11waits;

public class Wait04DeutschInterviewFragen {
    /*

 Frage: Was ist der Unterschied zwischen Implicit Wait, Explicit Wait und Fluent Wait in Selenium WebDriver?
Antwort:

Implicit Wait: Der WebDriver wartet für eine bestimmte Zeit, wenn ein Element nicht sofort gefunden wird.
Dies wird automatisch auf alle findElement- und findElements-Aufrufe angewendet.

Explicit Wait: Hier wartet der WebDriver auf das Erfüllen einer bestimmten Bedingung,
bevor er mit der Ausführung des Codes fortsetzt. Dies ermöglicht es,
auf bestimmte Ereignisse wie das Erscheinen eines Elements
oder das Erfüllen einer benutzerdefinierten Bedingung zu warten.

Fluent Wait: Dies ist eine flexible Warteoption, die auf bestimmte Bedingungen wartet,
aber auch ein Polling-Intervall und Ausnahmen berücksichtigen kann.
Es bietet mehr Kontrolle über die Wartebedingungen.

Frage: Warum verwenden Sie Implicit Wait?
Antwort:

Implicit Wait wird verwendet, um den WebDriver für eine bestimmte Zeitspanne warten zu lassen,
wenn ein Element nicht sofort gefunden wird.
Dies hilft, Probleme mit langsamen Ladezeiten oder verzögerten Elementen zu vermeiden,
da es auf alle findElement- und findElements-Aufrufe automatisch angewendet wird.

 Frage: Wann sollten Sie Explicit Wait verwenden?
Antwort:

Explicit Wait sollte verwendet werden, wenn Sie auf das Erfüllen einer bestimmten Bedingung warten möchten,
bevor Sie mit der Ausführung des Codes fortfahren. Zum Beispiel das Warten auf das Erscheinen eines bestimmten Elements,
das Klickbar-Werden eines Elements oder das Erfüllen einer benutzerdefinierten Bedingung.

Frage: Erklären Sie den Begriff "Fluent Wait" in Selenium.
Antwort:

Fluent Wait ist eine flexible Warteoption, die auf das Erfüllen einer bestimmten Bedingung wartet,
aber auch ein Polling-Intervall und Ausnahmen berücksichtigen kann.
Es bietet mehr Kontrolle über die Wartebedingungen im Vergleich zu Implicit und Explicit Wait.
Fluently Wait kann auf spezifische Anforderungen wie das Warten
auf das Erscheinen eines Elements mit einem bestimmten Text warten.

 Frage: Wie würden Sie Fluent Wait in Ihrem Selenium-Test implementieren?
Antwort:

Beispielcode für die Verwendung von Fluent Wait:

Wait<WebDriver> fluentWait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);

WebElement element = fluentWait.until(ExpectedConditions.visibilityOfElementL

     */
}
