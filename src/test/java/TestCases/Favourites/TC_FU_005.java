package TestCases.Favourites;

import PageObject.Favourite.OB_FU_005;
import TestCases.BaseClass;
import org.testng.annotations.Test;

public class TC_FU_005 extends OB_FU_005 {
    //Validate Favourite when there is no product added favourite.
    @Test
    public void Test5(){
        Log.info("Validate Favourite when there is no product added favourite.");
        OB_FU_005 OB = new TC_FU_005();
        OB.LoginToApplication();
        OB.GoToFavoriteOption();
        OB.ValidateProductInFavourite();
    }
}
