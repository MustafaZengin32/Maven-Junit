package junitday04BasicAuthentication;

public class BasicAuthenticaion02EnglishInterviewQuestions {

    /*

1. What is Basic Authentication and how does it work?
Answer: Basic Authentication is a simple authentication scheme where a username and password are transmitted
as a Base64-encoded string in the HTTP request header.
The header format is Authorization: Basic base64(username:password)

2. How can you use Basic Authentication in Selenium WebDriver?
Answer: Basic Authentication can be used in Selenium WebDriver
by configuring the WebDriver instance to pass the username and password in the URL.
Example:

WebDriver driver = new ChromeDriver();
String username = "yourUsername";
String password = "yourPassword";
String urlWithCredentials = "http://" + username + ":" + password + "@example.com";
driver.get(urlWithCredentials);

3. What security concerns are associated with the use of Basic Authentication?
Answer: Basic Authentication transmits the username and password in Base64-encoded form, which is susceptible to decoding.
It is recommended to use HTTPS to encrypt communication and enhance security.

4. How can you securely manage usernames and passwords in your code?
Answer: Storing usernames and passwords directly in the code is not secure. It is better to use configuration files,
environment variables, or security stores like the Java KeyStore to protect sensitive information.

5. How can you write tests that interact with an authenticated page?
Answer: You can use the Alert class in Selenium to handle the Basic Authentication pop-up. Example:


Alert alert = driver.switchTo().alert();
alert.authenticateUsing(new UserAndPassword(username, password));

6. Why is Basic Authentication not secure for
Answer: Basic Authentication transmits the username and password without encryption,
making it susceptible to interception and eavesdropping.
Without using HTTPS, it is not secure for transmitting sensitive data.

7. How can you ensure your tests remain stable if authentication details change?
Answer: It is advisable to separate authentication details from test data.
This allows you to update authentication information in a central location without modifying the test code.


     */
}
