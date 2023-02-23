package PageObject.BuyProduct;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OB_BP_003 extends BaseClass {
//Validate Order Summery in Checkout Correct or not.
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
    public void AddShippingAddressCorrect(){
        driver.findElement(By.id("firstNameInput")).sendKeys("FakeFirstName");
        driver.findElement(By.id("lastNameInput")).sendKeys("FakeLastName");
        driver.findElement(By.id("addressLine1Input")).sendKeys("Address");
        driver.findElement(By.id("provinceInput")).sendKeys("State");
        driver.findElement(By.id("postCodeInput")).sendKeys("154894");
    }
    public void ClickOnSubmit(){
        driver.findElement(By.id("checkout-shipping-continue")).click();
    }
    public void ValidateConfirmationMessage(String ExpectedMsg){
        String msg = driver.findElement(By.cssSelector("#confirmation-message")).getText();
        Assert.assertEquals(ExpectedMsg, msg);
    }
    public void NavigateToOrder(){
    driver.findElement(By.cssSelector(".checkoutHeader-link")).click();
    driver.findElement(By.cssSelector("a[id='orders'] strong")).click();
    }
    public void ValidateOrderIsPresentOrNot(String ExpectedText){
    String ActualText = driver.findElement(By.xpath("//span[normalize-space()='Order placed']")).getText();
    Assert.assertEquals(ExpectedText, ActualText);
    }

}
