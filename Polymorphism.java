class A {
    public void show() {
        System.out.println("show in A");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("show in B");
    }
}

class C extends B {
    @Override
    public void show() {
        System.out.println("show in C");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        A obj;   // parent class reference

        obj = new A();
        obj.show();   // calls A's show()

        obj = new B();
        obj.show();   // calls B's show()

        obj = new C();
        obj.show();   // calls C's show()
    }
}

/*
    Polymorphism:

- Poly means many.
- Morphism means behaviour.
- One method shows different behaviour.

Types of Polymorphism:

1) Compile-time Polymorphism:
- Method Overloading
- Happens at compile time.
- Same method name, different parameters.

2) Run-time Polymorphism:
- Method Overriding
- Happens at runtime.
- Parent reference, child object.

Runtime Polymorphism Example:

A obj;
obj = new B();
obj.show();

- Method call depends on object type.
- Not on reference type.

Dynamic Method Dispatch:

- Process of calling overridden method at runtime.
- JVM decides which method to execute.
- Based on object created.

Early Binding:
- Compile-time binding.
- Method overloading.

Late Binding:
- Runtime binding.
- Method overriding.

Important Interview Points:

- Polymorphism improves flexibility.
- Parent reference can refer to child object.
- Overridden method is called at runtime.
- Achieved using inheritance + overriding.

One-Line Interview Answer:

- Polymorphism allows one method to perform
  different actions based on object type.

*/