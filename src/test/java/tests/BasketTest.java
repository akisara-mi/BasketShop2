package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTest extends BaseTest {
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.cssSelector("input[value='Log in']");
    By categoryBatton = By.xpath("//div[@class=\"listbox\"]/ul/li[2]/a");
    By accessories = By.xpath("//div[@class=\"listbox\"]/ul/li[2]/ul/li[3]/a");
    By priceOne = By.xpath("//tbody/tr[1]/td[6]");
    By priceTwo = By.xpath("//tbody/tr[2]/td[6]");
    By priceThree = By.xpath("//tbody/tr[3]/td[6]");
    By totalPrice = By.xpath("//tbody/tr[4]/td[2]");
    By logo = By.xpath("//div[@class=\"header-logo\"]/a");
    // By addToChart1 = By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/31/1/1    ');return false;\"]");
    By addToChart1 = By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/62/1/1    ');return false;\"]");
    By addToChart2 = By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/66/1/1    ');return false;\"]");
    By addToChart3 = By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/65/1/1    ');return false;\"]");

    @Test
    public void doTest() {

        typeIn(emailField, "marijavasa88@gmail.com");
        typeIn(passwordField, "Test123");
        clickOnElement(loginButton);
        clickOnElement(categoryBatton);
        clickOnElement(accessories);
        clickOnElement(addToChart1);
        clickOnElement(logo);
        clickOnElement(categoryBatton);
        clickOnElement(accessories);
        clickOnElement(addToChart2);
        clickOnElement(logo);
        clickOnElement(categoryBatton);
        clickOnElement(accessories);
        clickOnElement(addToChart3);
        clickOnElement(shoppingChart);

        String productPrice1 = getTextFromElement(priceOne);
        
        double productPriceNum1 = Double.valueOf(productPrice1);

        String productPrice2 = getTextFromElement(priceTwo);
        double productPriceNum2 = Double.valueOf(productPrice2);

        String productPrice3 = getTextFromElement(priceThree);
        double productPriceNum3 = Double.valueOf(productPrice3);

        String totalPriceOfProduct = getTextFromElement(totalPrice);
        double totalPriceSum = Double.valueOf(totalPriceOfProduct);

        Double sumProductPrice = productPriceNum1 + productPriceNum2 + productPriceNum3;
        Assert.assertEquals(sumProductPrice, totalPriceSum);
    }

}
