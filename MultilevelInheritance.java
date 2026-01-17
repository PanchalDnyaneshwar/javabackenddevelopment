class A {

    public String concat(String a, String b) {
        return a + b;
    }
}

class B extends A {

    public String concatHello(String name) {
        return "Hello " + name;
    }
}

// Multilevel Inheritance
public class MultilevelInheritance extends B {

    public static void main(String[] args) {

        B obj = new B();

        String fullName = obj.concat("Dnyanu ", "Panchal");
        System.out.println(fullName);

        System.out.println(obj.concatHello(fullName));
    }
}


/*
    Multilevel Inheritance:

- When a class inherits another class,
  and that class is already inherited from another class.
- Forms a chain of inheritance.
vbnet
Copy code
Example Structure:

Class A  →  Class B  →  Class C
less
Copy code
In this example:

- Class A has concat() method
- Class B extends A and adds concatHello()
- MultilevelInheritance extends B

So:
- MultilevelInheritance IS-A B
- B IS-A A
r
Copy code
Method Access:

- Child class can access all public methods of parent.
- Object of child can call methods of all parent classes.
kotlin
Copy code
Important Points:

- extends keyword is used for inheritance
- Code reusability is main benefit
- Parent class methods are reused
powershell
Copy code
Interview Points:

- Java supports multilevel inheritance
- Java does NOT support multiple inheritance using classes
- Multiple inheritance is supported using interfaces

One-Line Interview Answer:

- Multilevel inheritance is when a class is derived from a class which is already derived from another class.
*/