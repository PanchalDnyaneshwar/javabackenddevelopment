
@FunctionalInterface
interface A {
    
    int add(int a, int b);
}

public class FunctionalInterface1 {
    public static void main(String[] args) {
        
        // Inner anonymous class 
        // A obj = new A() {

        //     public int add( int a, int b)
        //     {
        //         return a + b;
        //     }
        // };

        // Lambda expression
        A obj =  (i, j) -> i + j; 

        int res = obj.add(12, 14);
        System.out.println(res);
    }    
}

/*
    Java 8 Features:

- Lambda Expressions
- Functional Interface
- Default methods
- Stream API
- Optional class
- Method Reference
- Date and Time API

Functional Interface:

- Interface with only one abstract method.
- Also called SAM (Single Abstract Method).
- Used with Lambda expressions.

Example:
@FunctionalInterface
interface A {
    int add(int a, int b);
}

Lambda Expression:

- Short form of anonymous class.
- Introduced in Java 8.
- Used to implement functional interface.
Syntax of Lambda:

(parameters) -> expression

Example:
(i, j) -> i + j

Important Interview Points:

- Lambda works only with functional interface.
- @FunctionalInterface is optional but recommended.
- Lambda provides implementation at runtime.

One-Line Interview Answer:

- Lambda expression is a concise way to implement
  functional interfaces introduced in Java 8.


*/