# 🎥 Cinema-app
## Project description:
Simple example of concept web app that follows RESTful API rules and supports user authentication, authorization as well as various CRUD operations. Created using Spring & Hibernate.
___
## Project functionality:
Here is the scheme of this app to better understand its functionality:
[![Cinema_scheme](src/main/resources/Cinema_scheme.png)](src/main/resources/Cinema_scheme.png)
___
And here is the endpoints list with roles required for access and their short description:

* POST: /register - (all) - register as a new user.
* GET: /cinema-halls - (user/admin) - get a list of all cinema halls.
* POST: /cinema-halls - (admin) - create a new cinema hall.
* GET: /movies - (user/admin) - get a list of all movies.
* POST: /movies - (admin) - create a new movie.
* GET: /movie-sessions/available - (user/admin) - returns available movie sessions for specified movie and date.
* POST: /movie-sessions - (admin) - create movie session.
* PUT: /movie-sessions/{id} - (admin) - update movie session.
* DELETE: /movie-sessions/{id} - (admin) - delete movie session.
* GET: /orders - (user) - get list of orders for current user.
* POST: /orders/complete - (user) - create a new order for current user (transfer movie tickets from shopping cart to order and clear shopping cart).
* PUT: /shopping-carts/movie-sessions - (user) - creates a ticket for specified movie session and adds it to shopping cart of current user.
* GET: /shopping-carts/by-user - (user) - get shopping cart of current user.
* GET: /users/by-email - (admin) - get user by email.

This app has currently only two roles: user and admin. User role is assigned automatically to every new user created.
User and admin roles as well as user with role admin are created by config/DataInitializer if they are missing in db.
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