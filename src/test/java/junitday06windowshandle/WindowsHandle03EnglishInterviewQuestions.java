package junitday06windowshandle;

public class WindowsHandle03EnglishInterviewQuestions {

/*

Question 1: What is WindowHandle in Java Selenium, and what is its use?

Answer: WindowHandle is a method in Selenium used to interact with multiple browser windows or tabs.
Each window or tab is identified by a unique identifier called a "handle."
WindowHandle allows us to switch between different windows and perform actions in a specific window.

Question 2: How can you retrieve all window handles of a browser?

Answer: To retrieve all window handles, we use the getWindowHandles() method.
This method returns a set of strings representing the handles of all open windows.

Set<String> windowHandles = driver.getWindowHandles();

Question 3: How do you switch between different windows?

Answer: To switch between different windows, we use the switchTo().window(handle) method,
where "handle" is the specific handle of the window we want to switch to.

for (String handle : driver.getWindowHandles()) {
    driver.switchTo().window(handle);
    // Actions can be performed in the current window here
}

Question 4: How can you check if you are in the correct window?

Answer: You can check the title or URL of the current window to ensure you are in the correct window.


String expectedTitle = "Expected Window Title";

if (driver.getTitle().equals(expectedTitle)) {
    // You are in the correct window
} else {
    // Switch to the correct window if needed
}

Question 5: How do you close a specific window?

Answer: You can use the driver.close() method to close the current window.
If you want to close a specific window, switch to that window and then use driver.close().

String windowHandle = "Handle of the window to be closed";

driver.switchTo().window(windowHandle);

driver.close();

 */
}
