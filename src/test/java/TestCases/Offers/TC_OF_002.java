package TestCases.Offers;

import PageObject.Offers.OB_OF_002;
import org.testng.annotations.Test;

public class TC_OF_002 extends OB_OF_002 {
    //Validate Offers available Using Keyboard keys TAB and ENTER KEYS.
    @Test
    public void Test2() throws InterruptedException {
        Log.info("Validate Offers available Using Keyboard keys TAB and ENTER KEYS.");
        OB_OF_002 OB = new TC_OF_002();
        OB.LoginToApplication();
        OB.PressTwoTimesTab();
        OB.PressEnterToNavigateInOffers();
        OB.ValidateOffersAvailableOrNot();
    }
}
