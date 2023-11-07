$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/addToCart.feature");
formatter.feature({
  "name": "Adding a Product to the Cart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@add"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "definitionSteps.Steps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters benammaromar0@gmail.com and 00112233",
  "keyword": "When "
});
formatter.match({
  "location": "definitionSteps.Steps.user_enters_email_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "definitionSteps.Steps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user on the website",
  "keyword": "Then "
});
formatter.match({
  "location": "definitionSteps.Steps.user_on_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on specific item",
  "keyword": "When "
});
formatter.match({
  "location": "definitionSteps.Steps.the_user_clicks_on_specific_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a specific product",
  "keyword": "And "
});
formatter.match({
  "location": "definitionSteps.Steps.the_user_selects_a_specific_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "definitionSteps.Steps.the_user_should_be_on_the_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a Product to the Cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@add"
    }
  ]
});
formatter.step({
  "name": "the user add the product to the Cart",
  "keyword": "When "
});
formatter.match({
  "location": "definitionSteps.Steps.the_user_add_the_product_to_the_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the cart should contain the added product",
  "keyword": "Then "
});
formatter.match({
  "location": "definitionSteps.Steps.the_cart_should_contain_the_added_product()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});