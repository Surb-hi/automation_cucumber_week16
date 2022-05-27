package pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactPage.class.getName());

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[3]/a[1]")
    WebElement Contactus;

    public void ClickOnContactus(){
    log.info("Clicking on Contact us"+ Contactus.toString()+ "<br>");
        clickOnElement(Contactus);
    }
    @FindBy(xpath = "//select[@id='id_contact']")
    WebElement customerconnect;

    public void selectcustomerconnect(String  customer) {
        log.info("Selecting "+customer +" from dropdown "+customerconnect.toString() + "<br>");
        selectByValueFromDropDown(customerconnect,customer);
    }
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement message;

    public void setmessageText(String message1){
        log.info("Enter  "+message + " to  field "+ message1.toString() + "<br>");
        sendTextToElement(message,message1);
    }
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]")
    WebElement send;

    public void ClickOnsend (){
        log.info("Clicking on send"+ send.toString()+ "<br>");
        clickOnElement(send);
    }
}
