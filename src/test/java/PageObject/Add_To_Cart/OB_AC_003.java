package PageObject.Add_To_Cart;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

//Validate Adding more than two product to cart.
public class OB_AC_003 extends BaseClass {
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }

    public void AddFirstProductToCart(){
        driver.findElement(By.cssSelector("div[id='1'] div[class='shelf-item__buy-btn']")).click();
        driver.findElement(By.cssSelector(".float-cart__close-btn")).click();
    }
    public void AddTwoMoreProductToCart(){
        driver.findElement(By.cssSelector("div[id='2'] div[class='shelf-item__buy-btn']")).click();
        driver.findElement(By.cssSelector(".float-cart__close-btn")).click();
        driver.findElement(By.cssSelector("div[id='3'] div[class='shelf-item__buy-btn']")).click();
        driver.findElement(By.cssSelector(".float-cart__close-btn")).click();
    }
    public void ValidateTotalNumberOfProductInCart(){
        String Quantity = driver.findElement(By.cssSelector(".bag__quantity")).getText();
        if (Quantity.contains("3")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }



}
