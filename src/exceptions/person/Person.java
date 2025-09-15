package exceptions.person;

/*
Exercise 5: Exception Handling in Class Inheritance (Advanced Level)
Description: Create a class hierarchy where a base class throws an exception and
a derived class handles that exception in a specific way. For example, an Employee class
that inherits from Person, where Person has a method that can throw an exception that Employee
handles in a particular way.

Requirements:

Person Class:
- setName(String name) method that throws an InvalidNameException if
the name is null or empty.

Employee Class (inherits from Person):
- setSalary(double salary) method that throws an InvalidSalaryException if the salary
is negative.
- Override of the setName method that handles InvalidNameException specifically (for example, set a default name).

Custom Exceptions:
- InvalidNameException (extends Exception).
- InvalidSalaryException (extends Exception).

Main Class:
- Create an Employee instance and test the methods with valid and invalid data.
- Handle exceptions appropriately.

Objectives:
- Understand how exceptions interact with class inheritance.
- Practice catching and handling exceptions in a class hierarchy.
- Implement specific exception handling logic in derived classes.
 */

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) throws InvalidNameException {
        if (name == null || name.isEmpty()) {
            throw new InvalidNameException("Name cannot be empty or null");
        } else {
            this.name = name;
        }
    }
}