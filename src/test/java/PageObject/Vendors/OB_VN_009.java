package PageObject.Vendors;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OB_VN_009 extends BaseClass {
    //Validate Vendors option For OnePlus and Samsung product only
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void SelectVendorSamsungAndOnePlus(){
        driver.findElement(By.xpath("//span[normalize-space()='Samsung']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='OnePlus']")).click();
    }
    public void ValidateTotalProductsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        String Products =  driver.findElement(By.cssSelector("small[class='products-found'] span")).getText();

        if (Products.contains("13")){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }
    public void ValidateAllProducts(){
        List<WebElement> Elements = driver.findElements(By.xpath("//p[@class='shelf-item__title']"));
        for (WebElement element:Elements) {
            System.out.println(element.getText());
            String Name = element.getText();
            if (Name.contains("Galaxy")||Name.contains("One")){
                Assert.assertTrue(true);
            }else {
                Assert.fail();
            }
        }
    }

}
