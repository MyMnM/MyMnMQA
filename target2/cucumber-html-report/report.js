$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/MyAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Verify multiple scenarios on MyAccount Page",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Verify user is able to navigate to account settings after logging with valid credentials",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-navigate-to-account-settings-after-logging-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@MyAccount"
    },
    {
      "line": 6,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter username as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on Account Settings",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "it navigates to Account settings page",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-navigate-to-account-settings-after-logging-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 16,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-navigate-to-account-settings-after-logging-with-valid-credentials;;1"
    },
    {
      "cells": [
        "mmsuk@gmail.com",
        "automation@123"
      ],
      "line": 17,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-navigate-to-account-settings-after-logging-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3270423275,
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
  "duration": 49086793867,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 8057785,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify user is able to navigate to account settings after logging with valid credentials",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-user-is-able-to-navigate-to-account-settings-after-logging-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@P1"
    },
    {
      "line": 6,
      "name": "@MyAccount"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter username as \"mmsuk@gmail.com\" and password as \"automation@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "click on Account Settings",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "it navigates to Account settings page",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_click_on_Login_icon()"
});
formatter.result({
  "duration": 100570069,
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
  "duration": 5310640667,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 7071694657,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_am_successfully_logged_in()"
});
formatter.result({
  "duration": 11106038440,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.click_on_Account_Settings()"
});
formatter.result({
  "duration": 87848479,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_navigates_to_Account_settings_page()"
});
formatter.result({
  "duration": 4010579710,
  "status": "passed"
});
formatter.after({
  "duration": 650835355,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Verify validation message displays for empty or on entering invalid details in my information and edit information",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-validation-message-displays-for-empty-or-on-entering-invalid-details-in-my-information-and-edit-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@MyAccount"
    },
    {
      "line": 19,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click on Create an Account",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter username as \"\u003cusername\u003e\" password as \"\u003cpassword\u003e\" and Re-enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on email subscribe check box",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on Sign Up button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "My Account title is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I click on edit link",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I click on Save button with all fields empty",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "it should display the validation error message",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I enter email id in invalid format",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "it should display appropriate error message",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I update firstName as \"\u003cfirstName\u003e\",lastName as \"\u003clastName\u003e\" and email as \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "it should gets updated",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-validation-message-displays-for-empty-or-on-entering-invalid-details-in-my-information-and-edit-information;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstName",
        "lastName",
        "Email"
      ],
      "line": 38,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-validation-message-displays-for-empty-or-on-entering-invalid-details-in-my-information-and-edit-information;;1"
    },
    {
      "cells": [
        "asdefghi@gmail.com",
        "automation@123",
        "first",
        "last",
        "newEmail@gmail.com"
      ],
      "line": 39,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-validation-message-displays-for-empty-or-on-entering-invalid-details-in-my-information-and-edit-information;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2153534553,
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
  "duration": 46617184799,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 10206195,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Verify validation message displays for empty or on entering invalid details in my information and edit information",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-validation-message-displays-for-empty-or-on-entering-invalid-details-in-my-information-and-edit-information;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@P1"
    },
    {
      "line": 19,
      "name": "@MyAccount"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click on Create an Account",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter username as \"asdefghi@gmail.com\" password as \"automation@123\" and Re-enter password as \"automation@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on email subscribe check box",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on Sign Up button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "My Account title is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I click on edit link",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I click on Save button with all fields empty",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "it should display the validation error message",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I enter email id in invalid format",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "it should display appropriate error message",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I update firstName as \"first\",lastName as \"last\" and email as \"newEmail@gmail.com\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "it should gets updated",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_click_on_Login_icon()"
});
formatter.result({
  "duration": 136850781,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Create_an_Account()"
});
formatter.result({
  "duration": 571269516,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asdefghi@gmail.com",
      "offset": 21
    },
    {
      "val": "automation@123",
      "offset": 54
    },
    {
      "val": "automation@123",
      "offset": 96
    }
  ],
  "location": "homePage.i_enter_username_as_password_as_and_Re_enter_password_as(String,String,String)"
});
formatter.result({
  "duration": 1037579772,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_email_subscribe_check_box()"
});
formatter.result({
  "duration": 46710518,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_Up_button()"
});
formatter.result({
  "duration": 5048388692,
  "status": "passed"
});
formatter.match({
  "location": "homePage.my_Account_title_is_visible()"
});
formatter.result({
  "duration": 6044811843,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_edit_link()"
});
formatter.result({
  "duration": 81385830,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_button_with_all_fields_empty()"
});
formatter.result({
  "duration": 536034397,
  "status": "passed"
});
formatter.match({
  "location": "homePage.it_should_display_the_validation_error_message()"
});
formatter.result({
  "duration": 6037336257,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_enter_email_id_in_invalid_format()"
});
formatter.result({
  "duration": 119403806,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_button()"
});
formatter.result({
  "duration": 3089848541,
  "status": "passed"
});
formatter.match({
  "location": "homePage.it_should_display_appropriate_error_message()"
});
formatter.result({
  "duration": 6037221186,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "first",
      "offset": 23
    },
    {
      "val": "last",
      "offset": 43
    },
    {
      "val": "newEmail@gmail.com",
      "offset": 63
    }
  ],
  "location": "MyAccount.i_update_firstName_as_lastName_as_and_email_as(String,String,String)"
});
formatter.result({
  "duration": 5460418922,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_button()"
});
formatter.result({
  "duration": 3059084095,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_should_gets_updated()"
});
formatter.result({
  "duration": 15133935436,
  "status": "passed"
});
formatter.after({
  "duration": 681048703,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 43,
  "name": "Verify validation message displays for empty or on entering invalid details in address book",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-validation-message-displays-for-empty-or-on-entering-invalid-details-in-address-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@MyAccount"
    },
    {
      "line": 42,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "I enter username as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "click on Account Settings",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "My Account title is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "I click on edit link on My Address Book",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "I click on Save with all mandatory fields empty",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "it should display all the appropriate error messages",
  "keyword": "Then "
});
formatter.examples({
  "line": 53,
  "name": "",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-validation-message-displays-for-empty-or-on-entering-invalid-details-in-address-book;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "firstName",
        "lastName",
        "Email"
      ],
      "line": 54,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-validation-message-displays-for-empty-or-on-entering-invalid-details-in-address-book;;1"
    },
    {
      "cells": [
        "mmsuk@gmail.com",
        "automation@123",
        "first",
        "last",
        "newEmail@gmail.com"
      ],
      "line": 55,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-validation-message-displays-for-empty-or-on-entering-invalid-details-in-address-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2606750638,
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
  "duration": 46770507247,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 6908005,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Verify validation message displays for empty or on entering invalid details in address book",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-validation-message-displays-for-empty-or-on-entering-invalid-details-in-address-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 42,
      "name": "@P1"
    },
    {
      "line": 42,
      "name": "@MyAccount"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "I enter username as \"mmsuk@gmail.com\" and password as \"automation@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "click on Account Settings",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "My Account title is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 50,
  "name": "I click on edit link on My Address Book",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "I click on Save with all mandatory fields empty",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "it should display all the appropriate error messages",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_click_on_Login_icon()"
});
formatter.result({
  "duration": 126089756,
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
  "duration": 5335069975,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 7081599802,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_am_successfully_logged_in()"
});
formatter.result({
  "duration": 11107434845,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.click_on_Account_Settings()"
});
formatter.result({
  "duration": 61605399,
  "status": "passed"
});
formatter.match({
  "location": "homePage.my_Account_title_is_visible()"
});
formatter.result({
  "duration": 9656764633,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_edit_link_on_My_Address_Book()"
});
formatter.result({
  "duration": 473580580,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_with_all_mandatory_fields_empty()"
});
formatter.result({
  "duration": 746324252,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_should_display_all_the_appropriate_error_messages()"
});
formatter.result({
  "duration": 36240431983,
  "status": "passed"
});
formatter.after({
  "duration": 592379175,
  "status": "passed"
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
  "duration": 2071585184,
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
  "duration": 49853572184,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 5749207,
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
  "duration": 120892580,
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
  "duration": 5283178765,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 7072872738,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_am_successfully_logged_in()"
});
formatter.result({
  "duration": 11129459477,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.click_on_Account_Settings()"
});
formatter.result({
  "duration": 47104870,
  "status": "passed"
});
formatter.match({
  "location": "homePage.my_Account_title_is_visible()"
});
formatter.result({
  "duration": 10565491697,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Add_new_address_button()"
});
formatter.result({
  "duration": 428909001,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_enter_all_the_valid_values_in_all_the_mandatory_fields()"
});
formatter.result({
  "duration": 976716739,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_button()"
});
formatter.result({
  "duration": 3122000062,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_should_display_new_Addresss()"
});
formatter.result({
  "duration": 8075605524,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Edit_button()"
});
formatter.result({
  "duration": 445348324,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.edit_the_Address()"
});
formatter.result({
  "duration": 360306960,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_button()"
});
formatter.result({
  "duration": 3129663806,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_should_display_the_updated_address()"
});
formatter.result({
  "duration": 9084313304,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Delete_Address()"
});
formatter.result({
  "duration": 109864402,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_should_delete_the_address()"
});
formatter.result({
  "duration": 14029214094,
  "status": "passed"
});
formatter.after({
  "duration": 601750948,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 81,
  "name": "Verify change pasword is working",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-change-pasword-is-working",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 80,
      "name": "@MyAccount"
    },
    {
      "line": 80,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 82,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 83,
  "name": "I click on Create an Account",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "I enter username as \"\u003cusername\u003e\" password as \"\u003cpassword\u003e\" and Re-enter password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "I click on email subscribe check box",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "I click on Sign Up button",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "My Account title is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "I click on Change Password",
  "keyword": "When "
});
formatter.step({
  "line": 89,
  "name": "I change the old password as \"\u003cold Password\u003e\" with  new passowrd as \"\u003cnew Password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "it should display password change success message",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "I logout of the application",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "I log in again using new password",
  "keyword": "When "
});
formatter.step({
  "line": 94,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.examples({
  "line": 96,
  "name": "",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-change-pasword-is-working;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "old Password",
        "new Password"
      ],
      "line": 97,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-change-pasword-is-working;;1"
    },
    {
      "cells": [
        "asdefghi@gmail.com",
        "automation@123",
        "automation@123",
        "newPass"
      ],
      "line": 98,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-change-pasword-is-working;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2144078186,
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
  "duration": 50272902593,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 5798657,
  "status": "passed"
});
formatter.scenario({
  "line": 98,
  "name": "Verify change pasword is working",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-change-pasword-is-working;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 80,
      "name": "@P1"
    },
    {
      "line": 80,
      "name": "@MyAccount"
    }
  ]
});
formatter.step({
  "line": 82,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 83,
  "name": "I click on Create an Account",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "I enter username as \"asdefghi@gmail.com\" password as \"automation@123\" and Re-enter password as \"automation@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "I click on email subscribe check box",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "I click on Sign Up button",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "My Account title is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "I click on Change Password",
  "keyword": "When "
});
formatter.step({
  "line": 89,
  "name": "I change the old password as \"automation@123\" with  new passowrd as \"newPass\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "I click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "it should display password change success message",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "I logout of the application",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "I log in again using new password",
  "keyword": "When "
});
formatter.step({
  "line": 94,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_click_on_Login_icon()"
});
formatter.result({
  "duration": 118658954,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Create_an_Account()"
});
formatter.result({
  "duration": 570133731,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asdefghi@gmail.com",
      "offset": 21
    },
    {
      "val": "automation@123",
      "offset": 54
    },
    {
      "val": "automation@123",
      "offset": 96
    }
  ],
  "location": "homePage.i_enter_username_as_password_as_and_Re_enter_password_as(String,String,String)"
});
formatter.result({
  "duration": 1001302792,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_email_subscribe_check_box()"
});
formatter.result({
  "duration": 48339554,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_Up_button()"
});
formatter.result({
  "duration": 5050894445,
  "status": "passed"
});
formatter.match({
  "location": "homePage.my_Account_title_is_visible()"
});
formatter.result({
  "duration": 6039049264,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Change_Password()"
});
formatter.result({
  "duration": 130025814,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation@123",
      "offset": 30
    },
    {
      "val": "newPass",
      "offset": 69
    }
  ],
  "location": "MyAccount.i_change_the_old_password_as_with_new_passowrd_as(String,String)"
});
formatter.result({
  "duration": 391424395,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_button()"
});
formatter.result({
  "duration": 3074289357,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_should_display_password_change_success_message()"
});
formatter.result({
  "duration": 18038,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_logout_of_the_application()"
});
formatter.result({
  "duration": 5652771973,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_log_in_again_using_new_password()"
});
formatter.result({
  "duration": 8934680599,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_am_successfully_logged_in()"
});
formatter.result({
  "duration": 15566730112,
  "status": "passed"
});
formatter.after({
  "duration": 599632705,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 102,
  "name": "Verify on clicking detail link in recent order it opens detail for that particular order",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-on-clicking-detail-link-in-recent-order-it-opens-detail-for-that-particular-order",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 101,
      "name": "@MyAccount"
    },
    {
      "line": 101,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 103,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 104,
  "name": "I enter username as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "click on Account Settings",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "it navigates to Account settings page",
  "keyword": "Then "
});
formatter.step({
  "line": 109,
  "name": "I click on Order Details",
  "keyword": "When "
});
formatter.step({
  "line": 110,
  "name": "it opens detail for that particular order",
  "keyword": "Then "
});
formatter.examples({
  "line": 111,
  "name": "",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-on-clicking-detail-link-in-recent-order-it-opens-detail-for-that-particular-order;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 112,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-on-clicking-detail-link-in-recent-order-it-opens-detail-for-that-particular-order;;1"
    },
    {
      "cells": [
        "mmsuk@gmail.com",
        "automation@123"
      ],
      "line": 113,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-on-clicking-detail-link-in-recent-order-it-opens-detail-for-that-particular-order;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2542813958,
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
  "duration": 44010966599,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 4647322,
  "status": "passed"
});
formatter.scenario({
  "line": 113,
  "name": "Verify on clicking detail link in recent order it opens detail for that particular order",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-on-clicking-detail-link-in-recent-order-it-opens-detail-for-that-particular-order;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 101,
      "name": "@P1"
    },
    {
      "line": 101,
      "name": "@MyAccount"
    }
  ]
});
formatter.step({
  "line": 103,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 104,
  "name": "I enter username as \"mmsuk@gmail.com\" and password as \"automation@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "click on Account Settings",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "it navigates to Account settings page",
  "keyword": "Then "
});
formatter.step({
  "line": 109,
  "name": "I click on Order Details",
  "keyword": "When "
});
formatter.step({
  "line": 110,
  "name": "it opens detail for that particular order",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_click_on_Login_icon()"
});
formatter.result({
  "duration": 103405486,
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
  "duration": 5293562232,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 7066999129,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_am_successfully_logged_in()"
});
formatter.result({
  "duration": 11139403184,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.click_on_Account_Settings()"
});
formatter.result({
  "duration": 50869254,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_navigates_to_Account_settings_page()"
});
formatter.result({
  "duration": 4007163961,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Order_Details()"
});
formatter.result({
  "duration": 5057627978,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_opens_detail_for_that_particular_order()"
});
formatter.result({
  "duration": 6035532438,
  "status": "passed"
});
formatter.after({
  "duration": 619617465,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 116,
  "name": "Verify on clicking product name in detail section of order it redirects to product page",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-on-clicking-product-name-in-detail-section-of-order-it-redirects-to-product-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 115,
      "name": "@MyAccount"
    },
    {
      "line": 115,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 117,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 118,
  "name": "I enter username as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 121,
  "name": "click on Account Settings",
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "it navigates to Account settings page",
  "keyword": "Then "
});
formatter.step({
  "line": 123,
  "name": "I click on Order Details",
  "keyword": "When "
});
formatter.step({
  "line": 124,
  "name": "i click on product name in detail section",
  "keyword": "When "
});
formatter.step({
  "line": 125,
  "name": "it redirects to specific Product page",
  "keyword": "Then "
});
formatter.examples({
  "line": 127,
  "name": "",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-on-clicking-product-name-in-detail-section-of-order-it-redirects-to-product-page;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 128,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-on-clicking-product-name-in-detail-section-of-order-it-redirects-to-product-page;;1"
    },
    {
      "cells": [
        "mmsuk@gmail.com",
        "automation@123"
      ],
      "line": 129,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-on-clicking-product-name-in-detail-section-of-order-it-redirects-to-product-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2521711140,
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
  "duration": 47908363190,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 4700193,
  "status": "passed"
});
formatter.scenario({
  "line": 129,
  "name": "Verify on clicking product name in detail section of order it redirects to product page",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-on-clicking-product-name-in-detail-section-of-order-it-redirects-to-product-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 115,
      "name": "@P1"
    },
    {
      "line": 115,
      "name": "@MyAccount"
    }
  ]
});
formatter.step({
  "line": 117,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 118,
  "name": "I enter username as \"mmsuk@gmail.com\" and password as \"automation@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 121,
  "name": "click on Account Settings",
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "it navigates to Account settings page",
  "keyword": "Then "
});
formatter.step({
  "line": 123,
  "name": "I click on Order Details",
  "keyword": "When "
});
formatter.step({
  "line": 124,
  "name": "i click on product name in detail section",
  "keyword": "When "
});
formatter.step({
  "line": 125,
  "name": "it redirects to specific Product page",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_click_on_Login_icon()"
});
formatter.result({
  "duration": 91343534,
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
  "duration": 5278948498,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 7066742863,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_am_successfully_logged_in()"
});
formatter.result({
  "duration": 11134725695,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.click_on_Account_Settings()"
});
formatter.result({
  "duration": 61997575,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_navigates_to_Account_settings_page()"
});
formatter.result({
  "duration": 4424261056,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Order_Details()"
});
formatter.result({
  "duration": 5077811781,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_product_name_in_detail_section()"
});
formatter.result({
  "duration": 118143621,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_redirects_to_specific_Product_page()"
});
formatter.result({
  "duration": 12890152080,
  "status": "passed"
});
formatter.after({
  "duration": 613463954,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 133,
  "name": "Verify save design is working and user is able to save designs for customized products",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-save-design-is-working-and-user-is-able-to-save-designs-for-customized-products",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 132,
      "name": "@MyAccount"
    },
    {
      "line": 132,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 134,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 135,
  "name": "I enter username as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 136,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 138,
  "name": "I navigate to customised product",
  "keyword": "When "
});
formatter.step({
  "line": 139,
  "name": "I click on Personalize button",
  "keyword": "And "
});
formatter.step({
  "line": 140,
  "name": "I close the pop up window",
  "keyword": "And "
});
formatter.step({
  "line": 141,
  "name": "I select a color of the product",
  "keyword": "When "
});
formatter.step({
  "line": 142,
  "name": "I click on Save Design button",
  "keyword": "And "
});
formatter.step({
  "line": 143,
  "name": "I click on Save To Account",
  "keyword": "When "
});
formatter.step({
  "line": 144,
  "name": "the design gets saved successfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 145,
  "name": "I click on My Account icon",
  "keyword": "When "
});
formatter.step({
  "line": 146,
  "name": "I click on Saved Design",
  "keyword": "And "
});
formatter.step({
  "line": 147,
  "name": "saved design should be present in saved designs panel",
  "keyword": "Then "
});
formatter.examples({
  "line": 150,
  "name": "",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-save-design-is-working-and-user-is-able-to-save-designs-for-customized-products;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 151,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-save-design-is-working-and-user-is-able-to-save-designs-for-customized-products;;1"
    },
    {
      "cells": [
        "mmsuk@gmail.com",
        "automation@123"
      ],
      "line": 152,
      "id": "verify-multiple-scenarios-on-myaccount-page;verify-save-design-is-working-and-user-is-able-to-save-designs-for-customized-products;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2657151209,
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
  "duration": 54807984388,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 4956460,
  "status": "passed"
});
formatter.scenario({
  "line": 152,
  "name": "Verify save design is working and user is able to save designs for customized products",
  "description": "",
  "id": "verify-multiple-scenarios-on-myaccount-page;verify-save-design-is-working-and-user-is-able-to-save-designs-for-customized-products;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 132,
      "name": "@P1"
    },
    {
      "line": 132,
      "name": "@MyAccount"
    }
  ]
});
formatter.step({
  "line": 134,
  "name": "I click on Login icon",
  "keyword": "When "
});
formatter.step({
  "line": 135,
  "name": "I enter username as \"mmsuk@gmail.com\" and password as \"automation@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 136,
  "name": "I click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "I am successfully logged in",
  "keyword": "Then "
});
formatter.step({
  "line": 138,
  "name": "I navigate to customised product",
  "keyword": "When "
});
formatter.step({
  "line": 139,
  "name": "I click on Personalize button",
  "keyword": "And "
});
formatter.step({
  "line": 140,
  "name": "I close the pop up window",
  "keyword": "And "
});
formatter.step({
  "line": 141,
  "name": "I select a color of the product",
  "keyword": "When "
});
formatter.step({
  "line": 142,
  "name": "I click on Save Design button",
  "keyword": "And "
});
formatter.step({
  "line": 143,
  "name": "I click on Save To Account",
  "keyword": "When "
});
formatter.step({
  "line": 144,
  "name": "the design gets saved successfully.",
  "keyword": "Then "
});
formatter.step({
  "line": 145,
  "name": "I click on My Account icon",
  "keyword": "When "
});
formatter.step({
  "line": 146,
  "name": "I click on Saved Design",
  "keyword": "And "
});
formatter.step({
  "line": 147,
  "name": "saved design should be present in saved designs panel",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_click_on_Login_icon()"
});
formatter.result({
  "duration": 112579773,
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
  "duration": 5299537538,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 7069413136,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_am_successfully_logged_in()"
});
formatter.result({
  "duration": 11114378304,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_customised_product()"
});
formatter.result({
  "duration": 3364059526,
  "status": "passed"
});
formatter.match({
  "location": "Cart.i_click_on_Personalize_button()"
});
formatter.result({
  "duration": 6156843628,
  "status": "passed"
});
formatter.match({
  "location": "Cart.i_close_the_pop_up_window()"
});
formatter.result({
  "duration": 11149563351,
  "status": "passed"
});
formatter.match({
  "location": "Cart.i_select_a_color_of_the_product()"
});
formatter.result({
  "duration": 132137836,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_click_on_Save_Design_button()"
});
formatter.result({
  "duration": 80735833,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_click_on_Save_To_Account()"
});
formatter.result({
  "duration": 2404095602,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.the_design_gets_saved_successfully()"
});
formatter.result({
  "duration": 10009704858,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_My_Account_icon()"
});
formatter.result({
  "duration": 94297755,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Saved_Design()"
});
formatter.result({
  "duration": 7079178330,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.saved_design_should_be_present_in_saved_designs_panel()"
});
formatter.result({
  "duration": 11745642844,
  "status": "passed"
});
formatter.after({
  "duration": 604386391,
  "status": "passed"
});
});