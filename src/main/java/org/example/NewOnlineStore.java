package org.example;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.testng.Assert;

public class NewOnlineStore extends HomePage{

    By _review=By.id("AddNewComment_CommentTitle");
    By _comment=By.id("AddNewComment_CommentText");
    By _newComment=By.name("add-comment");

    public void toVerifyUserShouldTypeTitle(){
        typeText(_review,loadProp.getProperty("title"));
        typeText(_comment,loadProp.getProperty("comment"));
        clickOnElement(_newComment);

    }
    // To verify text "new online store is open"
    public void userVerifyThatUserAtOnlineStorePage(){
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1")).getText().equals("New online store is open!"));
    }

    // To verify text "leave your comment"
    public void userVerifyLeaveYourCommentTittle(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"comments\"]/div[1]/strong")).getText().equals("Leave your comment"));
    }

    // To verify successful message
    public void commentResult() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"comments\"]/div[2]/div")).getText().equals("News comment is successfully added."));
    }
    public void toVerifyUserShouldAbleToSeeComment(){
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[4]/div[2]/div[2]/div[2]/div[3]/p")).getText().equals("Nice online store"));
    }

}
