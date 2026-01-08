public class Demo {

    public static void main(String[] args) {

        int x = 6;
        int y = 4;

        double a = 15.8;
        double b = 9.4;

        // Logical OR example
        boolean result = (x < y) || (a > b);

        // NOT operator example
        boolean check = x < y;

        System.out.println(!check);  // reverses false to true
        System.out.println(result);
    }
}


/*
    Comparison Operators:
- Used to compare two values.
- Always return boolean (true / false).

<   : less than
>   : greater than
<=  : less than or equal to
>=  : greater than or equal to
==  : equal to
!=  : not equal to

Logical Operators:
- Used to combine conditions.

&& (AND):
- Returns true only if ALL conditions are true.

|| (OR):
- Returns true if ANY ONE condition is true.

! (NOT):
- Reverses the result.
- true becomes false, false becomes true.

Assignment Operator:
= is used to assign a value to a variable.

*/