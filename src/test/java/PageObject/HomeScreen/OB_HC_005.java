package PageObject.HomeScreen;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;


public class OB_HC_005 extends BaseClass {
    //Validate Footer Text of Home page
    String ActualText;
    public void GetFooterText(){
        ActualText = driver.findElement(By.cssSelector("div[class='py-12 flex flex-col md:flex-row justify-between items-center space-y-4'] div span")).getText();
        System.out.println(ActualText);
    }
    public void ValidateFooterText(String ExpectedText){
        Assert.assertEquals(ExpectedText, ActualText);
    }
}
