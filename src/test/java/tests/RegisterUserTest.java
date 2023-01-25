package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterUserTest extends BaseTest {
    @BeforeClass
    public void setup() {
        System.out.println("Before class");
    }

    @Test
    public void firstTest() {

        WebElement usernameField = driver.findElement(By.id("Email"));
        usernameField.sendKeys("marijavasa88@gmail.com");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Test123");

        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log in']"));
        loginButton.click();

        WebElement loggedInText = driver.findElement(By.cssSelector(".ico-logout"));
        String newText = loggedInText.getText();
        String expectedText = "Log out";
        Assert.assertEquals(newText,expectedText);
    }
}
