class A {

    int n = 5;
    String name = "Dnyaneshwar";

    // Inner class
    class B {
        public void show() {
            System.out.println("Name : " + name);
        }
    }
}

public class InnerClass1 {

    public static void main(String[] args) {

        A a = new A();          // Outer class object
        A.B b = a.new B();     // Inner class object
        b.show();              // Access inner class method
    }
}

/*
    Inner Class in Java:

- A class defined inside another class.
- Inner class can access outer class variables.

Why Inner Class?

- Used for logical grouping.
- Improves encapsulation.
- Used when class is tightly coupled with another class.

How to Create Inner Class Object?

- First create outer class object.
- Then create inner class object using outer object.

Syntax:
OuterClass.InnerClass obj = outerObj.new InnerClass();

Example:

A a = new A();
A.B b = a.new B();

Access Rule:

- Inner class can access all members of outer class.
- Even private variables can be accessed.

Types of Inner Classes:

- Member Inner Class
- Static Nested Class
- Local Inner Class
- Anonymous Inner Class

Important Interview Points:

- Inner class depends on outer class object.
- Cannot create inner class object directly.
- Inner class increases code readability.

One-Line Interview Answer:

- Inner class is a class defined inside another class
  and it can access outer class members.

 */