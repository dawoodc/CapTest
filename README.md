# CapTest

Setup
=====

The source code is compiled using Java 8. The tests can be run using JUnit. You will need to download and include JUnit 
jars to run the test. 

Approach
========

Step 1: Standard Billing

Each menu item has been declared as an enum item to associate drink/food type, and price. Although there is no real 
use of the drink/food type in step 1, the type of drink/food has been defined using an enum for completeness of spec.

A simple test has been created to test the billing function that computes and returns the total of the bill in double.

Please Note: Although BigDecimal should be used for all practical purposes for currency amounts the given assignment
does not warrant the use.