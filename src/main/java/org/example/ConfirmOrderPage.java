package org.example;

import org.openqa.selenium.By;

public class ConfirmOrderPage extends PaymentInformationPage{

    public void userShouldVerifyConfirmOrder(){

        // Click on continue
        clickOnElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']"));
    }
}
