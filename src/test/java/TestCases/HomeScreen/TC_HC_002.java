package TestCases.HomeScreen;

import PageObject.HomeScreen.OB_HC_002;
import org.testng.annotations.Test;

public class TC_HC_002 extends OB_HC_002 {

    @Test(description = "Validate The title and Url Of the homepage")
    public void Test2(){
        OB_HC_002 OB = new TC_HC_002();
        OB.validateTitleOfHomePage("StackDemo");
        OB.ValidateUrlOfHomePage("https://www.bstackdemo.com/");

    }
}
