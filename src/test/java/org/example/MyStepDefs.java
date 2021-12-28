package org.example;

import io.cucumber.java.en.And;
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
    CategoryPage categoryPage=new CategoryPage();
    NewOnlineStore newOnlineStore = new NewOnlineStore();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ShoppingCart shoppingCart = new ShoppingCart();
    CheckOut checkOut =new CheckOut();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();


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


    @Given("user is on homepage on nopcommerce website")
    public void userIsOnHomepageOnNopcommerceWebsite() {

    }

    @When("user clicks on computers category")
    public void userClicksOnComputersCategory() {
       homePage.clickOnComputers();
    }

    @And("user clicks on desktop category")
    public void userClicksOnDesktopCategory() {
        computersPage.computer();
    }

    @Then("user should be navigate to desktop page successfully")
    public void userShouldBeNavigateToDesktopPageSuccessfully() {
      desktopPage.desktop();
    }

    @Given("user is on homepage")
    public void userIsOnHomepage() {
        homePage.clickOnDetailsButton();
    }

    @When("user click on details button")
    public void userClickOnDetailsButton() {
        newsCommentsPage.newComment();
    }

    @And("user fills comments box")
    public void userFillsCommentsBox() {
    }

    @And("click on new comment")
    public void clickOnNewComment() {
    }

    @Then("user should able to add news comments successfully")
    public void userShouldAbleToAddNewsCommentsSuccessfully() {
        newCommentResultPage.newComment1();
    }

    @Given("user is already registered successfully page")
    public void userIsAlreadyRegisteredSuccessfullyPage() {
        homePage.clickOnRegisterButton();
        registrationPage.enterRegistrationDetails();
        registrationSuccessPage.registrationResult();

    }

    @When("user click on continue button on the Register successfully page")
    public void userClickOnContinueButtonOnTheRegisterSuccessfullyPage() {
        registrationSuccessPage.clickOnContinueOnRegistrationSuccessful();
    }

    @And("select a AppleMacBook product")
    public void selectAAppleMacBookProduct() {
        homePage.clickOnAppleMacBookPro();
        appleMacBookProPage.emailAFriend();

    }

    @And("click on Email a friend")
    public void clickOnEmailAFriend() {
        emailAFriend.emailAFriend1();
    }

    @Then("user should able to refer a friend successfully")
    public void userShouldAbleToReferAFriendSuccessfully() {
        emailAFriendResult.messageSent();
    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on {string} button")
    public void iClickOnButton(String category) {
        homePage.clickOnTheCategoryButton(category);

    }

    @Then("i should be able to verify the {string} accordingly")
    public void iShouldBeAbleToVerifyTheAccordingly(String pageUrl) {
        categoryPage.getMyUrl(pageUrl);
    }

    @And("i should  able to verify from the get text {string} accordinggly")
    public void iShouldAbleToVerifyFromTheGetTextAccordinggly(String string) {
        categoryPage.verifyCategoryTitle(string);
    }
    @Given("user is already registered")
    public void user_is_already_registered() {
        homePage.clickOnRegisterButton();
        registrationPage.enterRegistrationDetails();
        registrationSuccessPage.registrationResult();
        registrationSuccessPage.clickOnContinueOnRegistrationSuccessful();

    }
    @When("user is on Homepage")
    public void user_is_on_homepage() {
        homePage.clickOnNewOnlineStore();
    }
    @When("click on new online store is open")
    public void click_on_new_online_store_is_open() {
        newOnlineStore.userVerifyThatUserAtOnlineStorePage();
        newOnlineStore.userVerifyLeaveYourCommentTittle();

    }
    @When("type title and comment")
    public void type_title_and_comment() {

        newOnlineStore.toVerifyUserShouldTypeTitle();
    }
    @When("click on new comment button")
    public void click_on_new_comment_button() {

    }
    @Then("user should able to see news comment is successfully added")
    public void user_should_able_to_see_news_comment_is_successfully_added() {
        newOnlineStore.commentResult();

    }
    @Then("also see his comments in the last of the comment page")
    public void also_see_his_comments_in_the_last_of_the_comment_page() {
newOnlineStore.toVerifyUserShouldAbleToSeeComment();
    }
    @When("click on facebook icon")
    public void click_on_facebook_icon() {
       homePage.facebookWindowHandling();
    }
    @Then("I should able to see facebook page url with page of DemoNopeCommerce website")
    public void i_should_able_to_see_facebook_page_url_with_page_of_demo_nope_commerce_website() {

    }
    @Given("user is already on homepage")
    public void user_is_already_on_homepage() {


    }
    @When("click on vote button")
    public void click_on_vote_button() {
        homePage.clickOnVoteButton();
    }
    @Then("I should able to click on ok button of alert popup box of DemoNopeCommerce website")
    public void i_should_able_to_click_on_ok_button_of_alert_popup_box_of_demo_nope_commerce_website() {

    }
    @Given("I am already on homepage")
    public void i_am_already_on_homepage() {
        homePage.clickOnRegisterButton();
        registrationPage.enterRegistrationDetails();
        registrationSuccessPage.registrationResult();
        registrationSuccessPage.clickOnContinueOnRegistrationSuccessful();
        homePage.clickOnBuildYourOwnComputer();

    }
    @When("I click on Build your own computer")
    public void i_click_on_build_your_own_computer() {
        buildYourOwnComputer.userShouldAbleToSelectSpecificFunction();

    }
    @When("select specific processor and RAM from dropdown")
    public void select_specific_processor_and_ram_from_dropdown() {

    }
    @When("click on radio button of specific HDD and operating system")
    public void click_on_radio_button_of_specific_hdd_and_operating_system() {

    }
    @When("select software from software list")
    public void select_software_from_software_list() {

    }
    @When("click on Add to cart")
    public void click_on_add_to_cart() {

    }
    @When("I click on shopping cart from popup")
    public void i_click_on_shopping_cart_from_popup() {

    }
    @When("click on check box of terms and condition")
    public void click_on_check_box_of_terms_and_condition() {
        shoppingCart.toVerifyTermsAndConditions();

    }
    @When("click on checkout button")
    public void click_on_checkout_button() {

    }
    @When("fill all require details in billing address page")
    public void fill_all_require_details_in_billing_address_page() {
        checkOut.userShouldVerifyBillingAddress();

    }
    @When("click on continue button")
    public void click_on_continue_button() {

    }
    @When("click in continue button on shipping method page")
    public void click_in_continue_button_on_shipping_method_page() {
        shippingMethodPage.userShouldConfirmShipping();

    }
    @When("select any one method for payment and click on continue button")
    public void select_any_one_method_for_payment_and_click_on_continue_button() {
        paymentMethodPage.userShouldVerifyPaymentMethod();

    }
    @When("fill all details of payment information and click on continue button")
    public void fill_all_details_of_payment_information_and_click_on_continue_button() {
        paymentInformationPage.userShouldEnterCorrectPaymentDetails();

    }
    @When("click on confirm button on confirm order page")
    public void click_on_confirm_button_on_confirm_order_page() {
        confirmOrderPage.userShouldVerifyConfirmOrder();


    }
    @Then("I can see message of order successfully processed")
    public void i_can_see_message_of_order_successfully_processed() {

    }

    @And("I Click on {string}")
    public void iClickOn(String string) {
        homePage.nevigateSubCategoryPage(string);

    }

}

