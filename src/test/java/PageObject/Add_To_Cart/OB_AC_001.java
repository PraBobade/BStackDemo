package PageObject.Add_To_Cart;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OB_AC_001 extends BaseClass {
    //Validate adding the product to Cart from 'Product Display' Page

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
    public void CheckProductAddedToCartOrNot(){
        boolean result = driver.findElement(By.cssSelector("div[class='float-cart__shelf-container'] div[class='shelf-item']")).isDisplayed();
        if (result){
            Assert.assertTrue(result);
        }else{
            Assert.fail();
        }
    }
}
