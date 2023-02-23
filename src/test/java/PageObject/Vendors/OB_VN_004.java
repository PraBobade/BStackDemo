package PageObject.Vendors;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OB_VN_004 extends BaseClass {
    //Validate Vendors option For OnePlus product only
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void SelectVendorOnePlus(){
        driver.findElement(By.xpath("//span[normalize-space()='OnePlus']")).click();
    }
    public void ValidateTotalProductsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        String Products =  driver.findElement(By.cssSelector("small[class='products-found'] span")).getText();

        if (Products.contains("6")){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }
    public void ValidateAllProducts(){
        List<WebElement> Elements = driver.findElements(By.xpath("//p[@class='shelf-item__title']"));
        for (WebElement element:Elements) {
            if (!element.getText().contains("One")){
                Assert.fail();
            }else {
                Assert.assertTrue(true);
            }
        }
    }


}
