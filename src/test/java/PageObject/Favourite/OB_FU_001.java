package PageObject.Favourite;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OB_FU_001 extends BaseClass {
    //Validate Adding the product to favourites.
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void AddProductToFavourite() throws InterruptedException {
        WebElement Favourite = driver.findElement(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root Icon'])[1]"));
        act.moveToElement(Favourite).doubleClick().build().perform();
        Thread.sleep(2000);
        act.click().build().perform();
    }
    public void GoToFavoriteOption(){
        driver.findElement(By.cssSelector("a[id='favourites'] strong")).click();
    }


}
