class A {

    public int add(int x, int y) {
        return x + y + 1;
    }
}

class B extends A {

    // Method overriding
    @Override
    public int add(int x, int y) {
        return x + (y * 2);
    }
}

public class Overriding {

    public static void main(String[] args) {

        B obj = new B();   // child class object
        int res = obj.add(12, 4);
        System.out.println(res);
    }
}

/*
    Method Overriding:

- When child class provides its own implementation
  of parent class method.
- Method name and parameters must be same.
- Happens between parent and child class.

Rules of Method Overriding:

- Method name must be same.
- Parameter list must be same.
- Return type must be same or compatible.
- Access level cannot be reduced.
- Method must not be static.

Runtime Polymorphism:

- Method overriding is runtime polymorphism.
- Method call depends on object type.

Example in Code:

- Class A has add() method.
- Class B overrides add() method.
- Child version is called at runtime.

Important Points:

- Overriding happens in inheritance.
- Parent method is replaced by child method.
- @Override annotation helps avoid mistakes.

One-Line Interview Answer:

- Method overriding is when a child class provides
  a specific implementation of a parent class method.

*/