class Car {

    static int wheels;   // static variable (class-level)
    String brand;
    String model;
    double price;

    // Static block → runs once when class is loaded
    static {
        wheels = 4;
        System.out.println("Static block executed");
    }

    // Constructor → runs every time object is created
    public Car() {
        brand = "";
        model = "";
        price = 0.0;
        System.out.println("Constructor executed");
    }

    void show() {
        System.out.println(brand + " : " + model + " : " + price + " : " + wheels);
    }
}

public class StaticKey {

    public static void main(String[] args) {

        // Creating first object
        Car c1 = new Car();
        c1.brand = "Maruti";
        c1.model = "V12";
        c1.price = 45786.45;

        // Creating second object
        Car c2 = new Car();
        c2.brand = "Fortuner";
        c2.model = "B14";
        c2.price = 457876.45;

        // Changing static variable using class name
        Car.wheels = 6;

        c1.show();
        c2.show();
    }
}

/*
    Static Keyword in Java:

- static is used to create class-level members.
- static members belong to class, not object.
- Only one copy exists for all objects.


Static Variable:
- Shared by all objects.
- Change reflects in every object.

Example:
static int wheels;


Access Static Variable:
- Access using class name.
- No object required.

Example:
Car.wheels = 6;


Static Block:
- Used to initialize static variables.
- Runs only once.
- Executes when class is loaded.

Example:
static {
    wheels = 4;
}


Constructor:
- Used to initialize object values.
- Runs every time object is created.
- Not static.


Execution Flow:
- Class loads
- Static block executes (once)
- Object created
- Constructor executes (every time)


Class Loading Happens When:
- Object is created
- Static member is accessed
- Class.forName() is called


Memory Concept:
- Static variables → Method Area (Class Area)
- Objects & instance variables → Heap memory
- Reference & local variables → Stack memory
- String literals → String Constant Pool


Important Interview Point:
Car.wheels = 6;

- Changes wheels value for ALL objects.
- c1 and c2 both use same wheels value.


One-Line Interview Answer:
- static members are shared among all objects and belong to class.

*/