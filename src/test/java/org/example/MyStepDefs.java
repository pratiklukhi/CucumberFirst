package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();
    AppleMacBookProPage appleMacBookProPage = new AppleMacBookProPage();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendResult emailAFriendResult = new EmailAFriendResult();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    NavigateDesktopPage navigateDesktopPage = new NavigateDesktopPage();
    NewsCommentsPage newsCommentsPage = new NewsCommentsPage();
    NewReleaseComment newReleaseComment = new NewReleaseComment();
    NewCommentResultPage newCommentResultPage = new NewCommentResultPage();


    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        homePage.clickOnRegisterButton();

    }

    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registrationPage.enterRegistrationDetails();
    }

    @When("click on register submit button")
    public void click_on_register_submit_button() {

    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        registrationSuccessPage.registrationResult();
    }

    @Given("user is already registered")
    public void user_is_already_registered() {
        homePage.clickOnRegisterButton();
        registrationPage.enterRegistrationDetails();
        registrationSuccessPage.registrationResult();

        registrationSuccessPage.clickOnContinueOnRegistrationSuccessful();}

    @When("user is on homepage")
    public void user_is_on_homepage()
    { homePage.clickOnAppleMacBookPro();}

    @When("select a AppleMacBook product")
    public void select_a_apple_mac_book_product()
    {
    }
    @When("click on Email a friend")
    public void click_on_email_a_friend()
    {emailAFriend.emailAFriend1();}

    @Then("user should able to refer a friend successfully")
    public void user_should_able_to_refer_a_friend_successfully()
    {emailAFriendResult.messageSent();}


    @When("user click on computers")
    public void user_click_on_computers()
    {homePage.clickOnComputers();}
    {computersPage.computer();}

    @When("select desktop")
    public void select_desktop() {desktopPage.desktop();}

    @Then("user should able to navigate Desktop page")
    public void user_should_able_to_navigate_desktop_page() {
        navigateDesktopPage.navigateDesktop();
    }
}

