package PageObject.Vendors;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OB_VN_011 extends BaseClass {
    //Validate Vendors option For all product.
    public void LoginToApplication(){
        driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
        driver.findElement(By.xpath("//div[@id='username']//div[contains(@class,'css-1hwfws3')]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='demouser']")).click();
        driver.findElement(By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]")).click();
        driver.findElement(By.xpath("//div[normalize-space()='testingisfun99']")).click();
        driver.findElement(By.cssSelector("#login-btn")).click();
    }
    public void SelectAllVendor(){
        driver.findElement(By.xpath("//span[normalize-space()='Google']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='OnePlus']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Samsung']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Apple']")).click();
    }
    public void ValidateTotalProductsAvailable() throws InterruptedException {
        Thread.sleep(4000);
        String Products =  driver.findElement(By.cssSelector("small[class='products-found'] span")).getText();

        if (Products.contains("25")){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }
    public void ValidateAllProducts(){
        List<WebElement> Elements = driver.findElements(By.xpath("//p[@class='shelf-item__title']"));
        for (WebElement element:Elements) {
            String Name = element.getText();
            System.out.println(Name);
            if (Name.contains("One")||Name.contains("Pixel")||Name.contains("iPhone")||Name.contains("Galaxy")){
                Assert.assertTrue(true);
            }else {
                Assert.fail();
            }
        }
    }

}
