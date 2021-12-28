package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static com.sun.deploy.util.BufferUtil.GB;

public class BuildYourOwnComputer extends HomePage{


    By _addToCart=By.id("add-to-cart-button-1");
    By _hdd=By.id("product_attribute_3_6");
    By _os=By.id("product_attribute_4_9");
    By _software=By.id("product_attribute_5_11");
    By _softWare=By.id("product_attribute_5_12");
    By _shoppingCart=By.xpath("//p/a[@href=\"/cart\"]");


    public void userShouldAbleToSelectSpecificFunction(){
        //Select Processor from dropdown
        Select selectProcessor = new Select(driver.findElement(By.id("product_attribute_1")));
        selectProcessor.selectByValue("1");

        // Select RAM from dropdown
        Select selectRAM = new Select(driver.findElement(By.id("product_attribute_2")));
        selectRAM.selectByValue("5");

        // Select HDD
        clickOnElement(_hdd);


        // Select OS
        clickOnElement(_os);


        // Click on software
        clickOnElement(_software);
        clickOnElement(_softWare);


        // Click on Add to cart button
        clickOnElement(_addToCart);

        // Click on shopping cart
        clickOnElement(_shoppingCart);



    }
}
