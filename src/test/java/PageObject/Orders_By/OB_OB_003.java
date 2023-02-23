package PageObject.Orders_By;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OB_OB_003 extends BaseClass {
    //Validate order_by By  Highest to Lowest
    int ActualPrice;
    public void SelectOrderByLowestToHighest() throws InterruptedException {
        WebElement abc = driver.findElement(By.cssSelector("div[class='sort'] select"));
        Select dropdown = new Select(abc);
        dropdown.selectByIndex(2);
        Thread.sleep(2000);
    }
    public void ValidateProductIsAccordingToOrderBy(){
        List<WebElement> Price = driver.findElements(By.xpath("(//div[@class='val'])"));
        int check = 14000;
        for (WebElement e: Price){
            String price = e.getText();
            String OnlyPrice = price.trim().split("\\$")[1].split("\\.")[0];
            ActualPrice = Integer.parseInt(OnlyPrice);
            if (check>=ActualPrice){
                //  System.out.println(ActualPrice);
                Assert.assertTrue(true);
            }else{
                Assert.fail();
            }
            check = ActualPrice;
        }



    }


}
