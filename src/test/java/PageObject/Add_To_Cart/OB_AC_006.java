package PageObject.Add_To_Cart;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OB_AC_006 extends BaseClass {
    //Validate Adding more than one different products and Check the total Price.
    int ExpectedPrice=0;
    int ActualPrice=0;
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void AddProductsToCart(){
        driver.findElement(By.cssSelector("div[id='1'] div[class='shelf-item__buy-btn']")).click();
        driver.findElement(By.cssSelector(".float-cart__close-btn")).click();
        driver.findElement(By.cssSelector("div[id='2'] div[class='shelf-item__buy-btn']")).click();
    }
    public void CheckAdditionOfPrice(){
        List<WebElement> list = driver.findElements(By.xpath("(//p[contains(text(),'$')])"));

        for (int e=0;e<list.size()-1;e++) {
            String price = list.get(e).getText();
            String OnlyPrice = price.trim().split(" ")[1].split("\\.")[0];
            ExpectedPrice = ExpectedPrice + Integer.parseInt(OnlyPrice);
        }
    }
    public void CheckActualPrice(){
        String price = driver.findElement(By.cssSelector(".sub-price__val")).getText();
        String OnlyPrice = price.trim().split(" ")[1].split("\\.")[0];
        ActualPrice = Integer.parseInt(OnlyPrice);

        if (ActualPrice == ExpectedPrice){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }






}
