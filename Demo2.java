public class Demo2 {

    public static void main(String[] args) {

        float marks1 = 45.1f;
        int marks2 = 47;

        // AND (&&) operator example
        if (marks1 > 40 && marks2 > 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // OR (||) operator example
        if (marks1 > 40 || marks2 > 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}

/*
    if-else Statement:
- Used to execute code based on a condition.

Logical Operators:
&& (AND):
- Both conditions must be true.
- Example: marks1 > 40 && marks2 > 40

|| (OR):
- At least one condition must be true.
- Example: marks1 > 40 || marks2 > 40

Use Case:
- Commonly used for pass/fail conditions, login validation, etc.

*/