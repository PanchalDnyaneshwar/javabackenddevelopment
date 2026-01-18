abstract class Car {

    // Abstract methods
    public abstract void drive();
    public abstract void stop();

    // Concrete method
    public void playMusic() {
        System.out.println("Playing Music");
    }
}

// Abstract class partially implementing parent
abstract class Hyundai extends Car {

    @Override
    public void drive() {
        System.out.println("Driving...");
    }
}

// Concrete class
class Verna extends Hyundai {

    @Override
    public void stop() {
        System.out.println("Stopped");
    }
}

public class AbstractKeyword {

    public static void main(String[] args) {

        // Car obj = new Car(); ❌ not allowed

        Car obj = new Verna();   // upcasting
        obj.drive();
        obj.playMusic();
        obj.stop();
    }
}

/*
    Abstract Keyword in Java:

- abstract keyword is used with class and method.
- Used to hide implementation details.

Abstract Class:

- A class declared using abstract keyword.
- Cannot create object of abstract class.
- Can have abstract and non-abstract methods.

Abstract Method:

- Method without body.
- Only declaration, no implementation.
- Must be overridden in child class.

Example:
abstract void drive();

Why abstract method must be in abstract class?

- Abstract method has no body.
- Normal class must provide implementation.
- So abstract method is allowed only in abstract class.

Why abstract class is needed?

- To provide common structure.
- To enforce method implementation in child classes.
- To achieve abstraction (hiding details).

Concrete Class:

- Normal class.
- Provides implementation of all abstract methods.
- Object can be created.

Example:
class Verna extends Hyundai

Abstract Class Rules:

- Cannot create object.
- Can have constructor.
- Can have static methods.
- Can have non-abstract methods.

Abstract vs Concrete Class:

- Abstract class → incomplete
- Concrete class → complete

Important Interview Points:

- Abstract class supports inheritance.
- Abstract class can have final methods.
- Child must implement all abstract methods.
- Used when classes are closely related.

Why abstract class can have constructor?

- Abstract class cannot be instantiated directly.
- But abstract class is inherited by child classes.
- When child object is created, parent constructor must run.
- Constructor is used to initialize parent class variables.
- So abstract class constructor is executed via child class.

Example Flow:

- Child object is created.
- Parent abstract class constructor runs first.
- Then child class constructor runs.

Why constructor is needed in abstract class?

- To initialize common variables.
- To perform setup logic.
- To ensure parent part is properly initialized.

Important Point:

- Constructor is NOT for object creation only.
- Constructor is also for initialization.

One-Line Interview Answer:

- Abstract class is used to define a blueprint
  where some methods are implemented
  and some are left for child classes.

- Abstract class can have constructor because
  it is called when child class object is created
  to initialize parent part of the object.

*/