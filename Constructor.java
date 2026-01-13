class Human {

    private String name;
    private int age;

    // Default constructor
    public Human() {
        this.name = "";
        this.age = 0;
    }

    // Parameterized constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Constructor{

    public static void main(String[] args) {

        Human h1 = new Human("Dnyaneshwar", 24);

        System.out.println(h1.getName());
        System.out.println(h1.getAge());
    }
}

/*
    Constructor in Java:

- Constructor is a special method.
- Used to initialize object.
- Runs automatically when object is created.
- Constructor name is same as class name.
- Constructor does not have return type.


Why constructor has no return type?
- Constructor is not a normal method.
- JVM uses constructor to create object.
- Returning value is not required.


Why constructor is important?
- Used to initialize object data.
- Used to set default values.
- Used to create database connection.
- Used to open network or file resources.


Types of Constructor:

1) Default Constructor:
- Constructor without parameters.
- Sets default values.
- Provided by compiler if not written.

Example:
public Human() { }


2) Parameterized Constructor:
- Constructor with parameters.
- Used to initialize object with values.

Example:
public Human(String name, int age)


Constructor Overloading:
- Multiple constructors in same class.
- Different parameter list.

Why constructor cannot be static?
- Constructor is used to initialize an object.
- static members belong to class, not object.
- Constructor runs when object is created.
- static method runs without object.
- So constructor and static concept conflict.
- Therefore constructor cannot be static.

Why constructor cannot be inherited?
- Constructor is used to initialize current class object.
- Inheritance is used to reuse methods and variables.
- Parent constructor initializes parent part only.
- Child object must have its own constructor.
- JVM does not allow constructor inheritance.
- But parent constructor is called using super().

Interview Points:
- Constructor runs only once per object.
- Constructor cannot be static.
- Constructor cannot be inherited.
- Constructor is used for object initialization.

*/