public class Exception1 {

    public static void main(String[] args) {

        // Compile-time error example:
        // System.out.Println("Hi");  // method name wrong

        // Runtime error example:
        // System.out.println(5 / 0);

        // Logical error example:
        // System.out.println(5 + 5); // expected maybe 10, logic mistake comment

        int i = 2;
        double[] arr = new double[4];

        try {
            int res = 16 / i;
            System.out.println(res);

            System.out.println(arr[1]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e);
        }
    }
}

/*
    Exception in Java:

- Exception is an unwanted event.
- Occurs during program execution.
- Disrupts normal flow of program.

What is Error?

- Error is a serious problem.
- Cannot be handled by program.
- Example: OutOfMemoryError.

Types of Errors:

1) Compile-Time Error:
- Occurs during compilation.
- Syntax mistakes.
- Detected by compiler.

Example:
System.out.Println("Hi");

2) Run-Time Error:
- Occurs while program is running.
- Also called exception.
- Detected by JVM.

Example:
5 / 0

3) Logical Error:
- Program runs but gives wrong output.
- Due to wrong logic.
- Not detected by compiler or JVM.

Exception Handling:

- Used to handle runtime errors.
- Prevents program from crashing.

try block:
- Code that may cause exception.

catch block:
- Handles exception.

finally block:
- Executes always (optional).

Important Interview Points:

- Exception occurs at runtime.
- Errors are not recoverable.
- try-catch handles exceptions.
- JVM throws exception object.

One-Line Interview Answer:

- Exception is a runtime problem that
  interrupts normal program execution.

*/