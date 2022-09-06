# Rewards Points Calculator based on customer transaction
#The rest API to get customer rewards based on customer Id

#A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.   A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).   Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total. 

- Exception is thrown if customer does not exists.
- H2 in-memory database to store the information.
- Run the script.sql on H2 in memory DB to prepare the test data.
   -  https://www.jetbrains.com/idea/guide/tutorials/getting-started-spring-data-jpa/configure-your-database/

## Access In-memory DB server URL on browser once the spring application is started.
## Run SQL in the DB to insert data into the tables
## URL : http://localhost:8080/h2 



## Access below URL for response after the data is inserted in to H2 DB
###  http://localhost:8080/customers/10030001/rewards




###
### http://localhost:8080/customers/{customerId}/rewards
###
