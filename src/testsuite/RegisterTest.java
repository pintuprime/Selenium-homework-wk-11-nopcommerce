package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
5. Write down the following test into ‘RegisterTest’
class
1. userShouldNavigateToRegisterPageSuccessful
ly
* click on the ‘Register’ link
* Verify the text ‘Register’
2. userSholdRegisterAccountSuccessfully *
click on the ‘Register’ link
* Select gender radio button
* Enter First name
* Enter Last name
* Select Day Month and Year
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on REGISTER button
* Verify the text 'Your registration
completed
 */

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    // Open Browser
    @Before
    public void setUP() {
        openBrowser(baseUrl);
    }
    @Test

    public void  userShouldNavigateToRegisterPageSuccessfuly() {

        // Find the Register link and click on Register link with className
        WebElement registerLink = driver.findElement(By.className("ico-register"));
        registerLink.click();
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //select radio button
        WebElement genderRadioButton = driver.findElement(By.xpath("//input[starts-with(@id, 'gender-male')]"));
        genderRadioButton.click();
        //enter first name
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.sendKeys("Ram");
        //enter last name
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.sendKeys("Patel");
        //day select
        WebElement daySelect = driver.findElement(By.name("DateOfBirthDay"));
        daySelect.sendKeys("23");
        //month select
        WebElement monthSelect = driver.findElement(By.name("DateOfBirthMonth"));
        monthSelect.sendKeys("05");
        //select year
        WebElement yearSelect = driver.findElement(By.name("DateOfBirthYear"));
        yearSelect.sendKeys("1998");
        //enter email address
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc123@gmail.com");
        //enter password
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("abc123");
        //enter confirm password
        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("abc123");
        //click register
        WebElement registerButton = driver.findElement(By.name("register-button"));
        registerButton.click();
        String expectedText = "Your registration completed";
        WebElement actualTextElement = driver.findElement(By.className("result"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText,actualText);

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
