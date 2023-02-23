package PageObject.Orders_By;

import TestCases.BaseClass;
import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OB_OB_004 extends BaseClass {
    //Validate order_by By selecting nothing.
    String ValidateBefore;
    String ValidateAfter;
    public void ValidateFirstProductBefore(){
        ValidateBefore = driver.findElement(By.xpath("//div[@class='shelf-item__price']/div[@class='val']")).getText();
    }
    public void SelectOrderByNothing() throws InterruptedException {
        WebElement abc = driver.findElement(By.cssSelector("div[class='sort'] select"));
        Select dropdown = new Select(abc);
        dropdown.selectByIndex(0);
        Thread.sleep(1000);
    }
    public void ValidateProductDisplayAfter(){
        ValidateAfter = driver.findElement(By.xpath("//div[@class='shelf-item__price']/div[@class='val']")).getText();
        Assert.assertEquals(ValidateBefore, ValidateAfter);
    }


}
