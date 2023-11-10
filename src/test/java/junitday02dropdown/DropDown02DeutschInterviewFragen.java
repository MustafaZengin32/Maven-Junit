package junitday02dropdown;

public class DropDown02DeutschInterviewFragen {

    /*
rage 1: Wie können Sie eine Dropdown-Liste in Selenium auswählen?

Antwort: In Selenium können Sie eine Dropdown-Liste
mit der Select-Klasse auswählen. Hier ist ein Beispielcode in Java:

WebDriver driver = new ChromeDriver();
driver.get("URL_der_Seite");

WebElement dropdownElement = driver.findElement(By.id("ID_des_Dropdowns"));
Select dropdown = new Select(dropdownElement);

// Nach sichtbarem Text auswählen
dropdown.selectByVisibleText("Optionstext");

// Nach Wert auswählen
// dropdown.selectByValue("Optionenwert");

// Nach Index auswählen
// dropdown.selectByIndex(2);

Frage 2: Wie überprüfen Sie, ob eine Dropdown-Option ausgewählt ist?

Antwort: Sie können die getFirstSelectedOption()-Methode
der Select-Klasse verwenden, um die ausgewählte Option zu erhalten,
und dann deren Text, Wert oder Index überprüfen. Hier ist ein Beispiel:

WebElement dropdownElement = driver.findElement(By.id("ID_des_Dropdowns"));
Select dropdown = new Select(dropdownElement);

String selectedOptionText = dropdown.getFirstSelectedOption().getText();

// Jetzt können Sie selectedOptionText mit dem erwarteten Wert vergleichen

Frage 4: Wie behandeln Sie Dropdowns, die mit JavaScript erstellt wurden?

Antwort: Für Dropdowns, die mit JavaScript erstellt wurden,
können Sie immer noch die Select-Klasse verwenden,
solange Sie auf das entsprechende WebElement zugreifen können.
Wenn dies nicht möglich ist,
müssen Sie möglicherweise auf JavaScript-Executor zurückgreifen,
um die Dropdown-Optionen zu manipulieren.


WebElement dropdownElement = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.getElementById('ID_des_Dropdowns');");
Select dropdown = new Select(dropdownElement);

// Jetzt können Sie die Dropdown-Optionen wie gewohnt auswählen

     */
}
