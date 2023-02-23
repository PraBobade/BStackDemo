package TestCases.Offers;

import PageObject.Offers.OB_OF_003;
import org.testng.annotations.Test;

public class TC_OF_003 extends OB_OF_003 {
    // Validate Offers Should open in new Tab.
    @Test
    public void Test3() throws InterruptedException {
        Log.info("Validate Offers Should open in new Tab.");
        OB_OF_003 OB = new TC_OF_003();
        OB.LoginToApplication();
        OB.NavigateToOffersInNewTab();
        OB.GoToNewTab();
        OB.ValidateUserNavigateToLogin();

    }
}
