class A extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread1 {

    public static void main(String[] args) {

        A t1 = new A();
        B t2 = new B();

        t1.start();   // starts new thread

        try {
            Thread.sleep(20); // main thread sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();   // starts another thread
    }
}

/*
    Thread in Java:

- Thread is a lightweight process.
- Used to perform multiple tasks at same time.
- Helps in parallel execution.

Why Thread is Needed?

- To improve performance.
- To utilize CPU cores efficiently.
- To run tasks simultaneously.

Thread Flow (System Level):

H/W → OS → JVM → Thread Scheduler → CPU Cores

Thread Scheduler:

- Part of JVM.
- Decides which thread runs.
- Uses time-slicing and priority.

How Thread Works:

- Multiple threads share CPU time.
- Scheduler switches between threads.
- Looks like parallel execution.

Creating Thread in Java (2 Ways):

1) Extending Thread class
2) Implementing Runnable interface

start() vs run():

- start() creates new thread.
- run() contains thread logic.
- Never call run() directly.

sleep():

- Pauses current thread.
- Time is in milliseconds.
- Throws InterruptedException.

Multicore System:

- Modern systems have multiple cores.
- Threads can run truly parallel.

Important Interview Points:

- Thread is smaller than process.
- JVM handles thread scheduling.
- start() internally calls run().
- sleep() pauses current thread.

One-Line Interview Answer:

- Thread is a lightweight sub-process
  used to achieve multitasking in Java.

*/