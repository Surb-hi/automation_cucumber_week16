$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineshoping.feature");
formatter.feature({
  "line": 1,
  "name": "Create new account",
  "description": "As user i like to signup",
  "id": "create-new-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5977958700,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Contact customer service for the previous successful order",
  "description": "",
  "id": "create-new-account;contact-customer-service-for-the-previous-successful-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I am on the contact page",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I send refund request to customer care for previous order",
  "keyword": "Then "
});
formatter.match({
  "location": "Onlineshoping.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 107200800,
  "status": "passed"
});
formatter.match({
  "location": "Onlineshoping.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 7691227200,
  "status": "passed"
});
formatter.match({
  "location": "Onlineshoping.iAmOnTheContactPage()"
});
formatter.result({
  "duration": 1950191700,
  "status": "passed"
});
formatter.match({
  "location": "Onlineshoping.iSendRefundRequestToCustomerCareForPreviousOrder()"
});
formatter.result({
  "duration": 20082113500,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate option with value: \u0026nbsp\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027LAPTOP-UEJFETJP\u0027, ip: \u0027192.168.0.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.Select.findOptionsByValue(Select.java:287)\r\n\tat org.openqa.selenium.support.ui.Select.selectByValue(Select.java:190)\r\n\tat com.automationpractice.utility.Utility.selectByValueFromDropDown(Utility.java:158)\r\n\tat pages.ContactPage.selectcustomerconnect(ContactPage.java:28)\r\n\tat com.automationpractice.steps.Onlineshoping.iSendRefundRequestToCustomerCareForPreviousOrder(Onlineshoping.java:96)\r\n\tat ✽.Then I send refund request to customer care for previous order(onlineshoping.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 113038800,
  "status": "passed"
});
});