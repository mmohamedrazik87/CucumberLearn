Feature: Login to leaftaps and create a lead
@regression @smoke
Scenario: Create a Lead
Given Launch Chrome browser
And enter url as 'http://leaftaps.com/opentaps/control/main'
And Enter username as 'demosalesmanager'
And Enter Password as 'crmsfa'
And click submit
And click CRMSFA hyperlink
And click on leads
And click on create lead
When add companyName as 'CTS'
And add firstName as 'FName1'
And add lastName as 'LName1'
And click createLead
Then verify whether lead created successfully
