package PageObject.Favourite;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OB_FU_010 extends BaseClass {
    //validate all products Add Favourite.
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void AddAllProductsToFavourite() throws InterruptedException {
        List<WebElement> Favourite = driver.findElements(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root Icon'])"));
        for (WebElement e:Favourite) {
            act.moveToElement(e).doubleClick().build().perform();
            Thread.sleep(500);
            act.click().build().perform();
        }
    }
    public void GoToFavoriteOption(){
        driver.findElement(By.cssSelector("a[id='favourites'] strong")).click();
    }
    public void ValidateProductInFavourite(String ExpectedProducts){
        String Text = driver.findElement(By.cssSelector("small[class='products-found'] span")).getText();
        Assert.assertEquals(ExpectedProducts, Text);
    }

}
