# Justin Laabs Individual Project

This repository will serve as my final project for Madison College's Enterprise Java Class. 

### Problem Statement

With the increasing need to itemize deductions in order to maximize tax returns, it is more important than ever to 
maintain accurate records of your charitable donations. Donation Tracker will help solve this by creating a single
environment with which to track both monetary donations and tangible goods. This will aloow the user to track and
retrieve real time dollar amounts to add to their tax forms.

### Project Technologies/Techniques 

* Security/Authentication
  * Tomcat's JDBC Realm Authentication
  * Admin role: create/read/update/delete (crud) of all data
  * User role: create profile, submit item data, edit data they have entered previously
* Database
  * MySQL
  * Store users
  * Store all data for individual user accounts and profiles, and reference lookup data
* ORM Framework
  * Hibernate 5
* Dependency Management
  * Maven
* Web Services consumed using Java
  * Calendar API
* CSS 
  * Bootstrap
* Data Validation
  * Javascript validation front-end
  * Explore Hibernate's validation
* Logging
  * Configurable logging using Log4J2 
* Hosting
  * AWS
* Independent Research Topic/s
  * Useful APIs for integrations
* Unit Testing
  * JUnit tests to achieve 80%+ code coverage 
* IDE: IntelliJ IDEA


### Design

* [Screen Design](designDocs/screens.md)
* [Application Flow](designDocs/applicationFlow.md)
* [Database Design](designDocs/databaseDiagram.png)

### [Project Plan](projectPlan.md)

### [Time Log](timeLog.md)