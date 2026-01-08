public class TernaryOp {

    public static void main(String[] args) {

        int num = 4;

        // Ternary operator example
        int result = (num % 2 == 0) ? 10 : (num <= 0 ? 5 : 20);

        System.out.println(result);
    }
}

/*
    Ternary Operator (?:)
- Short form of if-else statement.
- Used to write conditions in one line.

Syntax:
condition ? value_if_true : value_if_false

Nested Ternary:
- Used when multiple conditions are needed.
- Should be used carefully to keep code readable.

Example Logic:
- If number is even → 10
- Else if number <= 0 → 5
- Else → 20

*/