package pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPage extends Utility {
    private static final Logger log = LogManager.getLogger(AuthPage.class.getName());

    public AuthPage() {

        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement Title;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement Firstname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement Lastname;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement Email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement Password;
    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement DateofBirth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement MonthofBirth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement YearofBirth;
    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletterBox;
    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement specialOffersBox;
    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement addressFirstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement addressLastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipPostalCodeField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhoneField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement assignAnAddressaLiasForFutureReference;
    @CacheLookup
    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerbutton;

    public void setTitle() {
        clickOnElement(Title);
        log.info("Clicking on Title" + Title.toString() + "<br>");
    }

    public void setFirstname(String firstname) {
        sendTextToElement(Firstname, firstname);
        log.info("Enter firstname" + firstname + " to firstname field " + Firstname.toString() + "<br>");
    }

    public void setLastname(String lastname) {
        sendTextToElement(Lastname, lastname);
        log.info("Enter lastname " + lastname + " to lastname  field " + Lastname.toString() + "<br>");
    }

    public void setEmailAddress(String emailAddress) {
        sendTextToElement(Email, emailAddress);
        log.info("Enter emailAddress" + emailAddress + " to emailAddress field " + Email.toString() + "<br>");
    }

    public void setpassword(String passwordfield) {
        sendTextToElement(Password, passwordfield);
        log.info("Enter passwordfield" + passwordfield + " to  field " + Password.toString() + "<br>");
    }

    public void selectBirthDate(String birthDate) {
        selectByValueFromDropDown(DateofBirth, birthDate);
        log.info("Selecting birthDate " + birthDate + " from dropdown " + DateofBirth.toString() + "<br>");
    }

    public void selectBirthMonth(String birthMonth1) {
        selectByValueFromDropDown(MonthofBirth, birthMonth1);
        log.info("Selecting birthMonth" + birthMonth1 + " from dropdown " + MonthofBirth.toString() + "<br>");
    }

    public void selectBirthYear(String birthYear) {
        selectByValueFromDropDown(YearofBirth, birthYear);
        log.info("Selecting birthYear" + birthYear + " from dropdown " + YearofBirth.toString() + "<br>");
    }

    public void clicknewnewsletter() {

        clickOnElement(newsletterBox);
        log.info("Clicking on newsletterBox" + newsletterBox.toString() + "<br>");
    }

    public void clickonspecialoffer() {

        clickOnElement(specialOffersBox);
        log.info("Clicking on specialOffersBox" + specialOffersBox.toString() + "<br>");
    }

    public void setAddressFirstname(String addressfirstname) {
        sendTextToElement(addressFirstName, addressfirstname);
        log.info("Enter addressfirstname" + addressfirstname + " to  field " + addressFirstName.toString() + "<br>");
    }

    public void setAddressLastname(String addresslastname) {
        sendTextToElement(addressLastName, addresslastname);
        log.info("Enter addresslastname " + addresslastname + " to  field " + addressLastName.toString() + "<br>");
    }

    public void setAddress(String address) {
        sendTextToElement(addressField, address);
        log.info("Enter address" + address + " to  field " + addressField.toString() + "<br>");
    }

    public void setCity(String City) {
        sendTextToElement(cityField, City);
        log.info("Enter City" + City + " to  field " + cityField.toString() + "<br>");
    }

    public void setState(String state) {
        sendTextToElement(stateField, state);
        log.info("Enter state " + state + " to  field " + stateField.toString() + "<br>");
    }

    public void setZipPostalCode(String zipPostalCode) {
        sendTextToElement(zipPostalCodeField, zipPostalCode);
        log.info("Enter zipPostalCode" + zipPostalCode + " to  field " + zipPostalCodeField.toString() + "<br>");
    }

    public void setCountry(String country) {
        selectByVisibleTextFromDropDown(countryField, country);
        log.info("Selecting country" + country + " from dropdown " + countryField.toString() + "<br>");
    }

    public void setMobilePhone(String mobilePhone) {
        sendTextToElement(mobilePhoneField, mobilePhone);
        log.info("Enter mobilePhone " + mobilePhone + " to  field " + mobilePhoneField.toString() + "<br>");
    }

    public void setAssignAnAddressaLiasForFutureReference(String referenceAddress) {
        sendTextToElement(assignAnAddressaLiasForFutureReference, referenceAddress);
        log.info("Enter referenceAddress" + referenceAddress + " to  field " + assignAnAddressaLiasForFutureReference.toString() + "<br>");
    }

    public void clickOnRegister() {
        clickOnElement(registerbutton);
        log.info("Clicking on registerbutton " + registerbutton.toString() + "<br>");
    }

}
