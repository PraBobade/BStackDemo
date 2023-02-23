package PageObject.Login;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OB_LG_007 extends BaseClass {
    // Validate E-Mail Address and Password text fields in the Login page have the placeholder text.

    public void ClickOnSignIn(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
    }
    public void validateUserNamePlaceholder(String ExpectedTxt){
       String ActualTxt = driver.findElement(By.cssSelector("div[id='username'] div[class=' css-1wa3eu0-placeholder']")).getText();
        Assert.assertEquals(ExpectedTxt, ActualTxt);
    }
    public void validatePasswordPlaceholder(String ExpectedTxt){
        String ActualTxt = driver.findElement(By.cssSelector("div[id='password'] div[class=' css-1wa3eu0-placeholder']")).getText();
        Assert.assertEquals(ExpectedTxt, ActualTxt);
    }
}
