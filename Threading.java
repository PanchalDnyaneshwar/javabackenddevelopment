public class Threading {

    public static void main(String[] args) {

        // Runnable using Lambda
        Runnable r1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Dnyaneshwar");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        Runnable r2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Panchal");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        // Thread objects
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // Start threads
        t1.start();
        t2.start();
    }
}

/*
  Runnable Interface in Java:

- Runnable is a functional interface.
- Contains only one method: run().
- Used to define thread task.

Why Runnable Interface is Needed?

- Java does not support multiple inheritance.
- If we extend Thread, we cannot extend another class.
- Runnable solves this problem.

Difference: Thread vs Runnable

Thread:
- Extends Thread class.
- Less flexible.
- Not recommended.

Runnable:
- Implements Runnable interface.
- More flexible.
- Best practice.

Lambda with Runnable:

- Runnable is functional interface.
- Lambda expression can be used.
- Reduces code length.

How Runnable Works:

- Runnable defines task.
- Thread executes task.
- Thread object is required to start execution.

Why we use Thread class with Runnable?

- Runnable cannot start thread.
- Thread class starts thread using start().

Benefits of Runnable:

- Supports multiple inheritance.
- Better design.
- Separates task from thread.

Important Interview Points:

- Runnable is preferred over Thread.
- Runnable supports Lambda.
- Thread.sleep() pauses current thread.
- start() creates new thread.

One-Line Interview Answer:

- Runnable interface is used to define thread task
  and provides better flexibility than Thread class.

*/