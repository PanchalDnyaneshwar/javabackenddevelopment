class Task extends Thread {

    @Override
    public void run() {

        System.out.println("State inside run(): " + Thread.currentThread().getState()); // RUNNABLE

        try {
            // TIMED_WAITING
            Thread.sleep(500);

            synchronized (this) {
                System.out.println("Going to WAITING state");
                wait(500); // WAITING / TIMED_WAITING
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread execution completed");
    }
}

public class ThreadStates {

    public static void main(String[] args) throws Exception {

        Task t1 = new Task();

        // NEW
        System.out.println("State after creation: " + t1.getState());

        // RUNNABLE
        t1.start();
        System.out.println("State after start(): " + t1.getState());

        // Small delay to let thread enter sleep
        Thread.sleep(100);

        // TIMED_WAITING
        System.out.println("State during sleep(): " + t1.getState());

        // main thread waits for t1 to finish
        t1.join();

        // TERMINATED
        System.out.println("State after completion: " + t1.getState());
    }
}


/*
    Thread Lifecycle in Java:

- Thread lifecycle shows different states
  of a thread from creation to end.

  1) NEW State:

- Thread object is created.
- start() not called yet.

Example:
Thread t = new Thread();

2) RUNNABLE State:

- start() method is called.
- Thread is ready to run.
- Waiting for CPU from scheduler.

Method:
start()

3) RUNNING State:

- Thread is executing run() method.
- CPU is assigned by scheduler.

4) TIMED_WAITING State:

- Thread is paused for fixed time.
- Automatically resumes after time.

Methods:
sleep(time)
wait(time)
join(time)

sleep():

- Pauses current thread.
- Does NOT release lock.

5) WAITING State:

- Thread waits until notified.
- Releases lock.

Methods:
wait()
join()

wait():

- Thread waits for notify().
- Used in inter-thread communication.

join():

- One thread waits for another to finish.
- Mostly used by main thread.

6) TERMINATED (Dead) State:

- run() method execution ends.
- Thread is finished.
- Thread cannot be restarted.

Thread Lifecycle Flow (Interview Diagram):

NEW
 ↓ start()
RUNNABLE
 ↓ scheduler
RUNNING
 ↓ sleep / wait / join
WAITING / TIMED_WAITING
 ↓ notify / time over
RUNNABLE
 ↓ execution complete
TERMINATED

Important Interview Points:

- start() creates a new thread.
- run() contains thread logic.
- join() makes one thread wait.
- sleep() pauses thread temporarily.
- stop() is deprecated and unsafe.

Real Life Example:

- File download
- Online payment
- Video streaming
- Printing job

One-Line Interview Answer:

- Thread lifecycle represents different states
  a thread goes through from creation to termination.
*/