package PageObject.Orders_By;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OB_OB_001 extends BaseClass {
    //Validate placeholder for order by function
    String ActualText;
    public void GetPlaceHolderOfOrderBy(){
        ActualText = driver.findElement(By.xpath("//div[@class='sort']//select")).getText();
    }
    public void ValidatePlaceHolder(String ExpectedText){
        Assert.assertEquals(ExpectedText, ActualText);
    }
}
