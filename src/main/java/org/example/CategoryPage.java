package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CategoryPage extends Utils{
    By _pagetitle = By.xpath("//h1");



    public void  getMyUrl(String page_Url) {
        Assert.assertTrue(driver.getCurrentUrl().equals(page_Url));
    }
    public void  verifyCategoryTitle(String text){
        Assert.assertEquals(driver.findElement(_pagetitle).getText(),text);
    }}

