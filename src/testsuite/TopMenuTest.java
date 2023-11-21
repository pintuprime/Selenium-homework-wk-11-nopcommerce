package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
4. Write down the following test into ‘TopMenuTest’
class
1. userShouldNavigateToComputerPageSuccessfully
* click on the ‘Computers’ Tab
* Verify the text ‘Computers’
2. userShouldNavigateToElectronicsPageSuccessfully
* click on the ‘Electronics’ Tab
* Verify the text ‘Electronics’
3. userShouldNavigateToApparelPageSuccessfully
* click on the ‘Apparel’ Tab
* Verify the text ‘Apparel’ 4.
userShouldNavigateToDigitalDownloadsPageSuccessfully
* click on the ‘Digital downloads’ Tab
* Verify the text ‘Digital downloads’
5. userShouldNavigateToBooksPageSuccessfully
* click on the ‘Books’ Tab
* Verify the text ‘Books’
6. userShouldNavigateToJewelryPageSuccessfully
* click on the ‘Jewelry’ Tab
* Verify the text ‘Jewelry’
7. userShouldNavigateToGiftCardsPageSuccessfully
* click on the ‘Gift Cards’ Tab
* Verify the text ‘Gift Cards’
 */

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    // Open Browser
    @Before
    public void setUP(){
        openBrowser(baseUrl);
    }
    @Test

    public void userShouldNavigateToComputerPageSuccessfully(){

        // Find the Computer tab and click the computer tab
        WebElement computerTab = driver.findElement(By.xpath("//a[contains(text(), 'Computers')]"));
        computerTab.click();

        // Expected result
        String expectedText = "Computers";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Computers')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        // click on electronics tab
        WebElement electronicTab = driver.findElement(By.xpath("//a[contains(text(), 'Electronics')]"));
        electronicTab.click();

        // Expected result
        String expectedText = "Electronics";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Electronics')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    // Method name userShouldNavigateToApparelPageSuccessfully
    public void userShouldNavigateToApparelPageSuccessfully(){
        // click the apparel tab
        WebElement apparelTab = driver.findElement(By.xpath("//a[contains(text(), 'Apparel')]"));
        apparelTab.click();

        // Expected result
        String expectedText = "Apparel";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Apparel')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    // Method name userShouldNavigateToDigitalDownloadsPageSuccessfully
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //click the digital downloads tab
        WebElement digitalDownloadsTab = driver.findElement(By.xpath("//a[contains(text(), 'Digital downloads')]"));
        digitalDownloadsTab.click();

        // Expected result By using Assert
        String expectedText = "Digital downloads";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Digital downloads')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        // click the books tab
        WebElement booksTab = driver.findElement(By.xpath("//a[contains(text(), 'Books')]"));
        booksTab.click();

        // Expected result
        String expectedText = "Books";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Books')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test

    public void userShouldNavigateToJewelryPageSuccessfully(){
        // click the jewelry tab
        WebElement jewelryTab = driver.findElement(By.xpath("//a[contains(text(), 'Jewelry')]"));
        jewelryTab.click();

        // Expected result
        String expectedText = "Jewelry";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Jewelry')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //click the gift cards tab
        WebElement giftCardsTab = driver.findElement(By.xpath("//a[contains(text(), 'Gift Cards')]"));
        giftCardsTab.click();

        // Expected result
        String expectedText = "Gift Cards";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Gift Cards')]"));
        String actualText = actualTextElement.getText();
        Assert.assertEquals(expectedText, actualText);

    }
    @After
    public void tearDown(){
        driver.quit();
    }



}
