class Parent {

    int value = 10;

    Parent() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {

    int value = 20;

    Child() {
        super(); // calls Parent constructor
        System.out.println("Child constructor");
    }

    void display() {
        System.out.println(this.value);   // child variable
        System.out.println(super.value);  // parent variable

        this.show();   // child/parent method
        super.show();  // parent method
    }

    // Method Overloading
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class SuperAndThis {

    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();

        obj.add(5, 10);
        obj.add(5, 10, 15);
    }
}

/*
    this keyword:

- this refers to current object.
- Used to access current class variables and methods.
- Used when local variable and instance variable have same name.
- Used to call current class constructor.

Example:
this.name = name;

super keyword:

- super refers to parent class object.
- Used to access parent class variables.
- Used to call parent class methods.
- Used to call parent class constructor.

Example:
super();
super.value;
super.show();

this vs super:

- this → current class
- super → parent class

Constructor calling order:

- Parent constructor runs first.
- Then child constructor runs.
- super() is called automatically if not written.

Method Overloading:

- Same method name.
- Different parameter list.
- Happens in same class.
- Compile-time polymorphism.

Example:
add(int a, int b)
add(int a, int b, int c)

Important Interview Points:

- this represents current object.
- super represents parent object.
- super() must be first line in constructor.
- Method overloading depends on parameters, not return type.


*/