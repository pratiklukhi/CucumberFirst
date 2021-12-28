package org.example;

import org.openqa.selenium.By;

public class ShoppingCart extends BuildYourOwnComputer{

    public void toVerifyTermsAndConditions(){

        // Click in check box of accept terms and condition
        clickOnElement(By.id("termsofservice"));

        // Click on checkout button
        clickOnElement(By.id("checkout"));
    }
}
