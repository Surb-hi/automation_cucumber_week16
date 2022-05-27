package pages;

import com.automationpractice.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement DressesTab;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement WomenTab;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[2]/ul[1]/li[1]/div[1]/a[1]/img[1]")
    WebElement CASUALDRESSES;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement top;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
    WebElement PrintedDress;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement FadedShortSleeveTshirts;

    @FindBy(xpath = "//p[@id='product_reference']/span")
    WebElement demotext;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement productQuantity;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCardProduct;

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement crossbutton;

    public void getcategory(String category) {
        if (category.equalsIgnoreCase("Dresses")) {
            clickOnElement(DressesTab);
            log.info("Clicking on dresses" + DressesTab.toString() + "<br>");
        }
        if (category.equalsIgnoreCase("Women")) {
            clickOnElement(WomenTab);
            log.info("Clicking on Women " + WomenTab.toString() + "<br>");
        }
    }

    public void getsubCategory(String subCategory) {
        if (subCategory.equalsIgnoreCase("Casual Dresses")) {
            clickOnElement(CASUALDRESSES);
            log.info("Clicking on subCategory " + DressesTab.toString() + "<br>");
        }
        if (subCategory.equalsIgnoreCase("Tops")) {
            clickOnElement(top);
            log.info("Clicking on subCategory " + top.toString() + "<br>");
        }
    }

    public void getname(String name) {
        if (name.equalsIgnoreCase("Printed Dress")) {
            clickOnElement(PrintedDress);
            log.info("Clicking on name Printed Dress " + PrintedDress.toString() + "<br>");
        }
        if (name.equalsIgnoreCase("Faded Short Sleeve T-shirts")) {
            clickOnElement(FadedShortSleeveTshirts);
            log.info("Clicking on Faded Short Sleeve T-shirts " + FadedShortSleeveTshirts.toString() + "<br>");
        }

    }

    public String verifytext() {
        log.info("getting  text from text " + demotext.toString() + "<br>");
        return getTextFromElement(demotext);
    }

    public void setClearProductQuantity() {
        sendTextToElementclear(productQuantity);
        log.info("Enter ProductQuantity" + productQuantity.toString() + "<br>");
    }

    public void setProductQuantity(String qty) {
        sendTextToElement(productQuantity, qty);
        log.info("Enter ProductQuantity " + qty + " to quantity field " + productQuantity.toString() + "<br>");
    }

    public void setAddToCardProduct() {
        clickOnElement(addToCardProduct);
        log.info("Clicking on addToCardProduct" + addToCardProduct.toString() + "<br>");
    }

    public void canclecrossbutton() {
        clickOnElement(crossbutton);
        log.info("Clicking on crossbutton" + crossbutton.toString() + "<br>");
    }
}



