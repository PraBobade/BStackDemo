package PageObject.Favourite;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OB_FU_005 extends BaseClass {
//Validate Favourite when there is no product added favourite.
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void GoToFavoriteOption(){
        driver.findElement(By.cssSelector("a[id='favourites'] strong")).click();
    }
    public void ValidateProductInFavourite(){
        String Text = driver.findElement(By.cssSelector("small[class='products-found'] span")).getText();
        if (Text.contains("0")){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }
}
