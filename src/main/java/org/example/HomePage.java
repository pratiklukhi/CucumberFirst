package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class HomePage extends Utils{
By _registerButton=By.xpath("//a[@href='/register?returnUrl=%2F']");

By _detailsButton=By.xpath("//div[@class='news-items']/div[2]/div[3]/a");

By _computers=By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a[@href='/computers']");

By _appleMacBookPro=By.xpath("//h2/a[@href='/apple-macbook-pro-13-inch']");

By _newOnlineStore=By.xpath("//div[@class=\"news-list-homepage\"]/div[2]/div[1]/div[1]/a");

By _faceBook=By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a");

By _vote=By.id("vote-poll-1");

By _buildYourOwnComputer=By.xpath("//h2/a[@href=\"/build-your-own-computer\"]");

By _facebook=By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a\n");

public void clickOnRegisterButton(){
        //Click on Registration button
    clickOnElement(_registerButton);
    }

    public void clickOnDetailsButton(){
    // Click on Details button
        clickOnElement(_detailsButton);
    }

    public void clickOnComputers(){
    // Click on Computers
        clickOnElement(_computers);
    }

    public void clickOnAppleMacBookPro(){
    // Click on Apple Mac book pro
        clickOnElement(_appleMacBookPro);
    }

    // Navigate Category pages
    public void clickOnTheCategoryButton(String name) {
    clickOnElement(By.linkText(name));
    }

    //  Click onNew online store is open
    public void clickOnNewOnlineStore(){
    clickOnElement(_newOnlineStore);
    }

    // Click on Facebook icon
    public void facebookWindowHandling(){
    clickOnElement(_faceBook);

    // window handling
    Set<String> Handles=driver.getWindowHandles();
    Iterator<String> iterator=Handles.iterator();
    String parentWindow = iterator.next();
    String childWindow = iterator.next();
        driver.switchTo().window(childWindow);

        // Accept cookies
        driver.findElement(By.xpath("//button[@data-cookiebanner=\"accept_button\"]")).click();

    // user verify that he is on Facebook Page
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/a/i")).getText().equals("Facebook"));

    // close new tab or child page or facebook page
        driver.close();

    // now user at demo nopCommerce
        driver.switchTo().window(parentWindow);
}


    // Click on Vote button
    public void clickOnVoteButton(){
     clickOnElement(_vote);
     driver.switchTo().alert().accept();
    }

    // Click on Build your own computer
    public void clickOnBuildYourOwnComputer(){
    clickOnElement(_buildYourOwnComputer);
    }

    // Use can navigate sub category pages through mouse hoover action
    public void nevigateSubCategoryPage(String subcategory){
        Actions actions = new Actions(driver);

        // move the mouse to the earlier identified menu option
        WebElement element1= driver.findElement(By.linkText(subcategory));
        actions.moveToElement(element1).build().perform();
        element1.click();

    }
}