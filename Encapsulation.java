class Human {

    private String name;   // private data
    private int age;

    // Constructor
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

public class Encapsulation {

    public static void main(String[] args) {

        Human h1 = new Human("Dnyaneshwar", 24);

        System.out.println(h1.getName());
        System.out.println(h1.getAge());
    }
}

/*
    Encapsulation in Java:

- Encapsulation means wrapping data and methods together.
- Protects data from direct access.
- Achieved using private variables + public methods.


Why instance variables are private?
- To protect data from misuse.
- To control how data is accessed or modified.
- To maintain data security.


Setter Method:
- Used to set or update value.
- Allows validation before assigning value.

Example:
public void setAge(int age)


Getter Method:
- Used to get value of variable.
- Provides read-only access if needed.

Example:
public int getAge()


this keyword:
- this refers to current object.
- Used to differentiate instance variable and local variable.
- Points to object which calls the method.

Example:
this.name = name;


Constructor:
- Used to initialize object values.
- Runs when object is created.
- Constructor name is same as class name.


Interview Points:
- Encapsulation improves security.
- Data hiding is main benefit.
- Private variables + public methods = Encapsulation.
- this keyword represents current object.

*/