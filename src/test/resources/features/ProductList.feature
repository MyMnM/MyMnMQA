
Feature: Verify multiple scenarios on Product List page
Background:
Given I open the given website
Then verify the Url
When I navigate to product List page
Then Global Cart is visible

    @ProductList @P1 @P1US @P1USLive
    Scenario:Verify on clicking product name and image it redirects to product detail page         
    And I click on product name 
    Then it redirects to product detail page
    And I click on product image
    Then it redirects to product detail page
    
    @ProductList @P1 @P1US @P1USLive
    Scenario:Verify on hovering the mouse over the product shows the quick shop button       
    And I hover mouse over the product 
    Then it displays Quick Shop button
    
    @ProductList @P1US
    Scenario:Verify Items per page dropdown is working fine and products are listed as per option selected ie. 12,36,100 and View All
    When I select particular value from per page drop down
    Then  products are listed as per option selected
    
    @ProductList 
    Scenario:Validate Sort By dropdoown is working fine and page sorts as per selected option ie:Popularity,Recency,Low to High,High to Low
    When I select Low to High sortby value
    Then products gets listed as per Low to High
    
    When I select High to Low sortby value
    Then products gets listed as per High to Low
    
    @ProductList  @P1US
    Scenario:Validate Sort By dropdoown is working fine and page sorts as per selected option ie:Popularity,Recency,Low to High,High to Low
    When I select Low to High sortby value
    Then products gets listed as per Low to High for US site    
    When I select High to Low sortby value
    Then products gets listed as per High to Low for US site
    
    
    
    @ProductList @P1
    Scenario:Verify filter options are working fine and page gets filter as per selected filter.
    When I select Weight filter 
    Then products gets listed as per selected filter
    #When I click on Cross next to filer
    When I click on Clear All
    Then filter gets removed    
    When I select another Weight 
    Then products gets listed per selected filter
    
    @ProductList @P1
    Scenario:Verify removing all filters by clicking clear all link
    When I select Weight filter 
    Then products gets listed as per selected filter
    When I click on Clear All 
    Then filter gets removed
    
    @ProductList @P1
    Scenario:Verify pagination is working fine ie.page numbers and arrows
    When I click on page number
    Then it navigates to next page
    When I click on right arrow
    Then it navigates to other page
    When I click on left arrow
    Then it navigates to previous page
    
    @ProductList @P1
    Scenario:Verify Quick Shop functionality on every product 
    When I navigate to customised product
    Then it shows Personalize button
    When I navigate to non customised product
    Then it shows Add to cart button
   
    
    
    