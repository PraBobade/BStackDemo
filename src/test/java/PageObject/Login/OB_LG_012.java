package PageObject.Login;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OB_LG_012 extends BaseClass {
    public void ClickOnSignIn(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
    }
    public void ValidateIMGisPresentOrNot(){
        boolean result = driver.findElement(By.xpath("(//*[name()='svg'])[1]")).isDisplayed();
        Assert.assertTrue(result);
    }
}
