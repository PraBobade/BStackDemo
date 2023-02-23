package PageObject.Offers;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class OB_OF_002 extends BaseClass {
    //Validate Offers available Using Keyboard keys TAB and ENTER KEYS.
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void PressTwoTimesTab() throws InterruptedException {
        Thread.sleep(3000);
        act.keyDown(Keys.TAB).build().perform();
        Thread.sleep(3000);
        act.keyDown(Keys.TAB).build().perform();
    }
    public void PressEnterToNavigateInOffers() throws InterruptedException {
        Thread.sleep(3000);
        act.keyDown(Keys.ENTER).build().perform();
    }
    public void ValidateOffersAvailableOrNot() throws InterruptedException {
        Thread.sleep(3000);
        String Text = driver.findElement(By.cssSelector(".pt-6.text-2xl.font-bold.tracking-wide.text-center.text-red-50")).getText();
        if (Text.contains("Sorry ")){
            Log.info("There is No Offer Present");
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }

    }
}
