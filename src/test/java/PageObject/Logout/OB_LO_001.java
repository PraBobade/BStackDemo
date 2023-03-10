package PageObject.Logout;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OB_LO_001 extends BaseClass {
    //Validate Functionality Of Logout Button.
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='image_not_loading_user']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void ClickOnLogoutButton(){
        driver.findElement(By.id("logout")).click();
    }
    public void ValidateUserIsLogout() throws InterruptedException {
        Thread.sleep(2000);
       boolean Result = driver.findElement(By.id("signin")).isDisplayed();
       if (Result){
           Assert.assertTrue(true);
       }
       else {
           Assert.fail();
       }
    }
}
