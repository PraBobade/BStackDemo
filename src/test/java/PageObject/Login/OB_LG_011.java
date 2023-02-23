package PageObject.Login;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OB_LG_011 extends BaseClass {
    // Login into the Application with blocked User.
    public void ClickOnSignIn(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
    }
    public void setUserName(String UName)  {
        WebElement UserName = driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]"));
        UserName.click();
        driver.findElement(By.xpath("//div[normalize-space()='"+UName+"']")).click();
    }
    public void setPassword(String pass) {
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='"+pass+"']")).click();
    }
    public void ClickOnLogin(){
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void ValidateErrorMessage(String ExpectedMsg){
        String ActualMsg = driver.findElement(By.cssSelector(".api-error")).getText();

        Assert.assertEquals(ExpectedMsg, ActualMsg);
    }
}
