package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PaymentInformationPage extends PaymentMethodPage{

    public void userShouldEnterCorrectPaymentDetails(){

        // Type cardholder name
        typeText(By.id("CardholderName"),"Patel");

        // Enter card number
        typeText(By.id("CardNumber"), "4716766548659229");

        // Select expiry month and year from drop down
        Select selectMonth = new Select(driver.findElement(By.id("ExpireMonth")));
        selectMonth.selectByValue("11");

        Select selectYear = new Select(driver.findElement(By.id("ExpireYear")));
        selectYear.selectByValue("2025");

        // Enter card code
        typeText(By.id("CardCode"),"521");

        // Click on continue
        clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
    }
}
