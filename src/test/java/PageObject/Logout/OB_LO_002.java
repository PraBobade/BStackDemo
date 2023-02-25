package PageObject.Logout;

import TestCases.BaseClass;
import org.openqa.selenium.By;

public class OB_LO_002 extends BaseClass {
    //Validate logging out Using browsers back button.
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
    public void ClickBrowsersBackButton() {
        driver.navigate().back();

    }
}
