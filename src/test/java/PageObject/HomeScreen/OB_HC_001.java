package PageObject.HomeScreen;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OB_HC_001 extends BaseClass {
    // Validate The Logo is Present Or not

    public void ValidateLogoIsPresentOrNot(){
        boolean flag = driver.findElement(By.xpath("(//*[name()='svg'])[1]")).isDisplayed();
        Assert.assertTrue("The Logo is not Present", flag);
    }
}
