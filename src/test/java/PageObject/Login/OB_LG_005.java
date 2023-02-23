package PageObject.Login;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;


public class OB_LG_005 extends BaseClass {

    // Validate logging into the Application without providing any credentials
    public void ClickOnSignIn(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
    }

    public void ClickOnLogin(){
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void ValidateErrorMessage(String ExpectedMsg){
        String ActualMsg = driver.findElement(By.cssSelector(".api-error")).getText();

        Assert.assertEquals(ExpectedMsg, ActualMsg);
    }


}
