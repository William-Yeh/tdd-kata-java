# Codebase Index

## Classes

### com.kata.Foo
- **Location**: src/main/java/com/kata/Foo.java
- **Purpose**: Main implementation class for the TDD kata
- **Methods**:
  - `sayHello()`: Returns a greeting string "Hello"
- **Dependencies**: None
- **Tests**: Covered by FooTest

### com.kata.FooTest
- **Location**: src/test/java/com/kata/FooTest.java
- **Purpose**: Unit tests for the Foo class
- **Framework**: JUnit with AssertJ assertions
- **Test Methods**:
  - `testSayHello()`: Verifies that sayHello() returns "Hello"
- **Dependencies**: JUnit, AssertJ

## Key Patterns
- Simple method implementation with corresponding test
- Use of AssertJ fluent assertions (assertThat with isEqualTo)
- Standard Maven project structure

## Current Implementation Notes
- Foo class contains minimal functionality - just a greeting method
- Test coverage exists for the current functionality
- Ready for expansion with additional TDD cycles
