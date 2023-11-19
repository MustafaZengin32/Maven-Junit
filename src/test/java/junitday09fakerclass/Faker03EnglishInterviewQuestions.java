package junitday09fakerclass;

public class Faker03EnglishInterviewQuestions {

    /*

Question: What is the Faker library in Java?

Answer: The Faker library is an open-source Java library that provides a way to generate realistic fake data,
such as names, addresses, and other types of test data, to be used in automated tests.

Question: Why would you use the Faker library in conjunction with Selenium?

Answer: The Faker library is commonly used in Selenium tests to dynamically generate test data.
This allows for the simulation of realistic scenarios, making it easier to create automated tests
that cover a wide range of possible inputs.

Question: How do you integrate the Faker library into your Selenium tests?

Answer: The Faker library can be added to a Java project as a Maven dependency.
Once added, you can create instances of Faker and use its methods to generate random data.

// <dependency>
//     <groupId>com.github.javafaker</groupId>
//     <artifactId>javafaker</artifactId>
//     <version>1.0.2</version>
// </dependency>

// Usage in a test

Faker faker = new Faker();
String randomName = faker.name().fullName();

Question: How can you use Faker to generate random email addresses and use them in your Selenium tests?

Answer: You can use the Faker method internet().emailAddress() to generate random email addresses
and then use them in your Selenium tests, especially for input in forms.

Faker faker = new Faker();
String randomEmail = faker.internet().emailAddress();

Question: Why is the use of random test data important in automated tests?

Answer: Using random test data is important because it allows for the simulation of various test scenarios.
This ensures that the application is flexible and robust.
Random data also helps in making tests independent and repeatable.



     */

}
