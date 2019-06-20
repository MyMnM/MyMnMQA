Feature: Verify multiple scenarios on Forgot Password Page
Background:
Given I open the given website
Then verify the Url
When I click on Login icon
When I click on Forgot your Password
Then it redirects to page having Forgot your password heading

@ForgotPassword @P1  @P1UKLive
Scenario:Verify validation message displays on entering email with wrong pattern
When I enter email id in wrong pattern
Then it should display invalid email error message

@ForgotPassword @P1  @P1UKLive
Scenario:Verify if user enters valid email then message You should receive an email with instructions to reset your password shortly displays
When I enter valid email id
Then it should display specific message