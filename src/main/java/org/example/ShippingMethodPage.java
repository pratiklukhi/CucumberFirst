package org.example;

import org.openqa.selenium.By;

public class ShippingMethodPage extends CheckOut{

    public void userShouldConfirmShipping(){

        // Click on continue button
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
    }
}
