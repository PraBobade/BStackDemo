package PageObject.Add_To_Cart;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OB_AC_011 extends BaseClass {
    //validate after increasing the quantity of product the price also increases.

    int initialPrice;
    int AfterPrice;
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void AddProductToCart(){
        driver.findElement(By.cssSelector("div[id='1'] div[class='shelf-item__buy-btn']")).click();
    }
    public void AddProductQuantityInBag(){
        wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.cssSelector(".header-title"))));

        String price = driver.findElement(By.cssSelector("div[class='shelf-item__price'] p")).getText();
        String OnlyPrice = price.trim().split(" ")[1].split("\\.")[0];

        initialPrice = Integer.parseInt(OnlyPrice);

        driver.findElement(By.xpath("(//button[normalize-space()='+'])[1]")).click();
    }
    public void ValidateThePrice(){
        String price = driver.findElement(By.cssSelector(".sub-price__val")).getText();
        String OnlyPrice = price.trim().split(" ")[1].split("\\.")[0];

        AfterPrice = Integer.parseInt(OnlyPrice);
        if (AfterPrice == (initialPrice*2)){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }


}
