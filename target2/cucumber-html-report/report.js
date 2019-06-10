$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/ProductList.feature");
formatter.feature({
  "line": 2,
  "name": "Verify multiple scenarios on Product List page",
  "description": "",
  "id": "verify-multiple-scenarios-on-product-list-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3072517261,
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
  "duration": 33139679045,
  "status": "passed"
});
formatter.match({
  "location": "homePage.verify_the_Url()"
});
formatter.result({
  "duration": 13408907,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_navigate_to_product_List_page()"
});
formatter.result({
  "duration": 9879036511,
  "status": "passed"
});
formatter.match({
  "location": "QuickShop.global_Cart_is_visible()"
});
formatter.result({
  "duration": 6111557194,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Validate Sort By dropdoown is working fine and page sorts as per selected option ie:Popularity,Recency,Low to High,High to Low",
  "description": "",
  "id": "verify-multiple-scenarios-on-product-list-page;validate-sort-by-dropdoown-is-working-fine-and-page-sorts-as-per-selected-option-ie:popularity,recency,low-to-high,high-to-low",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@ProductList"
    },
    {
      "line": 34,
      "name": "@P1US"
    },
    {
      "line": 34,
      "name": "@P1USLive"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "I select Low to High sortby value",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "products gets listed as per Low to High for US site",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I select High to Low sortby value",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "products gets listed as per High to Low for US site",
  "keyword": "Then "
});
formatter.match({
  "location": "productList.i_select_Low_to_High_sortby_value()"
});
formatter.result({
  "duration": 15092228650,
  "status": "passed"
});
formatter.match({
  "location": "productList.products_gets_listed_as_per_Low_to_High_for_US_site()"
});
formatter.result({
  "duration": 4071055546,
  "status": "passed"
});
formatter.match({
  "location": "productList.i_select_High_to_Low_sortby_value()"
});
formatter.result({
  "duration": 15225451265,
  "status": "passed"
});
formatter.match({
  "location": "productList.products_gets_listed_as_per_High_to_Low_for_US_site()"
});
formatter.result({
  "duration": 4085736144,
  "error_message": "java.lang.AssertionError: Products are not filtered as per Low to High\r\n\tat org.junit.Assert.fail(Assert.java:93)\r\n\tat org.junit.Assert.assertTrue(Assert.java:43)\r\n\tat step_definitions.productList.products_gets_listed_as_per_High_to_Low_for_US_site(productList.java:244)\r\n\tat ✽.Then products gets listed as per High to Low for US site(features/ProductList.feature:39)\r\n",
  "status": "failed"
});
formatter.write("Current Page URL is https://t26445-s41141.mozu.com/en-us/shop/personalized#");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 6042029297,
  "status": "passed"
});
});