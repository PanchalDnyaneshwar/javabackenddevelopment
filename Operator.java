public class Operator {

    public static void main(String[] args) {

        int num = 5;
        int num1 = 8;

        int addition = num + num1;        // 13
        int subtraction = num - num1;     // -3
        int multiplication = num * num1;  // 40
        int division = num / num1;        // 0 (integer division)
        int modulus = num % num1;         // 5

        // Increment and Decrement using assignment operators
        num += 1; // same as num++
        num -= 1; // same as num--

        System.out.println(num);

        System.out.println(
            "Add: " + addition +
            " Sub: " + subtraction +
            " Mul: " + multiplication +
            " Div: " + division +
            " Mod: " + modulus
        );
    }
}


/*
    Operators:
- Operators are used to perform operations on values.

Arithmetic Operators:
+  : Addition
-  : Subtraction
*  : Multiplication
/  : Division (gives quotient)
%  : Modulus (gives remainder)

Increment / Decrement:
var++  : Post-increment (use value, then increase)
++var  : Pre-increment (increase, then use value)
var--  : Post-decrement (use value, then decrease)
--var  : Pre-decrement (decrease, then use value)

Assignment Operators:
+=  : add and assign
-=  : subtract and assign

Important Point:
- Integer division always returns an integer value.
- Example: 5 / 8 = 0

*/