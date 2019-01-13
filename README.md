# Retail_Store
Build a RESTful service that implments a check out counter for an online retail store that scans products and generates an itemized bill.
The bill should also total the cost of all the products and the applicable sales tax for each product.
The total cost and total sales tax should be printed
Sales tax varies based on the type of products
 category A products carry a levy of 10%
 category B products carry a levy of 20%
 category C products carry no levy

# REST endpoints
Client can add/update/modify products and orders using the REST endpoints.Below is overview of REST end points:

## Products
*  GET /products - fetches list of all product data
*  GET /products/{id} - fetch a specific product
*  POST /products - Creates a new product based on request JSON
*  PUT /products/{id} - Updates product data based on request JSON
*  DELETE /products/{id} - Delete an existing product if it is not associated with a bill.


## Bills
*  GET /bills - fetches all bill data
*  GET /bills/{id} - fetches bill of a particular id
*  POST /bills - creates a bill Id. Client has to use this bill Id while adding and removing products
*  PUT /bills/{id} - Updates bill data. Client can add or remove products to bill sending a JSON request.
*  DELETE /bills/{id} - Delete bill from the system.

 These REST end points are secured using basic authentication mechanism. Code uses in-memory repository with 'aditi' as single user.

# About Implementation

*  Apache Maven 3.0.4 
*  Java version: 1.8.0_172
*  Spring Boot 1.4.7.RELEASE

Steps to build and run locally:
* Open command line
* Create a new directory called "Retail_Store" 
* Clone repository using svn/git using following url =>   
* Go to /Retail_Store/trunk ==> Open Command Line
* Build the executable jar using maven=> mvn clean install -Dmaven.test.skip=true
* Go to target folder => cd target
* Run following command to start the server on port 8080=> java -jar RetaileStoreApplication-0.0.1-SNAPSHOT.jar 
* Optionally, one can configure port using command line parameter => --server.port=9090 
* Access and invoke APIs using url => http://localhost:8080/swagger-ui.html
* Application will ask for authentication credentials during invocation of API's. Use 'aditi' as user id and password.

This application uses H2 database and does not persist data on application restarts. 
