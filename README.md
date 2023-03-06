# 🎥 Cinema-app
## Project description:
Simple example of concept web app that follows RESTful API rules and supports user authentication, authorization as well as various CRUD operations. Created using Spring & Hibernate.
___
## Project functionality:
Here is the scheme of this app to better understand its functionality:

[![Cinema_scheme](src/main/resources/Cinema_scheme.png)](src/main/resources/Cinema_scheme.png)
___
## Project's structure:

* config - contains config classes required by Spring & Hibernate
* controller - all http controllers
* dao - classes responsible for crud operations with db
* dto - used for http requests and responses
* exception - custom exceptions
* lib - custom validators for email, password and confirm password
* model - model classes for entities shown in scheme above
* service - classes that are responsible for business logic and connecting dao with controllers
* service/mapper - mappers that are used to parse dto to entity and entity to dto
* util - util class containing date pattern to parse date from json
___
## Technologies:

Java 17, Spring Web MVC, Spring Security, Hibernate, MySql, Tomcat, Maven.
___
## How to use app:

#### You can run this app by yourself (requires Intellij and jdk 17 already installed). First you need to pull this project from GitHub. You can do this by running command in terminal:

```git clone git@github.com:Avassor3000/cinema-app.git```

To run app locally you need to:
* Install tomcat 9.0.50 and mysql 8.0
* Replace username, password, driver and url in resources/db.properties with your own
* Create new run configuration tomcat_local (requires Intellij premium)
* Run mvn package command in terminal
* Press debug configuration