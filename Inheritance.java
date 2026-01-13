
// Main class
public class Inheritance extends SciCalc {

    public static void main(String[] args) {
        
        // Calc obj = new Calc();
       // AdvCalc obj = new AdvCalc();
        SciCalc obj = new SciCalc();


        int res1 = obj.add(12, 15 );
        int res2 = obj.sub(12, 15 );
        int res3 = obj.multi(12, 15 );
        int res4 = obj.div(12, 15 );
        double res5 = obj.power(3, 4);
        System.out.println( " add : " +  res1 + " sub : " +  res2 + " multi : " + 
                            res3 + " div : " + res4 + " power : " + res5);
    }
}

/*
  Inheritance in Java:

- Inheritance means acquiring properties and methods of another class.
- It represents IS-A relationship.
- Used for code reusability.


extends keyword:
- Used to inherit one class into another.
- Child class uses extends parent class.

Example:
class B extends A

Types of Inheritance used here:

Single-level Inheritance:
- One child inherits one parent.

Example:
AdvCalc extends Calc

Multi-level Inheritance:
- A class inherits another class which already inherited a class.

Example:
SciCalc → AdvCalc → Calc

Method Access:
- Child class can access all public methods of parent.
- Object of child class can call methods of all parent classes.

IS-A Relationship:
- SciCalc IS-A AdvCalc
- AdvCalc IS-A Calc

Important Interview Points:
- Java does not support multiple inheritance with classes.
- Multiple inheritance is supported using interfaces.
- Inheritance improves code reusability.
- extends keyword is used for inheritance.

Why only one public class is allowed in a Java file?

- Java file name must match the public class name.
- JVM uses file name to find the public class.
- If more than one public class exists, JVM gets confused.
- So Java allows only one public class per file.

Why other classes must be non-public?

- Non-public classes do not need to match file name.
- They can exist inside same file without conflict.
- They are accessible only within the same package.
- Used to support helper or utility classes.
Example:

public class A { }   // file name must be A.java
class B { }          // allowed
class C { }          // allowed

Invalid Example:

public class A { }
public class B { }   // ❌ compile-time error

Important Interview Line:

- One Java file can have only one public class because file name must match public class name.

Why Java enforces this rule?

- To avoid ambiguity during class loading.
- To make code organization simple.
- To improve maintainability.

*/

