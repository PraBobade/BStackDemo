package PageObject.BuyProduct;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

public class OB_BP_008 extends BaseClass {
    //Validate Sending all Correct information in shipping address but send PostalCode as String.
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
    public void AddPostalCodeString(String FirstName,String LastName, String Address, String State, String PostalCode){
        driver.findElement(By.id("firstNameInput")).sendKeys(FirstName);
        driver.findElement(By.id("lastNameInput")).sendKeys(LastName);
        driver.findElement(By.id("addressLine1Input")).sendKeys(Address);
        driver.findElement(By.id("provinceInput")).sendKeys(State);
        driver.findElement(By.id("postCodeInput")).sendKeys(PostalCode); //PostalCode String (Required Number)
    }
    public void ClickOnSubmit(){
        driver.findElement(By.id("checkout-shipping-continue")).click();
    }
    public void ValidateOrderShouldNotPlace() throws InterruptedException {
        Thread.sleep(2000);
        String msg = driver.findElement(By.cssSelector("#confirmation-message")).getText();

        if (Objects.equals(msg, "Your Order has been successfully placed.")){
            Assert.fail();
        }
        else{
            Assert.assertTrue(true);
        }
    }



}
