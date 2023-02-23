package PageObject.Favourite;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OB_FU_008 extends BaseClass {
    //Validate Add product to favorite then select Order_By (Lowest To Highest) and check Product is available in favorite or not.
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
    public void SelectOrderByLowestToHighest() throws InterruptedException {
        WebElement abc = driver.findElement(By.cssSelector("div[class='sort'] select"));
        Select dropdown = new Select(abc);
        dropdown.selectByIndex(1);
        Thread.sleep(2000);
    }
    public void GoToFavoriteOption(){
        driver.findElement(By.cssSelector("a[id='favourites'] strong")).click();
    }
    public void ValidateProductInFavourite(String ExpectedString){
        String Text = driver.findElement(By.cssSelector("small[class='products-found'] span")).getText();
        Assert.assertEquals(ExpectedString, Text);
    }


}
