package PageObject.Add_To_Cart;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


//Validate CheckOut Option is present or not in BAG.
public class OB_AC_010 extends BaseClass {
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void AddProductToCart(){
        driver.findElement(By.cssSelector("div[id='1'] div[class='shelf-item__buy-btn']")).click();
    }
    public void ValidateCheckoutOptionIsPresentOrNot(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".header-title"))));
        boolean Result = driver.findElement(By.cssSelector(".buy-btn")).isDisplayed();

        if (Result){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }

}
