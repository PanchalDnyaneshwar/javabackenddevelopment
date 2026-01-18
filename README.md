📘 Core Java Notes (Simple & Interview Ready)

🔹 Java Basics

Java is an object-oriented programming language.

Program execution starts from the main() method.

One .java file can have only one public class.

File name must match the public class name.

🔹 Data Types

Primitive Data Types

int → whole numbers

float → decimal numbers (f required)

double → decimal numbers (default)

char → single character

boolean → true / false

Non-Primitive Data Types

String

Array

Class

Object

🔹 Operators

Arithmetic Operators

+ Addition

- Subtraction

* Multiplication

/ Division (integer division removes decimal)

% Modulus (remainder)

Increment / Decrement

++ increase by 1

-- decrease by 1

Assignment Operators

=, +=, -=

🔹 Conditional Statements

if-else

Used to execute code based on condition.

switch

Used when checking a variable against fixed values.

Cleaner than long if-else ladder.

break stops execution of next case.

🔹 Loops (Iteration)

Types of Loops

for → when number of iterations is known

while → when end condition is not known

do-while → runs at least once

Nested loop → loop inside another loop

🔹 Arrays

Array

Used to store multiple values of same data type.

Size is fixed.

Index starts from 0.

Types

1D Array

2D Array

Jagged Array (rows with different sizes)

🔹 for-each Loop

Used to traverse arrays easily.

No index handling.

Read-only loop.

for(Type var : array)

🔹 Object Array

Array that stores objects instead of primitive values.

Each element stores reference of an object.

Default value is null.

Use Case

Students

Employees

Products

🔹 String in Java

String is a class, not primitive.

Used to store text.

Located in java.lang package.

String Immutability

String cannot be changed.

Any modification creates a new object.

String Creation

String literal → String Constant Pool (SCP)

new String() → Heap memory

String Comparison

== → compares reference

equals() → compares value

String Constant Pool (SCP)

Special memory area inside heap.

Stores only one copy of same string value.

Improves memory efficiency.

🔹 Mutable Strings

StringBuffer

Mutable

Thread safe

Slower

Synchronized

StringBuilder

Mutable

Not thread safe

Faster

Not synchronized

Capacity Rule

Default capacity = 16

New capacity = (old * 2) + 2

🔹 OOP Concepts
Object-Oriented Programming

Everything is treated as object.

Object has:

Properties (variables)

Behaviour (methods)

🔹 Encapsulation

Wrapping data and methods together.

Achieved using:

private variables

public getters/setters

Benefits

Data security

Data hiding

Controlled access

🔹 Constructor

Special method used to initialize object.

Same name as class.

No return type.

Runs automatically when object is created.

Types

Default constructor

Parameterized constructor

Important

Constructor cannot be static.

Constructor cannot be inherited.

Constructor runs once per object.

🔹 this Keyword

Refers to current object.

Used to differentiate instance and local variables.

Used to call current class constructor or methods.

🔹 super Keyword

Refers to parent class object.

Used to:

Access parent variables

Call parent methods

Call parent constructor

🔹 Inheritance

Acquiring properties and methods of another class.

Represents IS-A relationship.

Uses extends keyword.

Types

Single-level inheritance

Multi-level inheritance

Important

Java does not support multiple inheritance using classes.

Supported using interfaces.

🔹 Method Overloading

Same method name.

Different parameter list.

Happens in same class.

Compile-time polymorphism.

🔹 static Keyword

Static Variable

Belongs to class.

Shared by all objects.

Only one copy exists.

Static Method

Belongs to class.

Can be called without object.

Cannot access non-static variables directly.

Static Block

Runs once when class is loaded.

Used to initialize static variables.

Why main method is static

JVM can call it without creating object.

🔹 Memory Concept (Very Important)

Heap → Objects, instance variables

Stack → Local variables, reference variables

Method Area → Static variables, class metadata

String Constant Pool → String literals

🔹 Important Interview Rules

One public class per file

File name = public class name

Use equals() for string comparison

Constructors are not inherited

Static members belong to class

Child object can access parent methods

🔹 One-Line Interview Answers

String is immutable.

Encapsulation = data hiding.

Inheritance = code reuse.

static members belong to class.

Constructor initializes object.

    Multilevel Inheritance:

- When a class inherits another class,
  and that class is already inherited from another class.
- Forms a chain of inheritance.
vbnet
Copy code
Example Structure:

Class A  →  Class B  →  Class C
less
Copy code
In this example:

- Class A has concat() method
- Class B extends A and adds concatHello()
- MultilevelInheritance extends B

So:
- MultilevelInheritance IS-A B
- B IS-A A
r
Copy code
Method Access:

- Child class can access all public methods of parent.
- Object of child can call methods of all parent classes.
kotlin
Copy code
Important Points:

- extends keyword is used for inheritance
- Code reusability is main benefit
- Parent class methods are reused
powershell
Copy code
Interview Points:

- Java supports multilevel inheritance
- Java does NOT support multiple inheritance using classes
- Multiple inheritance is supported using interfaces

One-Line Interview Answer:

- Multilevel inheritance is when a class is derived from a class which is already derived from another class.

Multiple Inheritance in Java:

- Multiple inheritance means a class inherits from more than one class.
- One child class having multiple parent classes.

Status in Java:

- Java does NOT support multiple inheritance using classes.
- Java supports multiple inheritance using interfaces.

Why Java does NOT support multiple inheritance with classes?

- To avoid ambiguity problem.
- Known as Diamond Problem.
- JVM gets confused which parent method to call.

Diamond Problem Example:

class A {
    void show() { }
}

class B extends A { }
class C extends A { }

// Not allowed
class D extends B, C { }  ❌

How Java solves this problem?

- Java uses interfaces.
- Interfaces contain method declarations.
- Implementation is done in child class.

Multiple Inheritance using Interface:

interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() { }
    public void display() { }
}

Important Interview Points:

- Java does not support multiple inheritance with classes.
- Java supports multiple inheritance with interfaces.
- Diamond problem is main reason.
- implements keyword is used for interfaces.

One-Line Interview Answer:

- Java supports multiple inheritance using interfaces, not classes, to avoid ambiguity.

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

   final Keyword in Java:

- final is used to restrict modification.
- Used with variable, method, and class.

final Variable:

- Value cannot be changed.
- Makes variable constant.

Example:
final double pie = 3.14;

final Method:

- Method cannot be overridden.
- Used to prevent method modification.

Example:
final void show()

final Class:

- Class cannot be inherited.
- Used to stop inheritance.

Example:
final class Calc

Why use final?

- Provides security.
- Prevents unwanted modification.
- Improves code safety.

Important Interview Points:

- final variable → constant
- final method → no overriding
- final class → no inheritance
- final keyword improves security

One-Line Interview Answer:

- final keyword is used to restrict inheritance,
  overriding, and value modification.


 Object Class in Java:

- Object class is the parent class of all classes.
- Every class in Java implicitly extends Object class.

Common Methods of Object Class:

- toString()
- equals()
- hashCode()
- getClass()

toString():

- Converts object into string format.
- Called automatically when object is printed.
- Default output is className@hashCode.
- We override it for readable output.

equals():

- Used to compare two objects.
- Default equals() compares reference.
- We override equals() to compare content.

hashCode():

- Returns integer hash value of object.
- Used in hashing-based collections.
- If equals() is overridden, hashCode() must also be overridden.

Why override equals() and hashCode()?

- To compare object data, not memory address.
- Required for HashMap, HashSet, etc.

Important Interview Points:

- Object is the superclass of all classes.
- equals() compares reference by default.
- toString() gives object representation.
- equals() and hashCode() must follow contract.

One-Line Interview Answer:

- Object class is the root class of Java from which all classes are inherited.


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


  