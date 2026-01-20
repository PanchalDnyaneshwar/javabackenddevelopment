class Counter {

    int count;

    // synchronized method (thread-safe)
    public synchronized void increment() {
        count++;
    }
}

public class Mutation {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(c.count); // Always 2000
    }
}


/*
    Mutation in Java:

- Mutation means modifying shared data.
- Happens when multiple threads access same variable.

Problem with Mutation:

- Multiple threads modify same data at same time.
- Leads to inconsistent or wrong output.
- This problem is called Race Condition.

Thread Safety:

- Thread-safe code ensures correct result.
- Only one thread can access critical section at a time.

synchronized Keyword:

- Used to make method or block thread-safe.
- Allows only one thread at a time.
- Mutation causes race condition.
- synchronized ensures thread safety

Why synchronized is needed?

- Prevents race condition.
- Ensures data consistency.


One-Line Interview Answer:

- Mutation is modification of shared data by multiple threads
  and synchronization is used to make it thread-safe.

*/