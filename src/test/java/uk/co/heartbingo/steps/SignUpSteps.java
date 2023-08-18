package uk.co.heartbingo.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.heartbingo.pages.SignUpPage;

public class SignUpSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
        new SignUpPage().clickOnAcceptCookiesButton();
    }

    @And("^I click on sign up link$")
    public void iClickOnSignUpLink() {
        new SignUpPage().clickOnSignUpButton();
    }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String name){
        new SignUpPage().enterFirstName(name);

    }

    @And("^I enter Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String lName) {
        new SignUpPage().enterLastName(lName);

    }

    @And("^I click on Continue Button$")
    public void iClickOnContinueButton() {
        new SignUpPage().clickOnContinueBtn();
    }


    @And("^I Enter Email \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new SignUpPage().enterEmail(email);

    }

    @And("^I Enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String pword)  {
        new SignUpPage().enterPassword(pword);

    }


    @And("^I Enter Mobile Number (\\d+)$")
    public void iEnterMobileNumber(String num) {
        new SignUpPage().enterMobileNumber(num);
    }

    @And("^I select Day$")
    public void iSelectDay() {
        new SignUpPage().selectDay();
    }

    @And("^I select Month$")
    public void iSelectMonth() {
        new SignUpPage().selectMonth();
    }

    @And("^I select Year$")
    public void iSelectYear() {
        new SignUpPage().selectYear();
    }
    @And("^I Click on Address Manually$")
    public void iClickOnAddressManually() {
        new SignUpPage().clickOnEnterManually();
    }

    @And("^I Enter House Number \"([^\"]*)\"$")
    public void iEnterHouseNumber(String add) {
        new SignUpPage().enterAdd1(add);

    }

    @And("^I Enter City \"([^\"]*)\"$")
    public void iEnterCity(String city)  {
        new SignUpPage().enterCity(city);

    }

    @And("^I Enter Zip Code \"([^\"]*)\"$")
    public void iEnterZipCode(String add)  {
        new SignUpPage().enterZip(add);

    }

    @And("^I enter Continue Button$")
    public void iEnterContinueButton() {
        new SignUpPage().clickOnContinue();
    }


    @And("^I Verify marketing communication on last step \"([^\"]*)\"$")
    public void iVerifyMarketingCommunicationOnLastStep(String expectedMsg) {
        Assert.assertEquals("Text is not find",expectedMsg,new SignUpPage().getText());

    }


    @And("^I checked marketing communication box$")
    public void iCheckedMarketingCommunicationBox() {

    }

    @And("^I Checked Terms & Condition & Privacy Notice$")
    public void iCheckedTermsConditionPrivacyNotice() {
    }

    @Then("^I created account successfully$")
    public void iCreatedAccountSuccessfully() {
    }



}
