package junitday08actionsclass;

public class Actions06EnglishInterviewFragen {
    /*

What is the purpose of the Actions class in Selenium?

Answer: The Actions class in Selenium is used to perform complex user interactions like mouse and keyboard events,
drag-and-drop operations, and handling multiple key combinations.

How do you instantiate an object of the Actions class in Selenium using Java?

Answer: Actions actions = new Actions(driver);

Explain the difference between WebDriver and WebElement in Selenium.

Answer: WebDriver is an interface that provides methods for browser interaction,
while WebElement is a representation of an HTML element on a web page.

How can you move the mouse pointer to a specific element using the Actions class?

Answer: actions.moveToElement(webElement).perform();

What is the purpose of the contextClick() method in the Actions class?

Answer: contextClick() is used to perform a context menu click (right-click) on a specified element.

How do you simulate key press and release actions, such as pressing and releasing the Ctrl key?

Answer: actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
(Example for pressing and releasing the Ctrl key and then pressing the "a" key).
Explain the usage of sendKeys(Keys.chord()).

Answer: sendKeys(Keys.chord()) is used to perform multiple key actions simultaneously.
Example: actions.sendKeys(Keys.chord(Keys.CONTROL, "c")).perform(); for copying text.

What is the purpose of the dragAndDrop() method in the Actions class?

Answer: dragAndDrop(WebElement source, WebElement target) is used to drag an element
from its current position to another element and drop it.

How can you simulate a double-click using Selenium?

Answer: actions.doubleClick(webElement).perform();

Explain why implicit or explicit waits are important in Selenium.

Answer: Wait times are crucial to ensure that web page components are fully loaded before executing actions.
Implicit waits apply to all elements, while explicit waits can be applied specifically to certain elements.
     */


}
