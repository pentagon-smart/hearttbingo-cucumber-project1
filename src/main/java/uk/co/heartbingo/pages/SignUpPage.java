package uk.co.heartbingo.pages;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

public class SignUpPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignUpPage.class.getName());

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement signUpLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//span[@class='regpath__button-next-text']")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Female']")
    WebElement gender;

    @CacheLookup
    @FindBy(xpath = "//input[@id='regpath_form_email_input']")
    WebElement emailId;
    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_number']")
    WebElement mobileNum;

    @CacheLookup
    @FindBy(xpath = "//select[@name='day']")
    WebElement day;
    @CacheLookup
    @FindBy(xpath = "//select[@name='month']")
    WebElement month;
    @CacheLookup
    @FindBy(xpath = "//select[@name='year']")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Enter Manually')]")
    WebElement enterManualAdd;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address3']")
    WebElement city ;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipCode;

    @CacheLookup
    @FindBy(xpath = "//button[@type='regpath-button-next']")
    WebElement nextContinue;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Marketing Communications')]")
    WebElement textMarketingCommunication;


    public void clickOnAcceptCookiesButton() {
        clickOnElement(acceptCookies);
        log.info("Accepting Cookies" +acceptCookies);
    }
    public void clickOnSignUpButton() {
        clickOnElement(signUpLink);
        log.info("Clicking on Signup link" +signUpLink);
    }
    public void enterFirstName(String name) {
        sendTextToElement(firstName,name);
        log.info("Enter First Name" +firstName);
    }
    public void enterLastName(String lastname) {
        sendTextToElement(lastName,lastname);
        log.info("Enter Last Name" +lastname);
    }

    public void clickOnContinueBtn() {
        clickOnElement(continueBtn);
        log.info("Click on continue" +continueBtn);
    }


    public void enterEmail(String email) {
        sendTextToElement(emailId,email);
        log.info("Enter Email" +emailId);
    }
    public void enterPassword(String pword) {
        sendTextToElement(password,pword);
        log.info("Enter password" +password);
    }

    public void enterMobileNumber(String num){
        sendTextToElement(mobileNum,num);
        log.info("Enter Mobile" +mobileNum);
    }

    public void selectDay(){
        selectByVisibleTextFromDropDown(day,"3");
        log.info("Selecting Day" +day);
    }

    public void selectMonth(){
        selectByVisibleTextFromDropDown(month,"March");
        log.info("Selecting Month" +month);
    }
    public void selectYear(){
        selectByVisibleTextFromDropDown(year,"1991");
        log.info("Selecting Year" +year);
    }
    public void clickOnEnterManually(){
        clickOnElement(enterManualAdd);
        log.info("Click on enter manually" +enterManualAdd);

    }
    public void enterAdd1(String add){
        sendTextToElement(address1,add);
        log.info("Enter house numbre" +address1);
    }
    public void enterCity(String add){
        sendTextToElement(city,add);
        log.info("Enter city" +city);
    }

    public void enterZip(String add){
        sendTextToElement(zipCode,add);
        log.info("Enter Zipcode" +zipCode);
    }

    public void clickOnContinue(){
        clickOnElement(nextContinue);
        log.info("Click on continue" +nextContinue);

    }
    public String getText(){
        String prc = getTextFromElement(textMarketingCommunication);
        log.info("Getting Text" + textMarketingCommunication.toString());
        return prc;
    }


}
