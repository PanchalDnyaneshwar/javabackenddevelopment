// Calculator class defines behaviour
class Calculator {

    // Method to add two numbers
    int addition(int a, int b) {
        return a + b;
    }
}

// Main class
class Oops1 {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 5;

        // Creating object of Calculator class
        Calculator calc = new Calculator();

        // Calling addition method
        int result = calc.addition(num1, num2);

        // Printing result
        System.out.println(result);
    }
}


/*
    Object-Oriented Programming (OOP):
- In the real world, everything is an object.
- Every object has:
  1) Properties (data)
  2) Behaviour (actions)

Class:
- A class is a blueprint or design of an object.
- It defines how an object should look and behave.

Object:
- An object is created using the 'new' keyword.
- Example: Calculator calc = new Calculator();

Method:
- Methods define behaviour of an object.
- A method can return a value using a return type.
- Example: addition() returns an int value.

*/