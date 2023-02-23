package PageObject.Login;

import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class OB_LG_006 extends BaseClass {

    public void ClickOnSignIn(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
    }
    public void PressTabForUserName() throws InterruptedException {
        Thread.sleep(3000);
        act.keyDown(Keys.TAB).build().perform();
        Thread.sleep(2000);
        act.keyDown(Keys.DOWN).build().perform();Thread.sleep(2000);
        act.keyDown(Keys.ENTER).build().perform();Thread.sleep(2000);
    }
    public void PressTabForPassword() throws InterruptedException {
        act.keyDown(Keys.TAB).build().perform();Thread.sleep(2000);
        act.keyDown(Keys.DOWN).build().perform();Thread.sleep(2000);
        act.keyDown(Keys.ENTER).build().perform();Thread.sleep(2000);
    }
    public void PressEnterForLogin() throws InterruptedException {
        act.keyDown(Keys.ENTER).build().perform();Thread.sleep(2000);
}
}
