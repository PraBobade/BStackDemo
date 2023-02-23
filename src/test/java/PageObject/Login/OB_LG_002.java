package PageObject.Login;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OB_LG_002 extends BaseClass {
    public void ClickOnSignIn(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
    }
    public void setUserName(String UName) throws InterruptedException {
        WebElement UserName = driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]"));
         }
    public void setPassword(String pass) {
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]"));
    }
    public void ClickOnLogin(){
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void ValidateErrorMessage(String ExpectedMsg){
        String ActualMsg = driver.findElement(By.cssSelector(".api-error")).getText();
        Assert.assertEquals(ExpectedMsg, ActualMsg);
    }

}
