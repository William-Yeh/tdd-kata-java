# TDD Kata Skeleton for Java with Maven and JUnit

A simple Test-Driven Development (TDD) kata project implemented in Java.

## Description

This project demonstrates basic TDD principles through a simple `Foo` class that provides a greeting method. It serves as a starting point for practicing TDD with Java, Maven, and JUnit.

## Prerequisites

- Java 21 or higher
- Maven 3.6 or higher

## Project Structure

```
src/
├── main/java/com/kata/
│   └── Foo.java          # Main class with sayHello method
└── test/java/com/kata/
    └── FooTest.java      # Unit tests for Foo class
```

## Dependencies

- **JUnit Jupiter 5.10.0**: Testing framework
- **Mockito Core 5.8.0**: Mocking framework for unit tests
- **Hamcrest 2.2**: Matcher library for assertions

## Building the Project

To compile the project:

```bash
mvn compile
```

## Running Tests

To run the unit tests:

```bash
mvn test
```

## Running the Application

This is a library project without a main class. The `Foo` class can be used as a dependency in other projects.

Example usage:

```java
Foo foo = new Foo();
System.out.println(foo.sayHello()); // Outputs: "Hello"
```

## Contributing

1. Fork the repository
2. Create a feature branch
3. Write tests first (TDD approach)
4. Implement the feature
5. Run tests to ensure everything passes
6. Submit a pull request

## License

This project is licensed under the MIT License.
