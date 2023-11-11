package junitday03Alert;

public class Alert02EnglishInterviewQuestions {

    /*

Question 1: What is an Alert in Selenium,
and how do you handle it in Java?

Answer:
An Alert is a pop-up window that
appears during the execution of a test on a webpage.
In Selenium, you handle alerts using the Alert class. For example:


// Initialize the alert
Alert alert = driver.switchTo().alert();

// Accept the alert (click OK)
alert.accept();

// Dismiss the alert (click Cancel)
alert.dismiss();

// Get text from the alert
String alertText = alert.getText();

Question 2: How do you wait for the appearance of an alert
before handling it?

Answer:
You can wait for the appearance of an alert using
WebDriverWait in combination with the
ExpectedConditions.alertIsPresent() method. Here's an example:

WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.alertIsPresent());

Alert alert = driver.switchTo().alert();
// Perform further actions with the alert

Question 3: How can you input text into an alert?

Answer:
Typically, you cannot input text into an alert
since alerts are meant for informing the user or waiting for confirmation.
However, if the requirements demand it,
you can use JavaScript to simulate a prompt alert and input text:


Alert promptAlert = driver.switchTo().alert();
promptAlert.sendKeys("Enter text");
promptAlert.accept();

Question 4: How do you handle JavaScript alerts in Selenium?

Answer:
JavaScript alerts can be handled in the same way as regular alerts.
Here's an example:


// Click on an element that triggers a JavaScript alert
driver.findElement(By.id("someElement")).click();

// Handle the alert
Alert jsAlert = driver.switchTo().alert();
jsAlert.accept();

Question 5: How do you simulate ignoring JavaScript alerts in Selenium?

Answer:
You can catch the UnhandledAlertException and ignore the alert if it occurs. Here's an example:


try {
    // Action that triggers a JavaScript alert
    driver.findElement(By.id("someElement")).click();
} catch (UnhandledAlertException e) {
    // Ignore the JavaScript alert
    Alert alert = driver.switchTo().alert();
    alert.accept();
}

     */
}
