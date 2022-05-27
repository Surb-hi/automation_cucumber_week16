package pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singinpage extends Utility {
    private static final Logger log = LogManager.getLogger(Singinpage.class.getName());

    public Singinpage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement registerEmail;

    public void setRegisterEmail(String email) {
        sendTextToElement(registerEmail, email);
        log.info("Enter email" + email + " to  field " + registerEmail.toString() + "<br>");
    }
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountText;

    public void setcreateAaccount() {
        clickOnElement(createAnAccountText);
        log.info("Clicking on createaccount" + createAnAccountText.toString() + "<br>");
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signInButtonField;

    public void setEmailAddressField(String emailaddressfield) {
        sendTextToElement(emailAddressField, emailaddressfield);
        log.info("Enter email" + emailaddressfield + " to  field " + emailAddressField.toString() + "<br>");
    }

    public void setPasswordField(String passwordfield) {
        sendTextToElement(passwordField, passwordfield);
        log.info("Enter passwordfield" + passwordfield + " to  field " + passwordField.toString() + "<br>");
    }

    public void clickOnSignIn() {
        clickOnElement(signInButtonField);
        log.info("Clicking on signInButtonField" + signInButtonField.toString() + "<br>");
    }


}
