# Form Viewer API
This project is a REST API for accessing forms data stored in a Mongo DB.

It is primarily used for accessing JSON form data via HTTP as part of the [Form Runner project](https://github.com/m24murray/form-runner).


## Getting started
### Prerequisites
_This setup is for macOS and has not yet been tested on non-mac machines._

* [Mongo DB](https://www.mongodb.com/docs/manual/tutorial/install-mongodb-on-os-x/#installing-mongodb-5.0-edition-edition)
* Java JDK - currently running Java 11

### Build and run
The project can be run using `./gradle clean bootRun` and can be accessed at `http://localhost:8080`.

There are two main endpoints available:
* View all forms - e.g. [http://localhost:8080/forms](http://localhost:8080/forms)
* View forms by ID - e.g. [http://localhost:8080/forms/629624db0af2801b8a8d17c9](http://localhost:8080/forms/629624db0af2801b8a8d17c9)

> Note: this project currently disables CORS support to allow localhost urls to be used in the form runner project.
> This is a temporary measure as part of src/main/java/org/example/config/Config.java.
> See https://stackoverflow.com/questions/44697883/can-you-completely-disable-cors-support-in-spring for more detail.
