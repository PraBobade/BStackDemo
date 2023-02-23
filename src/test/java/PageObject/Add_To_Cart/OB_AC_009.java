package PageObject.Add_To_Cart;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OB_AC_009 extends BaseClass {
    //Validate Orders When there is no product Buy.
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void GoToOrders(){
        driver.findElement(By.cssSelector("a[id='orders'] strong")).click();
    }
    public void ValidateProductAvailableOrNot(String ExpectedString){
        String Result = driver.findElement(By.xpath("//h2[normalize-space()='No orders found']")).getText();
        if (Result.contains(ExpectedString)){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }
}
