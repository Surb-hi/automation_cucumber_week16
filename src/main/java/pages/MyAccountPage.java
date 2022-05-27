package pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AuthPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My addresses')]")
    WebElement Myaddresses;

    public void clickOnMyaddresses() {
        clickOnElement(Myaddresses);
        log.info("Clicking on My addresses" + Myaddresses.toString() + "<br>");
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='bloc_adresses row']")
    List<WebElement> Addresstext;

    public String[] getaddresstext(){
        String [] a=new String[8];
        for(int i=1; i< Addresstext.size()-1;i++){
            String b=Addresstext.get(i).getText();
            a[i-1]=b;
        }
        return  a;
    }
}
