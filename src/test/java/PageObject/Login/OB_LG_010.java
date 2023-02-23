package PageObject.Login;

import TestCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class OB_LG_010 extends BaseClass {

    public void ClickOnSignIn(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
    }
    public void setUserName(String UName)  {
        WebElement UserName = driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]"));
        UserName.click();
        driver.findElement(By.xpath("//div[normalize-space()='"+UName+"']")).click();
        UserName.click();
    }
    public void SelectTextFromUserName(){
        act.keyDown(Keys.CONTROL).build().perform();
        act.keyDown(Keys.SHIFT).build().perform();
        act.keyDown(Keys.LEFT).build().perform();
    }

}
