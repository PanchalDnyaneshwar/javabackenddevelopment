// Traditional POJO (before Java 16)
class Employee {

    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ", salary=" + salary + "]";
    }
}

// Record class (Java 16+)
record EmployeeRecord(String name, double salary) { }

public class RecordClass {

    public static void main(String[] args) {

        Employee e1 = new Employee("Dnyaneshwar Panchal", 35000);
        EmployeeRecord e2 = new EmployeeRecord("Swapnil Panchal", 50000);

        System.out.println(e1);
        System.out.println(e2);
    }
}

/*
    Record Class in Java:

- Introduced in Java 16.
- Used as Data Carrier class.
- Automatically creates boilerplate code.

What Problem Records Solve?

- Too much boilerplate code.
- Need for getters, constructor, equals, hashCode, toString.

Record Automatically Provides:

- Constructor
- Getters (name(), salary())
- equals()
- hashCode()
- toString()

Why Record is Needed?

- To represent immutable data.
- To reduce code length.
- To improve readability.

Important Properties of Record:

- Record is immutable.
- All fields are private and final.
- Cannot extend other classes.
- Can implement interfaces.

Real-Life Use Cases:

- DTO (Data Transfer Object)
- API request/response
- Employee, Student, Product data

One-Line Interview Answer:

- Record class is used to create immutable
  data carrier classes with less boilerplate code.

*/