# Retail Store
**Overview:**
This project calculates a bill's worth based on who it belongs to and the products it contains.

**The discount system:**
1. If the user is an employee of the store, he gets a 30% discount 
2. If the user is an affiliate of the store, he gets a 10% discount 
3. If the user has been a customer for over 2 years, he gets a 5% discount. 
4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount). 
5. The percentage based discounts do not apply on groceries. 6. A user can get only one of the percentage based discounts on a bill.

**Project Structure**
The User class:
The user class is an abstract class that is extended by each type of customer. It has methods to set and get a discount specific to each user. Each type of user sets its own general discount value when created.

The Product class: 
The product class represents a single entry that can be found on a bill. It is something the customer can purchase. The Product will have a ProductType, which specifies which category it belongs to. This is needed to identify groceries. When a product is created, it is assigned a unique price.

The Bill class:
The Bill class represents a user's bill. It has the type of the user as well as a list of all the products the user wants to purchase. A bill needs to be created and afterwards, products can be added to its list.

The MetaUtils class:
Contains the essential methods to make the project run. It has the methods to calculate a Bill's worth, as well as add the correct discount to the payment.


**Test Cases**
There are three main test cases files.

*ModelBuildTests.java*  tests the core objects functionality and creates some sanity checks to ensure the objects work correctly.

*MetaUtilityTests.java* tests the core methods like calculating bills and providing the correct discounts.

*BillTests.java*  simulates the whole process where bills are created to a type of customers, populated with products, then have their total price calculated. It covers different scenarios with different types of users and products. Additional tests can be done by creating new users, populated bills, and calling the calculateBillTotal from the MetaUtils class.



To test the project, you need to access the three files inside the project that use the JUnit testing environment.
The tests can be run from the command line using a standalone launch console.
The tests can also be run on the command line by generating an executable JAR file using the IDE.

The tests currently include:
 - One user from each type and two new customers(no discount).
 - Two grocery objects and one from every other type.
 - A new bill for each different user.
 
 The tests currently cover cases where each type of customer purchases non grocery products, affiliate customers purchasing both grocery and non-grocery items, as well as pure groceries without percentage discount to display the hundred dollar discount by itself.
 
