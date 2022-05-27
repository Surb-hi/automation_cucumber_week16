package pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement sinInTab;

    public void clickOnSinInTab() {
        clickOnElement(sinInTab);
        log.info("Clicking on sinInTab" + sinInTab.toString() + "<br>");
    }
}
