class Calculator {

    int c = 5; // Instance variable

    int addition(int x, int y) {
        System.out.println(c); // accessing instance variable
        return x + y;          // x and y are local variables
    }
}

public class Oops1 {

    public static void main(String[] args) {

        int num1 = 5; // local variable
        int num2 = 5; // local variable

        Calculator calc = new Calculator(); // reference variable pointing to object

        int result = calc.addition(num1, num2);
        System.out.println(result);
    }
}


/*
    Object-Oriented Programming (OOP):
- Everything in the real world can be represented as an object.
- Every object has:
  1) Properties (variables)
  2) Behaviour (methods)

Class:
- A class is a blueprint or design of an object.
- It defines properties and behaviour.

Object:
- An object is created using the 'new' keyword.
- Example: new Calculator()

Reference Variable:
- 'calc' is a reference variable.
- It stores the address of the object, not the object itself.

Variables:
- Instance Variable:
  Declared inside class but outside methods.
  Stored in heap memory.
  Example: int c = 5;

- Local Variable:
  Declared inside methods.
  Stored in stack memory.
  Example: x, y, num1, num2

Memory in Java:
- Stack Memory:
  Stores method calls and local variables.

- Heap Memory:
  Stores objects and instance variables.

*/