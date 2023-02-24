package PageObject.BuyProduct;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OB_BP_016 extends BaseClass {
    //Validate after buy product there is no product in Bag
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='image_not_loading_user']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void AddProductToCart(){
        driver.findElement(By.cssSelector("div[id='1'] div[class='shelf-item__buy-btn']")).click();
    }
    public void ClickOnCheckOutOption(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".buy-btn"))));
        driver.findElement(By.cssSelector(".buy-btn")).click();
    }
    public void AddShippingAddressDetails(String FirstName,String LastName, String Address, String State, String PostalCode){
        driver.findElement(By.id("firstNameInput")).sendKeys(FirstName);
        driver.findElement(By.id("lastNameInput")).sendKeys(LastName);
        driver.findElement(By.id("addressLine1Input")).sendKeys(Address);
        driver.findElement(By.id("provinceInput")).sendKeys(State);
        driver.findElement(By.id("postCodeInput")).sendKeys(PostalCode); //PostalCode String (Required Number)
    }
    public void ClickOnSubmit(){
        driver.findElement(By.id("checkout-shipping-continue")).click();
    }
    public void ClickOnContinueShoppingOption(){
        driver.findElement(By.cssSelector(".button.button--tertiary.optimizedCheckout-buttonSecondary")).click();
    }
    public void NavigateToBagSection(){
        driver.findElement(By.cssSelector("span[class='bag bag--float-cart-closed'] span[class='bag__quantity']")).click();
    }
    public void ValidateProductIsAvailableOrNot(){
        String result = driver.findElement(By.cssSelector(".buy-btn")).getText();
        Assert.assertEquals("CONTINUE SHOPPING", result);
    }

}
