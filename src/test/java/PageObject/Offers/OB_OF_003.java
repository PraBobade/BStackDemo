package PageObject.Offers;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class OB_OF_003 extends BaseClass {
    // Validate Offers Should open in new Tab.
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void NavigateToOffersInNewTab(){
        WebElement offer = driver.findElement(By.cssSelector("a[id='offers'] strong"));
        act.moveToElement(offer).keyDown(Keys.CONTROL).click().build().perform();
    }
    public void GoToNewTab(){
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
    }
    public void ValidateUserNavigateToLogin() throws InterruptedException {
        Thread.sleep(3000);
        String Text = driver.findElement(By.id("login-btn")).getText();
        if (Text.contains("LOG")){
            Log.info("User navigate to Login button.");
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }

    }


}
