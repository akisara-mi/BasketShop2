package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    WebDriver driver;
    By shoppingChart = By.xpath("//a/span[text()='Shopping cart']");

    @BeforeMethod
    public void setupMethods() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
//        driver.get("https://the-internet.herokuapp.com/login");
        driver.get("https://demowebshop.tricentis.com/login");

    }

    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    WebElement getElement(By locator){
        WebElement element = driver.findElement(locator);
        return element;
    }
    void clickOnElement(By locator){
        getElement(locator).click();
    }
    void typeIn(By locator, String input){
        getElement(locator).sendKeys(input);
    }
    String getTextFromElement(By locator){
        return getElement(locator).getText();
    }
}
