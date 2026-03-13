# Quarkus Application

This project is built using **Quarkus**, a Kubernetes-native Java framework designed for building fast and lightweight microservices.

## Requirements

Before running the application, make sure you have installed:

* Java 17 or later
* Maven 3.8+

## Run the Application (Dev Mode)

You can run the application in development mode with live reload:

```
./mvnw quarkus:dev
```

Or using Maven:

```
mvn quarkus:dev
```

The application will start at:

```
http://localhost:8080
```

## Build the Application

To build the application:

```
./mvnw package
```

The compiled artifact will be located in:

```
target/
```

## Run the Built Application

```
java -jar target/quarkus-app/quarkus-run.jar
```

## Learn More

* https://quarkus.io
* https://quarkus.io/guides/

## License

This project is licensed under the MIT License.
