$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Fluid.feature");
formatter.feature({
  "line": 2,
  "name": "Verify multiple scenarios on Fluid Page",
  "description": "",
  "id": "verify-multiple-scenarios-on-fluid-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2942650503,
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
  "name": "I navigate to customised product",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Personalize button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I close the pop up window",
  "keyword": "And "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 68190031691,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 21141137,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_customised_product()"
});
formatter.result({
  "duration": 3920055110,
  "status": "passed"
});
formatter.match({
  "location": "Cart.i_click_on_Personalize_button()"
});
formatter.result({
  "duration": 7502721288,
  "status": "passed"
});
formatter.match({
  "location": "Cart.i_close_the_pop_up_window()"
});
formatter.result({
  "duration": 15062192145,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify user is able to select options and packaging",
  "description": "",
  "id": "verify-multiple-scenarios-on-fluid-page;verify-user-is-able-to-select-options-and-packaging",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Fluid"
    },
    {
      "line": 10,
      "name": "@P1"
    },
    {
      "line": 10,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I select a color of the product",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on Add ClipArt",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I select clipArt image",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on Add Text",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "enter the desired text",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Packaging information",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I select desired packaging",
  "keyword": "And "
});
formatter.match({
  "location": "Cart.i_select_a_color_of_the_product()"
});
formatter.result({
  "duration": 137165321,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_click_on_Add_ClipArt()"
});
formatter.result({
  "duration": 127719188,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_select_clipArt_image()"
});
formatter.result({
  "duration": 131945114,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_click_on_Add_Text()"
});
formatter.result({
  "duration": 86056746,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.enter_the_desired_text()"
});
formatter.result({
  "duration": 339585556,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_click_on_Packaging_information()"
});
formatter.result({
  "duration": 128604306,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_select_desired_packaging()"
});
formatter.result({
  "duration": 10045351885,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//div[@class\u003d\u0027fc-packaging-image\u0027])[1]\"}\n  (Session info: chrome\u003d74.0.3729.169)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir6352_13125}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 63fc55c24305903054f23bd98829ede1\n*** Element info: {Using\u003dxpath, value\u003d(//div[@class\u003d\u0027fc-packaging-image\u0027])[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:51)\r\n\tat com.google.common.collect.Iterators$6.transform(Iterators.java:820)\r\n\tat com.google.common.collect.TransformedIterator.next(TransformedIterator.java:48)\r\n\tat com.google.common.collect.Iterators.addAll(Iterators.java:373)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:165)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:150)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:575)\r\n\tat helpers.GlobalUtil.highlight(GlobalUtil.java:270)\r\n\tat helpers.GlobalUtil.clickOnElementUsingJS(GlobalUtil.java:126)\r\n\tat step_definitions.Fluid.i_select_desired_packaging(Fluid.java:63)\r\n\tat ✽.And I select desired packaging(features/Fluid.feature:18)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/configurator?packagingId\u003d9091\u0026customerType\u003dB2C");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 5994556493,
  "status": "passed"
});
formatter.before({
  "duration": 2568820268,
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
  "name": "I navigate to customised product",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Personalize button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I close the pop up window",
  "keyword": "And "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 64521740131,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 8471445,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_customised_product()"
});
formatter.result({
  "duration": 2698718352,
  "status": "passed"
});
formatter.match({
  "location": "Cart.i_click_on_Personalize_button()"
});
formatter.result({
  "duration": 6194712306,
  "status": "passed"
});
formatter.match({
  "location": "Cart.i_close_the_pop_up_window()"
});
formatter.result({
  "duration": 15029287894,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Verify that after selection of packing user can update the minimum quantity",
  "description": "",
  "id": "verify-multiple-scenarios-on-fluid-page;verify-that-after-selection-of-packing-user-can-update-the-minimum-quantity",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@Fluid"
    },
    {
      "line": 20,
      "name": "@P1"
    },
    {
      "line": 20,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I select a color of the product",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "I click on Add ClipArt",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I select clipArt image",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I click on Add Text",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "enter the desired text",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I click on Packaging information",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I select desired packaging",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I update Quantity after selection of packing",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Subtotal also gets updated",
  "keyword": "Then "
});
formatter.match({
  "location": "Cart.i_select_a_color_of_the_product()"
});
formatter.result({
  "duration": 116305331,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_click_on_Add_ClipArt()"
});
formatter.result({
  "duration": 116788943,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_select_clipArt_image()"
});
formatter.result({
  "duration": 106689391,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_click_on_Add_Text()"
});
formatter.result({
  "duration": 86510812,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.enter_the_desired_text()"
});
formatter.result({
  "duration": 345047724,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_click_on_Packaging_information()"
});
formatter.result({
  "duration": 127545026,
  "status": "passed"
});
formatter.match({
  "location": "Fluid.i_select_desired_packaging()"
});
formatter.result({
  "duration": 10051225823,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//div[@class\u003d\u0027fc-packaging-image\u0027])[1]\"}\n  (Session info: chrome\u003d74.0.3729.169)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir12504_18709}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: e4fb7f643b1939a510ed5eb7d0e7cba6\n*** Element info: {Using\u003dxpath, value\u003d(//div[@class\u003d\u0027fc-packaging-image\u0027])[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:51)\r\n\tat com.google.common.collect.Iterators$6.transform(Iterators.java:820)\r\n\tat com.google.common.collect.TransformedIterator.next(TransformedIterator.java:48)\r\n\tat com.google.common.collect.Iterators.addAll(Iterators.java:373)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:165)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:150)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:575)\r\n\tat helpers.GlobalUtil.highlight(GlobalUtil.java:270)\r\n\tat helpers.GlobalUtil.clickOnElementUsingJS(GlobalUtil.java:126)\r\n\tat step_definitions.Fluid.i_select_desired_packaging(Fluid.java:63)\r\n\tat ✽.And I select desired packaging(features/Fluid.feature:28)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Fluid.i_update_Quantity_after_selection_of_packing()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Fluid.subtotal_also_gets_updated()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/configurator?packagingId\u003d9091\u0026customerType\u003dB2C");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 5961820806,
  "status": "passed"
});
formatter.uri("features/GlobalCart.feature");
formatter.feature({
  "line": 2,
  "name": "Verify multiple scenarios on Global Cart Page",
  "description": "",
  "id": "verify-multiple-scenarios-on-global-cart-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2100304784,
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
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 64844639375,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 6219153,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify view cart button and checkout button and save Cart is working in global cart",
  "description": "",
  "id": "verify-multiple-scenarios-on-global-cart-page;verify-view-cart-button-and-checkout-button-and-save-cart-is-working-in-global-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@GlobalCart"
    },
    {
      "line": 27,
      "name": "@P1"
    },
    {
      "line": 27,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I navigate to normal product page",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Add to cart button is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I click on cart button",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "product gets added to global cart",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I click on View cart button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "it navigates to basket page",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I click on checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "it navigates to Checkout page",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I click on Save Cart button",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "it displays login menu.",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductDetailPage.i_navigate_to_normal_product_page()"
});
formatter.result({
  "duration": 7978656089,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPage.add_to_cart_button_is_visible()"
});
formatter.result({
  "duration": 48827,
  "status": "passed"
});
formatter.match({
  "location": "GlobalCart.i_click_on_cart_button()"
});
formatter.result({
  "duration": 5099052370,
  "status": "passed"
});
formatter.match({
  "location": "GlobalCart.product_gets_added_to_global_cart()"
});
formatter.result({
  "duration": 17219123341,
  "status": "passed"
});
formatter.match({
  "location": "GlobalCart.i_click_on_View_cart_button()"
});
formatter.result({
  "duration": 93233480,
  "status": "passed"
});
formatter.match({
  "location": "GlobalCart.it_navigates_to_basket_page()"
});
formatter.result({
  "duration": 5015122582,
  "status": "passed"
});
formatter.match({
  "location": "GlobalCart.i_click_on_checkout_button()"
});
formatter.result({
  "duration": 4558206625,
  "status": "passed"
});
formatter.match({
  "location": "GlobalCart.it_navigates_to_Checkout_page()"
});
formatter.result({
  "duration": 5005861498,
  "status": "passed"
});
formatter.match({
  "location": "GlobalCart.i_click_on_Save_Cart_button()"
});
formatter.result({
  "duration": 1806800419,
  "status": "passed"
});
formatter.match({
  "location": "GlobalCart.it_displays_login_menu()"
});
formatter.result({
  "duration": 6043891099,
  "status": "passed"
});
formatter.after({
  "duration": 603066191,
  "status": "passed"
});
formatter.uri("features/MyAccount.feature");
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
      "name": "@P1UKLive"
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
  "duration": 2803295090,
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
  "duration": 63464319724,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 7876805,
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
    },
    {
      "line": 57,
      "name": "@P1UKLive"
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
  "duration": 119941594,
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
  "duration": 5318179132,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 7087069998,
  "status": "passed"
});
formatter.match({
  "location": "homePage.i_am_successfully_logged_in()"
});
formatter.result({
  "duration": 11130288083,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.click_on_Account_Settings()"
});
formatter.result({
  "duration": 66010344,
  "status": "passed"
});
formatter.match({
  "location": "homePage.my_Account_title_is_visible()"
});
formatter.result({
  "duration": 9046641621,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Add_new_address_button()"
});
formatter.result({
  "duration": 461876786,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_enter_all_the_valid_values_in_all_the_mandatory_fields()"
});
formatter.result({
  "duration": 1163985084,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_button()"
});
formatter.result({
  "duration": 4122381111,
  "status": "passed"
});
formatter.match({
  "location": "MyAccount.it_should_display_new_Addresss()"
});
formatter.result({
  "duration": 13047213558,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//div[@class\u003d\u0027mz-accountaddressbook-contactdetails mz-addresssummary\u0027])[2]//div\"}\n  (Session info: chrome\u003d74.0.3729.169)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir10788_26600}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 53101c159d6496b2b31aaa1b68187e8e\n*** Element info: {Using\u003dxpath, value\u003d(//div[@class\u003d\u0027mz-accountaddressbook-contactdetails mz-addresssummary\u0027])[2]//div}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:51)\r\n\tat com.google.common.collect.Iterators$6.transform(Iterators.java:820)\r\n\tat com.google.common.collect.TransformedIterator.next(TransformedIterator.java:48)\r\n\tat com.google.common.collect.Iterators.addAll(Iterators.java:373)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:165)\r\n\tat com.google.common.collect.Lists.newArrayList(Lists.java:150)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:575)\r\n\tat helpers.GlobalUtil.highlight(GlobalUtil.java:270)\r\n\tat helpers.GlobalUtil.verifyUIText(GlobalUtil.java:249)\r\n\tat step_definitions.MyAccount.it_should_display_new_Addresss(MyAccount.java:159)\r\n\tat ✽.Then it should display new Addresss(features/MyAccount.feature:68)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyAccount.i_click_on_Edit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAccount.edit_the_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAccount.i_click_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAccount.it_should_display_the_updated_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAccount.i_click_on_Delete_Address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyAccount.it_should_delete_the_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/myaccount#settings");
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 5924420366,
  "status": "passed"
});
formatter.uri("features/PrintOrder.feature");
formatter.feature({
  "line": 2,
  "name": "Verify multiple scenarios on Print order Page",
  "description": "",
  "id": "verify-multiple-scenarios-on-print-order-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2326277995,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify print icon is present on the right side corner of the order confirmation page and is clikable",
  "description": "",
  "id": "verify-multiple-scenarios-on-print-order-page;verify-print-icon-is-present-on-the-right-side-corner-of-the-order-confirmation-page-and-is-clikable",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@PrintOrder"
    },
    {
      "line": 3,
      "name": "@P1"
    },
    {
      "line": 3,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open the given website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify the Url",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I navigate to normal product page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Add to cart button is visible",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on cart button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on Proceed to Checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "it redirects to Checkout Page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter all the mandatory fields of Ship to Section",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click on Next",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Ship method Next button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter all the mandatory valid information and click on Next button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "it navigates to Complete Your Order Section",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I click on Place Order button without selecting terms and Conditions",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "it displays error message",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I select terms and conditions",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on Place order button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Order gets placed successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "print icon is present on the right side corner of the order confirmation page and is clikable",
  "keyword": "And "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 64984082802,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 5936761,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPage.i_navigate_to_normal_product_page()"
});
formatter.result({
  "duration": 7404417815,
  "status": "passed"
});
formatter.match({
  "location": "ProductDetailPage.add_to_cart_button_is_visible()"
});
formatter.result({
  "duration": 17417,
  "status": "passed"
});
formatter.match({
  "location": "GlobalCart.i_click_on_cart_button()"
});
formatter.result({
  "duration": 5108546397,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_click_on_Proceed_to_Checkout_button()"
});
formatter.result({
  "duration": 11716123083,
  "status": "passed"
});
formatter.match({
  "location": "Cart.it_redirects_to_Checkout_Page()"
});
formatter.result({
  "duration": 277308196,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_enter_all_the_mandatory_fields_of_Ship_to_Section()"
});
formatter.result({
  "duration": 15579743981,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_click_on_Next()"
});
formatter.result({
  "duration": 7458643897,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_click_on_Ship_method_Next_button()"
});
formatter.result({
  "duration": 4487272772,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_enter_all_the_mandatory_valid_information_and_click_on_Next_button()"
});
formatter.result({
  "duration": 2460662937,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.it_navigates_to_Complete_Your_Order_Section()"
});
formatter.result({
  "duration": 7318292027,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_click_on_Place_Order_button_without_selecting_terms_and_Conditions()"
});
formatter.result({
  "duration": 398978973,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.it_displays_error_message()"
});
formatter.result({
  "duration": 6034967765,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_select_terms_and_conditions()"
});
formatter.result({
  "duration": 91380517,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.i_click_on_Place_order_button()"
});
formatter.result({
  "duration": 388435307,
  "status": "passed"
});
formatter.match({
  "location": "Checkout.order_gets_placed_successfully()"
});
formatter.result({
  "duration": 24919104059,
  "status": "passed"
});
formatter.match({
  "location": "PrintOrder.print_icon_is_present_on_the_right_side_corner_of_the_order_confirmation_page_and_is_clikable()"
});
formatter.result({
  "duration": 18895349553,
  "status": "passed"
});
formatter.after({
  "duration": 687401839,
  "status": "passed"
});
formatter.uri("features/ProductList.feature");
formatter.feature({
  "line": 2,
  "name": "Verify multiple scenarios on Product List page",
  "description": "",
  "id": "verify-multiple-scenarios-on-product-list-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2124745365,
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
  "name": "I navigate to product List page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Global Cart is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 65454682014,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 6044990,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_product_List_page()"
});
formatter.result({
  "duration": 13232615950,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.global_Cart_is_visible()"
});
formatter.result({
  "duration": 6054640339,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify Items per page dropdown is working fine and products are listed as per option selected ie. 12,36,100 and View All",
  "description": "",
  "id": "verify-multiple-scenarios-on-product-list-page;verify-items-per-page-dropdown-is-working-fine-and-products-are-listed-as-per-option-selected-ie.-12,36,100-and-view-all",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@ProductList"
    },
    {
      "line": 21,
      "name": "@P1US"
    },
    {
      "line": 21,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I select particular value from per page drop down",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "products are listed as per option selected",
  "keyword": "Then "
});
formatter.match({
  "location": "productList.i_select_particular_value_from_per_page_drop_down()"
});
formatter.result({
  "duration": 24364651255,
  "status": "passed"
});
formatter.match({
  "location": "productList.products_are_listed_as_per_option_selected()"
});
formatter.result({
  "duration": 250359,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:92)\r\n\tat org.junit.Assert.assertTrue(Assert.java:43)\r\n\tat org.junit.Assert.assertTrue(Assert.java:54)\r\n\tat step_definitions.productList.products_are_listed_as_per_option_selected(productList.java:78)\r\n\tat ✽.Then products are listed as per option selected(features/ProductList.feature:24)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/shop-products/all-our-products?page\u003d");
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 5966570463,
  "status": "passed"
});
formatter.uri("features/QuickShop.feature");
formatter.feature({
  "line": 2,
  "name": "Verify multiple scenarios on Quick Shop",
  "description": "",
  "id": "verify-multiple-scenarios-on-quick-shop",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2127909211,
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
  "name": "I navigate to product List page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Global Cart is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 69004436165,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 7639198,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_product_List_page()"
});
formatter.result({
  "duration": 12437060823,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.global_Cart_is_visible()"
});
formatter.result({
  "duration": 6041440074,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify accordion on click to quickshop button",
  "description": "",
  "id": "verify-multiple-scenarios-on-quick-shop;verify-accordion-on-click-to-quickshop-button",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@QuickShop"
    },
    {
      "line": 9,
      "name": "@P1"
    },
    {
      "line": 9,
      "name": "@P1US"
    },
    {
      "line": 9,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I click on Quick Shop button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "it displays accordion",
  "keyword": "Then "
});
formatter.match({
  "location": "QuickShop.i_click_on_Quick_Shop_button()"
});
formatter.result({
  "duration": 35185260886,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on XP (038bd66355fe9c72d0f29ffce9ad279e)] -\u003e xpath: (//span[contains(text(),\u0027Quick Shop\u0027)])[1]] (tried for 30 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir11892_7707}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 038bd66355fe9c72d0f29ffce9ad279e\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat helpers.GlobalUtil.waitForElementToBeClickable(GlobalUtil.java:112)\r\n\tat helpers.GlobalUtil.clickOnElementUsingJS(GlobalUtil.java:127)\r\n\tat step_definitions.QuickShop.i_click_on_Quick_Shop_button(QuickShop.java:48)\r\n\tat ✽.When I click on Quick Shop button(features/QuickShop.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "QuickShop.it_displays_accordion()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/shop-products/all-our-products");
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 5940477205,
  "status": "passed"
});
formatter.before({
  "duration": 2534528316,
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
  "name": "I navigate to product List page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Global Cart is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 68872454353,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 5737406,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_product_List_page()"
});
formatter.result({
  "duration": 13511458952,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.global_Cart_is_visible()"
});
formatter.result({
  "duration": 6039641847,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify Expand/Collapse functionality on tabs on accordion under quickshop",
  "description": "",
  "id": "verify-multiple-scenarios-on-quick-shop;verify-expand/collapse-functionality-on-tabs-on-accordion-under-quickshop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@QuickShop"
    },
    {
      "line": 14,
      "name": "@P1"
    },
    {
      "line": 14,
      "name": "@P1US"
    },
    {
      "line": 14,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I click on Quick Shop button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "it displays accordion",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I expand Personalization Options",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I collapse Personalization Options",
  "keyword": "And "
});
formatter.match({
  "location": "QuickShop.i_click_on_Quick_Shop_button()"
});
formatter.result({
  "duration": 35172011793,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on XP (51dc1536e967ada1c033a93b99ee3ec0)] -\u003e xpath: (//span[contains(text(),\u0027Quick Shop\u0027)])[1]] (tried for 30 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir11228_16406}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 51dc1536e967ada1c033a93b99ee3ec0\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat helpers.GlobalUtil.waitForElementToBeClickable(GlobalUtil.java:112)\r\n\tat helpers.GlobalUtil.clickOnElementUsingJS(GlobalUtil.java:127)\r\n\tat step_definitions.QuickShop.i_click_on_Quick_Shop_button(QuickShop.java:48)\r\n\tat ✽.When I click on Quick Shop button(features/QuickShop.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "QuickShop.it_displays_accordion()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.i_expand_Personalization_Options()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.i_collapse_Personalization_Options()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/shop-products/all-our-products");
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 5918312242,
  "status": "passed"
});
formatter.before({
  "duration": 2227955551,
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
  "name": "I navigate to product List page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Global Cart is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 64661052314,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 5749847,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_product_List_page()"
});
formatter.result({
  "duration": 14221509366,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.global_Cart_is_visible()"
});
formatter.result({
  "duration": 6035349677,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify Quantity field on accordion and Quantity field updation under quickShop",
  "description": "",
  "id": "verify-multiple-scenarios-on-quick-shop;verify-quantity-field-on-accordion-and-quantity-field-updation-under-quickshop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@QuickShop"
    },
    {
      "line": 21,
      "name": "@P1"
    },
    {
      "line": 21,
      "name": "@P1US"
    },
    {
      "line": 21,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I navigate to non-customisable product listing",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click on Quick Shop button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "it displays Quantity field",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I click on Plus icon",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "quantity value gets increased",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click on minus icon",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "quantity value gets decreased",
  "keyword": "Then "
});
formatter.match({
  "location": "QuickShop.i_navigate_to_non_customisable_product_listing()"
});
formatter.result({
  "duration": 1858318586,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.i_click_on_Quick_Shop_button()"
});
formatter.result({
  "duration": 35103529276,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on XP (981c8c6e5c51778abf5829333b4b73bb)] -\u003e xpath: (//span[contains(text(),\u0027Quick Shop\u0027)])[1]] (tried for 30 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir12072_87}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 981c8c6e5c51778abf5829333b4b73bb\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat helpers.GlobalUtil.waitForElementToBeClickable(GlobalUtil.java:112)\r\n\tat helpers.GlobalUtil.clickOnElementUsingJS(GlobalUtil.java:127)\r\n\tat step_definitions.QuickShop.i_click_on_Quick_Shop_button(QuickShop.java:48)\r\n\tat ✽.When I click on Quick Shop button(features/QuickShop.feature:24)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "QuickShop.it_displays_Quantity_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.i_click_on_Plus_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.quantity_value_gets_increased()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.i_click_on_minus_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.quantity_value_gets_decreased()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/shop-products/candy-dispensers");
formatter.embedding("image/png", "embedded6.png");
formatter.after({
  "duration": 5911685053,
  "status": "passed"
});
formatter.before({
  "duration": 2356065672,
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
  "name": "I navigate to product List page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Global Cart is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 65820673076,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 5037958,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_product_List_page()"
});
formatter.result({
  "duration": 12810437303,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.global_Cart_is_visible()"
});
formatter.result({
  "duration": 6041634140,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Verify add to cart button on accordion under quickshop and its functionality on accordion under quickshop",
  "description": "",
  "id": "verify-multiple-scenarios-on-quick-shop;verify-add-to-cart-button-on-accordion-under-quickshop-and-its-functionality-on-accordion-under-quickshop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@QuickShop"
    },
    {
      "line": 31,
      "name": "@P1"
    },
    {
      "line": 31,
      "name": "@P1US"
    },
    {
      "line": 31,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "I navigate to non-customisable product listing",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I click on Quick Shop button",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "it displays Add To Cart Button",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I click on Add To Cart Button",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "it displays Global Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "QuickShop.i_navigate_to_non_customisable_product_listing()"
});
formatter.result({
  "duration": 2493410442,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.i_click_on_Quick_Shop_button()"
});
formatter.result({
  "duration": 35102795617,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on XP (150aced86ce17240ed1c7d2768eb8ed0)] -\u003e xpath: (//span[contains(text(),\u0027Quick Shop\u0027)])[1]] (tried for 30 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir9608_6040}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 150aced86ce17240ed1c7d2768eb8ed0\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat helpers.GlobalUtil.waitForElementToBeClickable(GlobalUtil.java:112)\r\n\tat helpers.GlobalUtil.clickOnElementUsingJS(GlobalUtil.java:127)\r\n\tat step_definitions.QuickShop.i_click_on_Quick_Shop_button(QuickShop.java:48)\r\n\tat ✽.When I click on Quick Shop button(features/QuickShop.feature:34)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "QuickShop.it_displays_Add_To_Cart_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.i_click_on_Add_To_Cart_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.it_displays_Global_Cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/shop-products/candy-dispensers");
formatter.embedding("image/png", "embedded7.png");
formatter.after({
  "duration": 5916984254,
  "status": "passed"
});
formatter.before({
  "duration": 2040167756,
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
  "name": "I navigate to product List page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Global Cart is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 64485940120,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 6356305,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_product_List_page()"
});
formatter.result({
  "duration": 12291915133,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.global_Cart_is_visible()"
});
formatter.result({
  "duration": 6055018831,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Verify Personalize button on accordion under quickshop and its functionality on accordion under quickshop",
  "description": "",
  "id": "verify-multiple-scenarios-on-quick-shop;verify-personalize-button-on-accordion-under-quickshop-and-its-functionality-on-accordion-under-quickshop",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@QuickShop2"
    },
    {
      "line": 39,
      "name": "@P1"
    },
    {
      "line": 39,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 41,
      "value": "#When I navigate to Product listing"
    }
  ],
  "line": 42,
  "name": "I click on Quick Shop button",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "it displays Personalize button",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "i click on Personalize button",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "it navigates to its desired webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "QuickShop.i_click_on_Quick_Shop_button()"
});
formatter.result({
  "duration": 35128729019,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on XP (39e2acdadaf41b0165a7a03cf5fa0ee4)] -\u003e xpath: (//span[contains(text(),\u0027Quick Shop\u0027)])[1]] (tried for 30 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir10296_31478}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 39e2acdadaf41b0165a7a03cf5fa0ee4\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat helpers.GlobalUtil.waitForElementToBeClickable(GlobalUtil.java:112)\r\n\tat helpers.GlobalUtil.clickOnElementUsingJS(GlobalUtil.java:127)\r\n\tat step_definitions.QuickShop.i_click_on_Quick_Shop_button(QuickShop.java:48)\r\n\tat ✽.When I click on Quick Shop button(features/QuickShop.feature:42)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "QuickShop.it_displays_Personalize_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.i_click_on_Personalize_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.it_navigates_to_its_desired_webpage()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/shop-products/all-our-products");
formatter.embedding("image/png", "embedded8.png");
formatter.after({
  "duration": 5945608464,
  "status": "passed"
});
formatter.before({
  "duration": 2494778239,
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
  "name": "I navigate to product List page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Global Cart is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 70379574795,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 5432933,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_product_List_page()"
});
formatter.result({
  "duration": 17558377367,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.global_Cart_is_visible()"
});
formatter.result({
  "duration": 6187621720,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Verify View full details hyperlink functionality",
  "description": "",
  "id": "verify-multiple-scenarios-on-quick-shop;verify-view-full-details-hyperlink-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@QuickShop"
    },
    {
      "line": 48,
      "name": "@P1"
    },
    {
      "line": 48,
      "name": "@P1US"
    },
    {
      "line": 48,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "I click on Quick Shop button",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "I click View full details hyperlink",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "it navigates to desired webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "QuickShop.i_click_on_Quick_Shop_button()"
});
formatter.result({
  "duration": 35191208532,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on XP (d846caa8665f18c1c73deede24a0bc64)] -\u003e xpath: (//span[contains(text(),\u0027Quick Shop\u0027)])[1]] (tried for 30 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir11796_17078}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: d846caa8665f18c1c73deede24a0bc64\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat helpers.GlobalUtil.waitForElementToBeClickable(GlobalUtil.java:112)\r\n\tat helpers.GlobalUtil.clickOnElementUsingJS(GlobalUtil.java:127)\r\n\tat step_definitions.QuickShop.i_click_on_Quick_Shop_button(QuickShop.java:48)\r\n\tat ✽.When I click on Quick Shop button(features/QuickShop.feature:50)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "QuickShop.i_click_View_full_details_hyperlink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.it_navigates_to_desired_webpage()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/shop-products/all-our-products");
formatter.embedding("image/png", "embedded9.png");
formatter.after({
  "duration": 5952063358,
  "status": "passed"
});
formatter.before({
  "duration": 2072022056,
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
  "name": "I navigate to product List page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Global Cart is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage.i_open_the_given_website()"
});
formatter.result({
  "duration": 72765281661,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 7301758,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_product_List_page()"
});
formatter.result({
  "duration": 28223515965,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.global_Cart_is_visible()"
});
formatter.result({
  "duration": 6053358380,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Verify minimum quantity validation on accordion",
  "description": "",
  "id": "verify-multiple-scenarios-on-quick-shop;verify-minimum-quantity-validation-on-accordion",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 54,
      "name": "@QuickShop"
    },
    {
      "line": 54,
      "name": "@P1"
    },
    {
      "line": 54,
      "name": "@P1US"
    },
    {
      "line": 54,
      "name": "@P1UKLive"
    }
  ]
});
formatter.step({
  "line": 56,
  "name": "I click on Quick Shop button",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "minimum order quantity message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "I navigate to non-customisable product listing",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "I click on Quick Shop button",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "minimum order quantity message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "minus button of Quantity box is disabled",
  "keyword": "And "
});
formatter.match({
  "location": "QuickShop.i_click_on_Quick_Shop_button()"
});
formatter.result({
  "duration": 35184074093,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on XP (a810513f756476ad7dc5ceb1bc970820)] -\u003e xpath: (//span[contains(text(),\u0027Quick Shop\u0027)])[1]] (tried for 30 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.5.1\u0027, revision: \u00279c21bb67ef\u0027, time: \u00272017-08-17T15:26:08.955Z\u0027\nSystem info: host: \u0027TRANTOR114\u0027, ip: \u0027172.16.254.100\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\VIBHAV~1.GUP\\AppData\\Local\\Temp\\scoped_dir8452_7112}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: a810513f756476ad7dc5ceb1bc970820\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat helpers.GlobalUtil.waitForElementToBeClickable(GlobalUtil.java:112)\r\n\tat helpers.GlobalUtil.clickOnElementUsingJS(GlobalUtil.java:127)\r\n\tat step_definitions.QuickShop.i_click_on_Quick_Shop_button(QuickShop.java:48)\r\n\tat ✽.When I click on Quick Shop button(features/QuickShop.feature:56)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "QuickShop.minimum_order_quantity_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.i_navigate_to_non_customisable_product_listing()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.i_click_on_Quick_Shop_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.minimum_order_quantity_message_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "QuickShop.minus_button_of_Quantity_box_is_disabled()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-gb/shop-products/all-our-products");
formatter.embedding("image/png", "embedded10.png");
formatter.after({
  "duration": 6124692183,
  "status": "passed"
});
});