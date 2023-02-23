package PageObject.Add_To_Cart;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OB_AC_007 extends BaseClass {
    //Validate adding Quantity more than one in Bag using + button and remove using - button.
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
    public void AddProductQuantityInBag(){
        wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.cssSelector(".header-title"))));
        for (int i=0;i<5;i++) {
            driver.findElement(By.xpath("(//button[normalize-space()='+'])[1]")).click();
        }
    }
    public void RemoveProductQuantityInBag(){
        for (int i=0;i<3;i++) {
            driver.findElement(By.xpath("(//button[normalize-space()='-'])[1]")).click();
        }

    }
    public void ValidateQuantityIsCorrectORNot(){
        String Quantity = driver.findElement(By.cssSelector(".desc")).getText();
        System.out.println(Quantity);
        if (Quantity.contains("3")){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }
    }

}
