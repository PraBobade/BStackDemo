package PageObject.HomeScreen;

import TestCases.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OB_HC_003 extends BaseClass {
    //Validate Total Products display on screen
    String ActualProducts ;
    public void GetTotalProductDisplayOnScreen(){
        ActualProducts = driver.findElement(By.cssSelector("small[class='products-found'] span")).getText();
    }
    public void ValidateTotalProduct(String ExpectedProductCount){
        if (ActualProducts.contains(ExpectedProductCount)){
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }
}
