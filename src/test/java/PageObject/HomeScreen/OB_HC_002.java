package PageObject.HomeScreen;

import TestCases.BaseClass;
import org.junit.Assert;

public class OB_HC_002 extends BaseClass {
    //Validate The title and Url Of the homepage
    public void validateTitleOfHomePage(String ExpectedTitle){
        String ActualTitle = driver.getTitle();
        System.out.println(ActualTitle);
        Assert.assertEquals(ExpectedTitle, ActualTitle);

    }
    public void ValidateUrlOfHomePage(String ExpectedUrl){
        String ActualURL = driver.getCurrentUrl();
        System.out.println(ActualURL);
        Assert.assertEquals(ExpectedUrl, ActualURL);
    }
}
