package com.automationpractice.steps;

import com.automationpractice.utility.Utility;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;

import java.util.List;

public class Onlineshoping {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @Then("^Navigate to SignUp page$")
    public void navigateToSignUpPage() {
        new HomePage().clickOnSinInTab();
        new Singinpage().setRegisterEmail(Utility.getRandomString(8)+"@gmail.com");
        new Singinpage().setcreateAaccount();
    }

    @And("^create an account with random username$")
    public void createAnAccountWithRandomUsername() {
       // new AuthPage().setEmailAddress("mummypigwanttologin@gmail.com");
        new AuthPage().setTitle();
        new AuthPage().setFirstname("mummupig");
        new AuthPage().setLastname("papapig");
        new AuthPage().setpassword("mummypig123");
        new AuthPage().selectBirthDate("1");
        new AuthPage().selectBirthMonth("5");
        new AuthPage().selectBirthYear("1995");
        new AuthPage().clicknewnewsletter();
        new AuthPage().clickonspecialoffer();
        new AuthPage().setAddressFirstname("mummupig");
        new AuthPage().setAddressLastname("papapig");
        new AuthPage().setAddress("143 mummypig and papapig sweet home");
        new AuthPage().setCity("london");
        new AuthPage().setState("east middland");
        new AuthPage().setZipPostalCode("3800034");
        new AuthPage().setCountry("United States");
        new AuthPage().setMobilePhone("0909090909");
        new AuthPage().setAssignAnAddressaLiasForFutureReference("welcome to our sweeethome");
        new AuthPage().clickOnRegister();
    }

    @Given("^I am on the Sign In Page$")
    public void iAmOnTheSignInPage() {
    }

    @When("^Login using newly create credentials$")
    public void loginUsingNewlyCreateCredentials() {
        new HomePage().clickOnSinInTab();
        new Singinpage().setEmailAddressField("mummypig5151@gmail.com");
        new Singinpage().setPasswordField("mummypig5151");
        new Singinpage().clickOnSignIn();
    }

    @Then("^I shall verify the address information in my address section$")
    public void iShallVerifyTheAddressInformationInMyAddressSection() {
    new MyAccountPage().clickOnMyaddresses();
        new MyAccountPage().clickOnMyaddresses();
        String[]expected={"12,main street","Leeds, Ohio 32512","United States"};
        for(int i=3;i<expected.length;i++){
            System.out.println(new MyAccountPage().getaddresstext()[i]);
            Assert.assertEquals("",expected[i],new MyAccountPage().getaddresstext());
        }
    }

    @And("^I add below product to cart$")
    public void iAddBelowProductToCart(DataTable dataTable) {
        List<List<String>> productcart=dataTable.asLists(String.class);
        for(List<String>data:productcart){
            new ProductPage().getcategory(data.get(0));
            new ProductPage().getsubCategory(data.get(1));
            new ProductPage().getname(data.get(2));
            Assert.assertEquals(data.get(3),new ProductPage().verifytext());
            new ProductPage().setClearProductQuantity();
            new ProductPage().setProductQuantity(data.get(4));
            new ProductPage().setAddToCardProduct();
            new ProductPage().canclecrossbutton();
        }

    }

    @And("^I am on the contact page$")
    public void iAmOnTheContactPage() {
        new ContactPage().ClickOnContactus();
    }

    @Then("^I send refund request to customer care for previous order$")
    public void iSendRefundRequestToCustomerCareForPreviousOrder() {
        new ContactPage().selectcustomerconnect("&nbsp");
        new ContactPage().setmessageText("I want refund");
        new ContactPage().ClickOnsend();
    }
}
