package PageObject.BuyProduct;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

public class OB_BP_004 extends BaseClass {
//Validate Check out without Any shipping Address.
public void LoginToApplication(){
    driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
    driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
    driver.findElement(By.xpath("//div[normalize-space()='image_not_loading_user']")).click();
    driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
    driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
    driver.findElement(By.cssSelector("#login-btn")).click();
}
    public void AddProductToCart(){
        driver.findElement(By.cssSelector("div[id='1'] div[class='shelf-item__buy-btn']")).click();
    }
    public void ClickOnCheckOutOption(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".buy-btn"))));
        driver.findElement(By.cssSelector(".buy-btn")).click();
    }
    public void ClickOnSubmitWithOutShippingAddress(){
        driver.findElement(By.id("checkout-shipping-continue")).click();
    }
    public void ValidateMsg(String ExpectedTxt) throws InterruptedException {
    Thread.sleep(2000);
        String Txt = driver.findElement(By.id("firstNameInput")).getAttribute("required");
        if (Objects.equals(Txt, ExpectedTxt)){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }


}
