$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Checkout.feature");
formatter.feature({
  "line": 2,
  "name": "Verify multiple scenarios on Checkout Page",
  "description": "",
  "id": "verify-multiple-scenarios-on-checkout-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2835466615,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I open the given website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify the Url",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I navigate to normal product page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Add to cart button is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on cart button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I click on Proceed to Checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "it redirects to Checkout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 64413704092,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 11371560,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPage.i_navigate_to_normal_product_page()"
});
formatter.result({
  "duration": 6161191022,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPage.add_to_cart_button_is_visible()"
});
formatter.result({
  "duration": 19905,
  "status": "passed"
});
formatter.match({
  "location": "GlobalCart.i_click_on_cart_button()"
});
formatter.result({
  "duration": 5133117289,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_click_on_Proceed_to_Checkout_button()"
});
formatter.result({
  "duration": 14568474120,
  "status": "passed"
});
formatter.match({
  "location": "Cart.it_redirects_to_Checkout_Page()"
});
formatter.result({
  "duration": 32366213,
  "status": "passed"
});
formatter.scenario({
  "line": 170,
  "name": "Verify user is able to place order if all mandatory fields are filled for Poland",
  "description": "",
  "id": "verify-multiple-scenarios-on-checkout-page;verify-user-is-able-to-place-order-if-all-mandatory-fields-are-filled-for-poland",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 169,
      "name": "@P1Pl"
    }
  ]
});
formatter.step({
  "line": 171,
  "name": "I enter all the mandatory fields of Ship to Section for Poland",
  "keyword": "When "
});
formatter.step({
  "line": 172,
  "name": "I click on Next for Poland",
  "keyword": "And "
});
formatter.step({
  "line": 173,
  "name": "I click on Ship method Next button for Poland",
  "keyword": "And "
});
formatter.step({
  "line": 174,
  "name": "I enter all the mandatory valid card information and click on Next button for Poland",
  "keyword": "When "
});
formatter.step({
  "line": 175,
  "name": "I select terms and conditions",
  "keyword": "When "
});
formatter.step({
  "line": 176,
  "name": "I click on Place order button for Poland",
  "keyword": "And "
});
formatter.step({
  "line": 177,
  "name": "Order gets placed successfully for Poland",
  "keyword": "Then "
});
formatter.match({
  "location": "Checkout.i_enter_all_the_mandatory_fields_of_Ship_to_Section_for_Poland()"
});
formatter.result({
  "duration": 5592463433,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_click_on_Next_for_Poland()"
});
formatter.result({
  "duration": 449602070,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_click_on_Ship_method_Next_button_for_Poland()"
});
formatter.result({
  "duration": 7436933933,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_enter_all_the_mandatory_valid_card_information_and_click_on_Next_button_for_Poland()"
});
formatter.result({
  "duration": 2527072610,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_select_terms_and_conditions()"
});
formatter.result({
  "duration": 1205729321,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_click_on_Place_order_button_for_Poland()"
});
formatter.result({
  "duration": 398310003,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.order_gets_placed_successfully_for_Poland()"
});
formatter.result({
  "duration": 15882405245,
  "status": "passed"
});
formatter.after({
  "duration": 610121012,
  "status": "passed"
});
});