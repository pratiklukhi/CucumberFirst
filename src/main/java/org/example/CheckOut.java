package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CheckOut extends ShoppingCart{

    public void userShouldVerifyBillingAddress(){

        //Select Country from dropdown
        Select selectCountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        selectCountry.selectByValue("233");

        // Enter city name
        typeText(By.id("BillingNewAddress_City"),"London");

        // Enter full address
        typeText(By.id("BillingNewAddress_Address1"),"107,Brampton Road");
        typeText(By.id("BillingNewAddress_ZipPostalCode"),"NW9 9DE");
        typeText(By.id("BillingNewAddress_PhoneNumber"),"07417474174");

        // Click on continue
        clickOnElement(By.name("save"));
    }
}
