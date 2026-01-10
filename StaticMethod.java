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

    // Non-static method (can access instance variables directly)
    void show() {
        System.out.println(brand + " : " + model + " : " + price + " : " + wheels);
    }

    // Static method (cannot access instance variables directly)
    static void showDetails(Car obj) {
        System.out.println(obj.brand + " : " + obj.model + " : " + obj.price);
    }
}

public class StaticMethod {

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Maruti";
        c1.model = "V12";
        c1.price = 45786.45;

        // Calling static method using class name
        Car.showDetails(c1);
    }
}


/*
    Static Method in Java:

- Static method belongs to class, not object.
- Can be called using class name.
- No need to create object to call static method.


Syntax:
static returnType methodName() { }


Why Static Method?
- When method logic is common for all objects.
- When method does not depend on object data.


Example:
static void showDetails(Car obj) { }


Static Method Rules:
- Static method cannot access non-static variables directly.
- Static method can access:
  - Static variables
  - Static methods
- To access instance variables, object reference is required.


Why object is passed in static method?
- Because instance variables belong to object.
- Static method does not know which object data to use.


Example:
Car.showDetails(c1);


Why main method is static?
- JVM needs to call main method without creating object.
- Program execution starts from main method.
- JVM does not create object automatically.


main method syntax:
public static void main(String[] args)


Static vs Non-Static:
- Static → class level
- Non-static → object level


Real-Life Use Case:
- Utility methods
- Helper methods
- Mathematical calculations
- Factory methods


Interview Points:
- Static methods are faster (no object dependency).
- Static methods cannot be overridden.
- main() is static so JVM can start program execution.

*/