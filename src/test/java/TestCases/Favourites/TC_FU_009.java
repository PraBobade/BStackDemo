package TestCases.Favourites;


import PageObject.Favourite.OB_FU_009;
import org.testng.annotations.Test;

public class TC_FU_009 extends OB_FU_009 {
    //Validate Add product to favorite then select Order_By (Highest To Lowest) and check Product is available in favorite or not.

    @Test
    public void Test9() throws InterruptedException {
        Log.info("Validate Add product to favorite then select Order_By (Highest To Lowest) and check Product is available in favorite or not.");
        OB_FU_009 OB = new OB_FU_009();
        OB.LoginToApplication();
        OB.AddProductToFavourite();
        OB.SelectOrderByHighestToLowest();
        OB.GoToFavoriteOption();
        OB.ValidateProductInFavourite("1 Product(s) found.");

    }
}
