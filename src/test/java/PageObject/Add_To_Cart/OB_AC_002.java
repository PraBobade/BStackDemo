package PageObject.Add_To_Cart;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Validate adding the product to Cart from 'Wish List' Page
public class OB_AC_002 extends BaseClass {
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void AddProductToFavourite() {
        WebElement Favourite = driver.findElement(By.xpath("(//*[name()='svg'][@class='MuiSvgIcon-root Icon'])[1]"));
       act.moveToElement(Favourite).doubleClick().build().perform();
       act.click().build().perform();
    }
    public void GoToFavoriteOption(){
        driver.findElement(By.cssSelector("a[id='favourites'] strong")).click();
    }
    public void AddProductToCart(){
        driver.findElement(By.cssSelector(".shelf-item__buy-btn")).click();
    }
    public void CheckProductAddedToCartOrNot(){
        boolean Result = driver.findElement(By.xpath("(//div[@class='shelf-item'])[2]")).isDisplayed();
        if (Result){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }


}
