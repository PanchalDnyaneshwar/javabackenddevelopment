class A {
    public void show1() {
        System.out.println("Show in A");
    }
}

class B extends A {
    public void show2() {
        System.out.println("Show in B");
    }
}

public class DownUpCasting {

    public static void main(String[] args) {

        // Upcasting
        A obj = new B();
        obj.show1();

        // Downcasting
        B obj1 = (B) obj;
        obj1.show2();
    }
}

/*
    Upcasting:

- Converting child object to parent reference.
- Happens automatically.
- Safe casting.
- Parent reference points to child object.

Example:
A obj = new B();

What we can access in Upcasting?

- Only parent class methods.
- Child-specific methods are not accessible.

Why Upcasting is used?

- Used for runtime polymorphism.
- Achieves loose coupling.
- Helps in method overriding.


Downcasting:

- Converting parent reference to child reference.
- Must be done explicitly.
- Not always safe.
- Requires type casting.

Example:
B obj1 = (B) obj;

When Downcasting is safe?

- When parent reference actually points to child object.
- Otherwise ClassCastException occurs.

Use Case:

- Used when we need child-specific methods.
- Common in collections and frameworks.

Important Interview Points:

- Upcasting is implicit.
- Downcasting is explicit.
- Upcasting supports polymorphism.
- Wrong downcasting causes runtime error.

One-Line Interview Answer:

- Upcasting converts child object to parent reference,
  while downcasting converts parent reference to child object.
*/