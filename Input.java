import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) throws Exception {

        // Using Scanner
        System.out.print("Enter a number (Scanner): ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        // Using BufferedReader with finally
        BufferedReader br = null;

        try {
            System.out.print("Enter a number (BufferedReader): ");
            br = new BufferedReader(new InputStreamReader(System.in));
            int num1 = Integer.parseInt(br.readLine());
            System.out.println("You entered: " + num1);
        } finally {
            // Always executed
            if (br != null) {
                br.close();
            }
            sc.close();
        }
    }
}


/*
    How to Take Input in Java:

- Java provides multiple ways to take input.
- Most commonly used:
  - Scanner
  - BufferedReader

  Scanner:

- Easy to use.
- Supports different data types.
- Slower compared to BufferedReader.
- Belongs to java.util package.

Example:
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

BufferedReader:

- Faster than Scanner.
- Used with InputStreamReader.
- Reads input as String.
- Requires parsing.

Example:
BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));
int num = Integer.parseInt(br.readLine());

Difference (Interview):

- Scanner → easy, slow
- BufferedReader → fast, complex

finally Keyword:

- finally block always executes.
- Used to close resources.
- Executes whether exception occurs or not.

Why finally is Important?

- Prevents memory leak.
- Ensures file, DB, network connections are closed.
Use Cases of finally:

- Closing files
- Closing database connections
- Closing network streams

Important Interview Points:

- finally runs even if exception is not handled.
- finally runs even if return statement exists.
- finally does not run only when JVM crashes.
One-Line Interview Answer:

- finally block is used to execute cleanup code
  like closing resources regardless of exception.

*/