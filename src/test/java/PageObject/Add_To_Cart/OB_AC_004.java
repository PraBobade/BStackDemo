package PageObject.Add_To_Cart;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

//Validate Bag is open or not when product is added to cart.
public class OB_AC_004 extends BaseClass {

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
    public void CheckBagIsOpenORNot()  {
        wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.cssSelector(".header-title"))));
       boolean Result = driver.findElement(By.cssSelector(".header-title")).isDisplayed();

       if (Result){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }


}
