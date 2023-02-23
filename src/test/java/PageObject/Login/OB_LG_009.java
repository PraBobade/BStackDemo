package PageObject.Login;

import TestCases.BaseClass;
import org.openqa.selenium.By;

public class OB_LG_009 extends BaseClass {
    public void ClickOnSignIn(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
    }

    public void ClickOnLogin() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
}
