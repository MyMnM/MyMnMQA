$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/MyAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Verify multiple scenarios on MyAccount Page",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 58,
  "name": "Verify user is able to add new address,edit and delete it",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-add-new-address,edit-and-delete-it",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 57,
      "name": "@MyAccount"
    },
    {
      "line": 57,
      "name": "@P1"
    },
    {
      "line": 57,
      "name": "@P2"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "I enter username as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "click on Account Settings",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "My Account title is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "I click on Add new address button",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "I enter all the valid values in all the mandatory fields",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "it should display new Addresss",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "i click on Edit button",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "edit the Address",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "it should display the updated address",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "I click on Delete Address",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "it should delete the address",
  "keyword": "Then "
});
formatter.examples({
  "line": 75,
  "name": "",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-add-new-address,edit-and-delete-it;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 76,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-add-new-address,edit-and-delete-it;;1"
    },
    {
      "cells": [
        "mmsuk@gmail.com",
        "automation@123"
      ],
      "line": 77,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-add-new-address,edit-and-delete-it;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3590737389,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I open the given website",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "verify the Url",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 57286595447,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 13548548,
  "status": "passed"
});
formatter.scenario({
  "line": 77,
  "name": "Verify user is able to add new address,edit and delete it",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-add-new-address,edit-and-delete-it;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 57,
      "name": "@P1"
    },
    {
      "line": 57,
      "name": "@P2"
    },
    {
      "line": 57,
      "name": "@MyAccount"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "I enter username as \"mmsuk@gmail.com\" and password as \"automation@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "click on Account Settings",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "My Account title is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "I click on Add new address button",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "I enter all the valid values in all the mandatory fields",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "it should display new Addresss",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "i click on Edit button",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "edit the Address",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "it should display the updated address",
  "keyword": "Then "
});
formatter.step({
  "line": 73,
  "name": "I click on Delete Address",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "it should delete the address",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_click_on_Login_icon()"
});
formatter.result({
  "duration": 116051191,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mmsuk@gmail.com",
      "offset": 21
    },
    {
      "val": "automation@123",
      "offset": 55
    }
  ],
  "location": "homePage.i_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 5282733409,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 7073305032,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_am_successfully_logged_in()"
});
formatter.result({
  "duration": 11121200473,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.click_on_Account_Settings()"
});
formatter.result({
  "duration": 83446228,
  "status": "passed"
});
formatter.match({
  "location": "homePage.my_Account_title_is_visible()"
});
formatter.result({
  "duration": 10962973813,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Add_new_address_button()"
});
formatter.result({
  "duration": 421670088,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_enter_all_the_valid_values_in_all_the_mandatory_fields()"
});
formatter.result({
  "duration": 1042000684,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_button()"
});
formatter.result({
  "duration": 3147412142,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_should_display_new_Addresss()"
});
formatter.result({
  "duration": 8078364123,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Edit_button()"
});
formatter.result({
  "duration": 427863097,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.edit_the_Address()"
});
formatter.result({
  "duration": 369866890,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_button()"
});
formatter.result({
  "duration": 3123797350,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_should_display_the_updated_address()"
});
formatter.result({
  "duration": 9089387634,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Delete_Address()"
});
formatter.result({
  "duration": 124097779,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_should_delete_the_address()"
});
formatter.result({
  "duration": 14048667040,
  "status": "passed"
});
formatter.after({
  "duration": 586272625,
  "status": "passed"
});
});