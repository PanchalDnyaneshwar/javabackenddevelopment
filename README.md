# 📘 Core Java Notes - Complete Reference Guide

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Interview Ready](https://img.shields.io/badge/Interview-Ready-green?style=for-the-badge)
![Beginner Friendly](https://img.shields.io/badge/Beginner-Friendly-blue?style=for-the-badge)

**A comprehensive collection of Core Java concepts with simple explanations and interview-ready one-liners**

[Quick Start](#quick-start) • [Topics Covered](#-topics-covered) • [How to Use](#-how-to-use) • [Contributing](#-contributing)

</div>

---

## 📑 Table of Contents

- [About](#-about)
- [Topics Covered](#-topics-covered)
- [Quick Start](#quick-start)
- [Core Concepts](#-core-concepts)
  - [Java Basics](#1-java-basics)
  - [Data Types & Operators](#2-data-types--operators)
  - [Control Flow](#3-control-flow)
  - [Arrays & Strings](#4-arrays--strings)
  - [OOP Concepts](#5-oop-concepts)
  - [Advanced OOP](#6-advanced-oop)
  - [Exception Handling](#7-exception-handling)
  - [Collections Framework](#8-collections-framework)
  - [Java 8+ Features](#9-java-8-features)
  - [Multithreading](#10-multithreading)
  - [Modern Java](#11-modern-java-features)
- [Interview One-Liners](#-interview-one-liners)
- [How to Use](#-how-to-use)
- [Contributing](#-contributing)
- [License](#-license)

---

## 🎯 About

This repository contains **simplified and interview-ready notes** on Core Java concepts. Whether you're a beginner learning Java or preparing for technical interviews, this guide covers everything from basics to advanced topics with:

✅ **Simple explanations** - Easy to understand  
✅ **Real-life examples** - Practical use cases  
✅ **Interview one-liners** - Quick revision  
✅ **Code snippets** - Implementation examples  
✅ **Best practices** - Industry standards  

---

## 🗂️ Topics Covered

<details open>
<summary><b>Fundamentals</b></summary>

- Java Basics & Program Structure
- Data Types (Primitive & Non-Primitive)
- Operators (Arithmetic, Relational, Logical)
- Control Flow (if-else, switch, loops)
- Arrays (1D, 2D, Jagged, Object Arrays)

</details>

<details open>
<summary><b>Object-Oriented Programming</b></summary>

- Classes & Objects
- Encapsulation & Data Hiding
- Constructors & this Keyword
- Inheritance & super Keyword
- Method Overloading & Overriding
- Polymorphism (Compile-time & Runtime)
- Abstraction (Abstract Classes & Interfaces)
- final, static Keywords
- Inner Classes & Enums

</details>

<details open>
<summary><b>Advanced Concepts</b></summary>

- String Immutability & String Pool
- StringBuilder & StringBuffer
- Wrapper Classes & Autoboxing
- Object Class Methods
- Upcasting & Downcasting
- Exception Handling (try-catch-finally)
- Serialization & Deserialization

</details>

<details open>
<summary><b>Collections Framework</b></summary>

- Collection Interface & Hierarchy
- List (ArrayList, LinkedList, Vector)
- Set (HashSet, LinkedHashSet, TreeSet)
- Queue & Deque
- Map (HashMap, LinkedHashMap, TreeMap)
- Iterator & for-each loop
- Comparable & Comparator

</details>

<details open>
<summary><b>Modern Java (Java 8+)</b></summary>

- Lambda Expressions
- Functional Interfaces
- Stream API
- Optional Class
- Method References
- Default & Static Methods in Interfaces
- Sealed Classes (Java 17)
- Record Classes (Java 16)

</details>

<details open>
<summary><b>Multithreading</b></summary>

- Thread Basics & Lifecycle
- Creating Threads (Thread class & Runnable)
- Thread States (NEW, RUNNABLE, RUNNING, etc.)
- Synchronization & Thread Safety
- Race Conditions & Mutation
- sleep(), wait(), join() Methods

</details>

---

## Quick Start

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Basic understanding of programming concepts
- Any IDE (IntelliJ IDEA, Eclipse, VS Code) or text editor

### Clone the Repository
```bash
git clone https://github.com/yourusername/core-java-notes.git
cd core-java-notes
```

### Start Learning
Navigate through the notes section by section, starting from basics to advanced topics.

---

## 📚 Core Concepts

### 1. Java Basics

#### What is Java?
- **Object-oriented programming language**
- Platform-independent (Write Once, Run Anywhere)
- Strongly typed language
- Automatic memory management (Garbage Collection)

#### Program Structure
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#### Key Rules
- Program execution starts from `main()` method
- One `.java` file can have **only one public class**
- File name must match the public class name
- Case-sensitive language

**💡 Interview One-Liner:** *Java is an object-oriented, platform-independent programming language where execution starts from the main() method.*

---

### 2. Data Types & Operators

#### Primitive Data Types
| Type | Size | Example | Default Value |
|------|------|---------|---------------|
| `byte` | 1 byte | `byte b = 127;` | 0 |
| `short` | 2 bytes | `short s = 32767;` | 0 |
| `int` | 4 bytes | `int i = 100;` | 0 |
| `long` | 8 bytes | `long l = 100000L;` | 0L |
| `float` | 4 bytes | `float f = 3.14f;` | 0.0f |
| `double` | 8 bytes | `double d = 3.14159;` | 0.0d |
| `char` | 2 bytes | `char c = 'A';` | '\u0000' |
| `boolean` | 1 bit | `boolean b = true;` | false |

#### Non-Primitive Data Types
- **String** - Sequence of characters
- **Array** - Collection of similar data types
- **Class** - Blueprint for objects
- **Object** - Instance of a class

#### Operators

**Arithmetic Operators**
```java
+   // Addition
-   // Subtraction
*   // Multiplication
/   // Division
%   // Modulus (remainder)
++  // Increment
--  // Decrement
```

**Assignment Operators**
```java
=   // Assign
+=  // Add and assign
-=  // Subtract and assign
*=  // Multiply and assign
/=  // Divide and assign
```

**💡 Interview One-Liner:** *Java has 8 primitive data types and supports arithmetic, relational, logical, and assignment operators.*

---

### 3. Control Flow

#### if-else Statement
```java
if (condition) {
    // code if condition is true
} else {
    // code if condition is false
}
```

#### switch Statement
```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // default code
}
```

**When to use:**
- Use `if-else` for complex conditions
- Use `switch` when checking a variable against fixed values
- `break` stops execution of next case

#### Loops

**for loop** - When iterations are known
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

**while loop** - When end condition is unknown
```java
while (condition) {
    // code
}
```

**do-while loop** - Runs at least once
```java
do {
    // code
} while (condition);
```

**for-each loop** - For traversing arrays/collections
```java
for (int num : array) {
    System.out.println(num);
}
```

**💡 Interview One-Liner:** *Java supports if-else, switch for decision-making and for, while, do-while loops for iteration.*

---

### 4. Arrays & Strings

#### Arrays

**What is an Array?**
- Used to store multiple values of the **same data type**
- **Fixed size** (cannot be changed)
- Index starts from **0**

**Types of Arrays:**

**1D Array**
```java
int[] arr = new int[5];
int[] numbers = {1, 2, 3, 4, 5};
```

**2D Array**
```java
int[][] matrix = new int[3][3];
int[][] grid = {{1, 2}, {3, 4}, {5, 6}};
```

**Jagged Array** - Rows with different sizes
```java
int[][] jagged = new int[3][];
jagged[0] = new int[2];
jagged[1] = new int[4];
jagged[2] = new int[3];
```

**Object Array**
```java
Student[] students = new Student[5];
students[0] = new Student("Alice", 85);
```

**💡 Interview One-Liner:** *Arrays store multiple values of the same type with fixed size, and index starts from 0.*

---

#### Strings

**What is String?**
- String is a **class**, not primitive
- Used to store text
- Located in `java.lang` package
- **Immutable** (cannot be changed)

**String Immutability**
```java
String s1 = "Hello";
s1 = s1 + " World";  // Creates new object
```
- Any modification creates a **new object**
- Original object remains unchanged

**String Creation**

**String Literal** (Stored in String Constant Pool)
```java
String s1 = "Hello";
String s2 = "Hello";  // Points to same object
```

**new String()** (Stored in Heap)
```java
String s3 = new String("Hello");  // New object in heap
```

**String Comparison**
```java
// == compares reference (memory address)
s1 == s2;  // true (same reference in SCP)

// equals() compares value (content)
s1.equals(s3);  // true (same content)
```

**String Constant Pool (SCP)**
- Special memory area inside heap
- Stores only **one copy** of same string value
- Improves memory efficiency

**💡 Interview One-Liner:** *String is immutable, stored in String Constant Pool for memory efficiency, and compared using equals() for content.*

---

#### Mutable Strings

| Feature | StringBuffer | StringBuilder |
|---------|-------------|---------------|
| **Mutability** | Mutable | Mutable |
| **Thread Safety** | Thread-safe (Synchronized) | Not thread-safe |
| **Performance** | Slower | Faster |
| **Use Case** | Multi-threaded environment | Single-threaded environment |

**Capacity Rule**
```
Default capacity = 16
New capacity = (old capacity * 2) + 2
```

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");  // Modifies same object
System.out.println(sb);  // "Hello World"
```

**💡 Interview One-Liner:** *StringBuffer is thread-safe but slower, while StringBuilder is faster but not thread-safe.*

---

### 5. OOP Concepts

#### Object-Oriented Programming

**Core Principles:**
- **Encapsulation** - Data hiding
- **Inheritance** - Code reuse
- **Polymorphism** - Many forms
- **Abstraction** - Hiding complexity

**Object & Class**
```java
// Class - Blueprint
class Student {
    String name;  // Property
    int marks;
    
    void study() {  // Behavior
        System.out.println("Studying...");
    }
}

// Object - Instance
Student s1 = new Student();
s1.name = "Alice";
s1.study();
```

**💡 Interview One-Liner:** *OOP treats everything as objects with properties and behaviors, following principles of encapsulation, inheritance, polymorphism, and abstraction.*

---

#### Encapsulation

**What is Encapsulation?**
- Wrapping data and methods together
- Data hiding using access modifiers

**Implementation:**
```java
class Student {
    private String name;  // Private variable
    private int marks;
    
    // Public getter
    public String getName() {
        return name;
    }
    
    // Public setter
    public void setName(String name) {
        this.name = name;
    }
}
```

**Benefits:**
- Data security
- Controlled access
- Flexibility to change implementation

**💡 Interview One-Liner:** *Encapsulation is data hiding achieved through private variables and public getters/setters.*

---

#### Constructors

**What is Constructor?**
- Special method to initialize objects
- Same name as class
- No return type
- Called automatically when object is created

**Types:**

**Default Constructor**
```java
class Student {
    Student() {
        System.out.println("Object created");
    }
}
```

**Parameterized Constructor**
```java
class Student {
    String name;
    int marks;
    
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
```

**Important Rules:**
- Constructor cannot be `static`
- Constructor cannot be inherited
- Constructor runs once per object

**💡 Interview One-Liner:** *Constructor is a special method with no return type that initializes object when created.*

---

#### this Keyword

**What is this?**
- Refers to **current object**
- Used to differentiate between instance and local variables

**Usage:**
```java
class Student {
    String name;
    
    Student(String name) {
        this.name = name;  // this.name is instance variable
    }
    
    void display() {
        System.out.println(this.name);
    }
    
    Student getStudent() {
        return this;  // Returns current object
    }
}
```

**💡 Interview One-Liner:** *this keyword refers to the current object and is used to access instance variables and methods.*

---

#### Inheritance

**What is Inheritance?**
- Acquiring properties and methods of another class
- Represents **IS-A** relationship
- Uses `extends` keyword

**Types:**

**Single-level Inheritance**
```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
```

**Multi-level Inheritance**
```java
class A {
    void methodA() { }
}

class B extends A {
    void methodB() { }
}

class C extends B {
    void methodC() { }
}
// C → B → A (Chain of inheritance)
```

**Important:**
- Java does **NOT** support multiple inheritance using classes
- Multiple inheritance is supported using **interfaces**

**💡 Interview One-Liner:** *Inheritance is acquiring properties of parent class for code reuse; Java doesn't support multiple inheritance with classes to avoid diamond problem.*

---

#### super Keyword

**What is super?**
- Refers to **parent class object**
- Used to access parent class members

**Usage:**
```java
class Parent {
    int x = 10;
    
    Parent() {
        System.out.println("Parent constructor");
    }
    
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    int x = 20;
    
    Child() {
        super();  // Calls parent constructor
    }
    
    void show() {
        System.out.println(super.x);  // Access parent variable
        super.display();  // Call parent method
    }
}
```

**💡 Interview One-Liner:** *super keyword refers to parent class object and is used to access parent variables, methods, and constructors.*

---

### 6. Advanced OOP

#### Method Overloading

**What is Method Overloading?**
- Same method name
- Different parameter list
- Happens in **same class**
- **Compile-time polymorphism**

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}
```

**Rules:**
- Method name must be same
- Parameters must be different (number or type)
- Return type can be different

**💡 Interview One-Liner:** *Method overloading is defining multiple methods with same name but different parameters in the same class.*

---

#### Method Overriding

**What is Method Overriding?**
- Child class provides its own implementation of parent method
- Method name and parameters must be same
- Happens between **parent and child class**
- **Runtime polymorphism**

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

**Rules:**
- Method signature must be same
- Return type must be same or covariant
- Access level cannot be reduced
- Method must not be `static` or `final`

**💡 Interview One-Liner:** *Method overriding is when child class provides specific implementation of parent class method.*

---

#### Polymorphism

**What is Polymorphism?**
- **Poly** = Many
- **Morphism** = Forms
- One method shows different behavior

**Types:**

**1. Compile-time Polymorphism** (Static)
- Method Overloading
- Resolved at compile time

**2. Runtime Polymorphism** (Dynamic)
- Method Overriding
- Resolved at runtime

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

// Runtime Polymorphism
Animal a;
a = new Dog();
a.sound();  // Bark

a = new Cat();
a.sound();  // Meow
```

**Dynamic Method Dispatch:**
- JVM decides which method to call at runtime
- Based on object type, not reference type

**💡 Interview One-Liner:** *Polymorphism allows one method to perform different actions based on object type, achieved through overloading and overriding.*

---

#### final Keyword

**What is final?**
- Used to restrict modification
- Applied to variables, methods, and classes

**final Variable** - Constant
```java
final double PI = 3.14159;
// PI = 3.14; ❌ Cannot modify
```

**final Method** - Cannot be overridden
```java
class Parent {
    final void display() {
        System.out.println("Cannot override");
    }
}
```

**final Class** - Cannot be inherited
```java
final class MyClass {
    // Cannot be extended
}
```

**Benefits:**
- Security
- Prevents unwanted modification
- Improves performance

**💡 Interview One-Liner:** *final keyword restricts modification: final variable is constant, final method cannot be overridden, final class cannot be inherited.*

---

#### static Keyword

**What is static?**
- Belongs to **class**, not object
- Shared by all objects
- Memory allocated once

**Static Variable**
```java
class Student {
    static String school = "ABC School";  // Shared
    String name;  // Individual
}
```

**Static Method**
```java
class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}

// Call without object
Calculator.add(5, 3);
```

**Static Block**
```java
class Demo {
    static {
        System.out.println("Static block executed once");
    }
}
```

**Why main() is static?**
- JVM can call it without creating object
- Entry point of program

**Rules:**
- Static method cannot access non-static variables directly
- Static method cannot use `this` or `super`

**💡 Interview One-Liner:** *static members belong to class, shared by all objects, and can be accessed without creating object.*

---

#### Abstraction

**What is Abstraction?**
- Hiding implementation details
- Showing only essential features

**Achieved through:**
1. Abstract Classes
2. Interfaces

**Abstract Class**
```java
abstract class Animal {
    abstract void sound();  // No implementation
    
    void sleep() {  // Concrete method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
```

**Rules:**
- Cannot create object of abstract class
- Can have abstract and concrete methods
- Abstract method must be in abstract class
- Child must implement all abstract methods

**💡 Interview One-Liner:** *Abstraction hides implementation details using abstract classes and interfaces.*

---

#### Interface

**What is Interface?**
- Blueprint of class
- Contains abstract methods (before Java 8)
- 100% abstraction

```java
interface Animal {
    void sound();  // public abstract by default
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
```

**Types of Interfaces:**

**1. Normal Interface** - Multiple abstract methods
```java
interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
}
```

**2. Functional Interface** - Only ONE abstract method
```java
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
```

**3. Marker Interface** - No methods (metadata)
```java
interface Serializable {
    // Empty
}
```

**Why Multiple Inheritance with Interface?**
- Interfaces have no implementation
- No ambiguity
- Solves diamond problem

```java
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
```

**💡 Interview One-Liner:** *Interface is a blueprint containing abstract methods; Java supports multiple inheritance using interfaces.*

---

#### Upcasting & Downcasting

**Upcasting**
- Converting child object to parent reference
- Happens **automatically**
- Safe casting

```java
class Animal { }
class Dog extends Animal { }

Animal a = new Dog();  // Upcasting (implicit)
```

**Access:**
- Only parent class methods accessible
- Used for runtime polymorphism

**Downcasting**
- Converting parent reference to child reference
- Must be done **explicitly**
- Not always safe

```java
Animal a = new Dog();
Dog d = (Dog) a;  // Downcasting (explicit)
```

**When Safe?**
- When parent reference actually points to child object
- Otherwise `ClassCastException`

**💡 Interview One-Liner:** *Upcasting is implicit conversion of child to parent reference, downcasting is explicit conversion requiring type casting.*

---

#### Object Class

**What is Object Class?**
- Root class of all classes
- Every class extends `Object` implicitly
- Located in `java.lang` package

**Important Methods:**

**toString()**
- Converts object to string
- Default: `ClassName@HashCode`
- Should be overridden

```java
class Student {
    String name;
    
    @Override
    public String toString() {
        return "Student: " + name;
    }
}
```

**equals()**
- Compares two objects
- Default: compares reference
- Should be overridden to compare content

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj instanceof Student) {
        Student s = (Student) obj;
        return this.name.equals(s.name);
    }
    return false;
}
```

**hashCode()**
- Returns integer hash value
- Used in HashMap, HashSet
- Must override when equals() is overridden

**💡 Interview One-Liner:** *Object class is the superclass of all Java classes containing methods like toString(), equals(), and hashCode().*

---

### 7. Exception Handling

#### What is Exception?

**Exception:**
- Unwanted event during program execution
- Disrupts normal flow

**Error vs Exception:**
- **Error** - Serious problem (OutOfMemoryError)
- **Exception** - Recoverable problem

**Types of Errors:**

**1. Compile-Time Error**
- Syntax mistakes
- Detected by compiler
```java
System.out.Println("Hi");  // ❌ Println (capital P)
```

**2. Run-Time Error (Exception)**
- Occurs while running
- Detected by JVM
```java
int result = 5 / 0;  // ArithmeticException
```

**3. Logical Error**
- Wrong output
- Not detected
```java
int sum = a - b;  // Should be a + b
```

---

#### Exception Handling

**try-catch-finally**
```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Always executes");
}
```

**finally Block:**
- Executes always
- Used to close resources
- Prevents memory leaks

**Use Cases:**
- Close file connections
- Close database connections
- Release network resources

**When finally doesn't execute:**
- JVM crash
- System.exit()

**💡 Interview One-Liner:** *Exception is a runtime problem handled using try-catch-finally blocks to prevent program crashes.*

---

### 8. Collections Framework

#### Collection API

**What is Collection?**
- Framework to store and manipulate objects
- Located in `java.util` package
- Works only with objects (not primitives)

**Benefits:**
- Dynamic size
- Ready-made methods
- Improved performance

**Collection Hierarchy:**
```
Collection (Interface)
├── List
│   ├── ArrayList
│   ├── LinkedList
│   └── Vector
├── Set
│   ├── HashSet
│   ├── LinkedHashSet
│   └── TreeSet
└── Queue
    ├── PriorityQueue
    └── ArrayDeque

Map (Not part of Collection)
├── HashMap
├── LinkedHashMap
├── TreeMap
└── Hashtable
```

**💡 Interview One-Liner:** *Collection API is a framework providing classes and interfaces to store and manipulate groups of objects.*

---

#### List Interface

**Properties:**
- Allows duplicate values
- Maintains insertion order
- Index-based access

**ArrayList**
```java
List<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
list.add(1, "C++");  // Insert at index
list.get(0);         // Access by index
list.set(0, "JavaScript");  // Update
list.remove(1);      // Remove by index
list.size();         // Size
```

**When to use:**
- Frequent read operations
- Random access needed
- Not thread-safe

**💡 Interview One-Liner:** *ArrayList is a dynamic array that allows duplicates, maintains order, and provides fast random access.*

---

#### Set Interface

**Properties:**
- No duplicate values
- No index-based access
- Stores unique elements

**HashSet**
```java
Set<String> set = new HashSet<>();
set.add("Java");
set.add("Python");
set.add("Java");  // Ignored (duplicate)
set.contains("Java");  // true
set.remove("Python");
set.size();
```

**When to use:**
- Unique elements needed
- Order not important
- Fast performance

**TreeSet** - Sorted order
```java
Set<Integer> treeSet = new TreeSet<>();
treeSet.add(30);
treeSet.add(10);
treeSet.add(20);
// Output: [10, 20, 30] (sorted)
```

**💡 Interview One-Liner:** *Set stores only unique elements; HashSet is fast but unordered, TreeSet maintains sorted order.*

---

#### Map Interface

**What is Map?**
- Stores key-value pairs
- Keys are unique
- Values can be duplicate

**HashMap**
```java
Map<String, Integer> map = new HashMap<>();
map.put("Alice", 85);
map.put("Bob", 90);
map.put("Alice", 95);  // Updates value
map.get("Alice");      // 95
map.containsKey("Bob");
map.containsValue(90);
map.remove("Bob");
map.keySet();          // All keys
map.values();          // All values
```

**Real-Life Examples:**
- Username → Password
- EmployeeID → EmployeeData
- StudentID → Marks

**Types:**
- **HashMap** - No order, allows one null key
- **LinkedHashMap** - Insertion order
- **TreeMap** - Sorted by keys
- **Hashtable** - Thread-safe (legacy)

**💡 Interview One-Liner:** *Map stores key-value pairs where keys are unique; HashMap is fast but unordered.*

---

#### Iterator

**What is Iterator?**
- Used to traverse collections
- Forward direction only
- Safe removal during traversal

```java
List<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");

Iterator<String> it = list.iterator();
while (it.hasNext()) {
    String element = it.next();
    System.out.println(element);
}
```

**Methods:**
- `hasNext()` - Checks if next element exists
- `next()` - Returns next element
- `remove()` - Removes current element

**💡 Interview One-Liner:** *Iterator is used to traverse collections in forward direction with safe removal capability.*

---

#### Comparable vs Comparator

**Comparable Interface**
- Natural ordering
- Sorting logic inside class
- `compareTo()` method
- Only one sorting sequence

```java
class Student implements Comparable<Student> {
    int marks;
    
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}

Collections.sort(students);
```

**Comparator Interface**
- Custom ordering
- Sorting logic outside class
- `compare()` method
- Multiple sorting sequences

```java
Comparator<Student> byName = (s1, s2) -> s1.name.compareTo(s2.name);
Comparator<Student> byMarks = (s1, s2) -> s1.marks - s2.marks;

Collections.sort(students, byMarks);
```

**💡 Interview One-Liner:** *Comparable is for natural ordering inside class using compareTo(), Comparator is for custom ordering outside class using compare().*

---

### 9. Java 8+ Features

#### Lambda Expressions

**What is Lambda?**
- Short form of anonymous function
- Introduced in Java 8
- Works with functional interfaces

**Syntax:**
```java
(parameters) -> expression
(parameters) -> { statements; }
```

**Examples:**
```java
// No parameters
() -> System.out.println("Hello")

// One parameter
x -> x * x

// Multiple parameters
(a, b) -> a + b

// With block
(a, b) -> {
    int sum = a + b;
    return sum;
}
```

**Benefits:**
- Reduces boilerplate code
- Improves readability
- Enables functional programming

**💡 Interview One-Liner:** *Lambda expression is a concise way to implement functional interfaces introduced in Java 8.*

---

#### Functional Interface

**What is Functional Interface?**
- Interface with exactly **one abstract method**
- Also called SAM (Single Abstract Method)
- Used with lambda expressions

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

// Lambda implementation
Calculator add = (a, b) -> a + b;
Calculator multiply = (a, b) -> a * b;

System.out.println(add.calculate(5, 3));  // 8
```

**Built-in Functional Interfaces:**
- `Predicate<T>` - boolean test(T t)
- `Function<T, R>` - R apply(T t)
- `Consumer<T>` - void accept(T t)
- `Supplier<T>` - T get()

**💡 Interview One-Liner:** *Functional interface contains exactly one abstract method and enables lambda expressions.*

---

#### Stream API

**What is Stream?**
- Process collections in functional style
- Introduced in Java 8
- Does NOT store data

**Stream Pipeline:**
```
Collection → Stream → Operations → Result
```

**Common Operations:**

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// filter - Select elements
numbers.stream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);  // 2, 4, 6, 8, 10

// map - Transform elements
numbers.stream()
       .map(n -> n * n)
       .forEach(System.out::println);  // 1, 4, 9, 16, 25...

// sorted - Sort elements
numbers.stream()
       .sorted((a, b) -> b - a)
       .forEach(System.out::println);  // 10, 9, 8...

// reduce - Combine elements
int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);  // 55
```

**Characteristics:**
- Lazy evaluation
- One-time use
- Does not modify original data

**💡 Interview One-Liner:** *Stream API processes collections in a functional and declarative way using operations like filter, map, and reduce.*

---

#### Serialization & Deserialization

**Serialization:**
- Converting object into byte stream
- Used to save object state

**Deserialization:**
- Converting byte stream back to object
- Used to restore object state

**Why Needed?**
- Store object in file
- Send object over network
- Used in distributed systems

**Serializable Interface:**
- Marker interface (no methods)
- Tells JVM class can be serialized

```java
class Student implements Serializable {
    String name;
    int marks;
}
```

**Real-Life Examples:**
- Saving user session
- Saving game progress
- Transferring data between servers

**💡 Interview One-Liner:** *Serialization converts object to byte stream for storage or transmission; uses Serializable marker interface.*

---

### 10. Multithreading

#### Thread Basics

**What is Thread?**
- Lightweight process
- Used for multitasking
- Enables parallel execution

**Why Thread?**
- Improve performance
- Utilize CPU cores
- Run tasks simultaneously

**Thread Flow:**
```
Hardware → OS → JVM → Thread Scheduler → CPU
```

---

#### Creating Threads

**Method 1: Extending Thread class**
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

MyThread t = new MyThread();
t.start();  // Starts new thread
```

**Method 2: Implementing Runnable** (Recommended)
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }
}

Thread t = new Thread(new MyRunnable());
t.start();
```

**Method 3: Lambda (Java 8+)**
```java
Thread t = new Thread(() -> {
    System.out.println("Thread running");
});
t.start();
```

**start() vs run():**
- `start()` - Creates new thread
- `run()` - Contains thread logic
- Never call `run()` directly

**💡 Interview One-Liner:** *Thread is a lightweight sub-process; created by extending Thread class or implementing Runnable interface.*

---

#### Thread Lifecycle

**Thread States:**

1. **NEW** - Thread created but not started
2. **RUNNABLE** - start() called, ready to run
3. **RUNNING** - Thread executing
4. **TIMED_WAITING** - Paused for fixed time (sleep, wait)
5. **WAITING** - Waiting for notification
6. **TERMINATED** - Execution completed

**Lifecycle Flow:**
```
NEW → start() → RUNNABLE → scheduler → RUNNING
                                          ↓
                                     sleep/wait
                                          ↓
                              WAITING/TIMED_WAITING
                                          ↓
                                    notify/timeout
                                          ↓
                                      RUNNABLE
                                          ↓
                                   execution complete
                                          ↓
                                     TERMINATED
```

---

#### Thread Methods

**sleep()**
- Pauses current thread
- Time in milliseconds
```java
Thread.sleep(1000);  // 1 second
```

**join()**
- Wait for another thread to finish
```java
Thread t = new Thread(() -> {
    System.out.println("Task");
});
t.start();
t.join();  // Main waits for t to finish
```

**wait() & notify()**
- Inter-thread communication
- Used with synchronized block
```java
synchronized(obj) {
    obj.wait();    // Release lock and wait
    obj.notify();  // Wake up waiting thread
}
```

**💡 Interview One-Liner:** *Thread lifecycle has states: NEW, RUNNABLE, RUNNING, WAITING, TIMED_WAITING, and TERMINATED.*

---

#### Thread Safety & Synchronization

**Race Condition:**
- Multiple threads modify shared data
- Leads to inconsistent results

**Synchronization:**
- Makes code thread-safe
- Only one thread accesses critical section

```java
class Counter {
    private int count = 0;
    
    public synchronized void increment() {
        count++;  // Thread-safe
    }
}
```

**synchronized Keyword:**
- Method level
- Block level
- Ensures mutual exclusion

**When to Use:**
- Shared mutable data
- Critical section
- Multiple threads accessing same resource

**💡 Interview One-Liner:** *Synchronization prevents race conditions by allowing only one thread to access critical section at a time.*

---

### 11. Modern Java Features

#### Wrapper Classes

**What are Wrapper Classes?**
- Convert primitive types to objects
- Located in `java.lang` package

**Mapping:**
| Primitive | Wrapper |
|-----------|---------|
| int | Integer |
| double | Double |
| char | Character |
| boolean | Boolean |

**Autoboxing** - Automatic primitive to object
```java
int num = 10;
Integer obj = num;  // Autoboxing
```

**Unboxing** - Automatic object to primitive
```java
Integer obj = 20;
int num = obj;  // Unboxing
```

**Parsing** - String to primitive
```java
int num = Integer.parseInt("123");
double d = Double.parseDouble("3.14");
```

**💡 Interview One-Liner:** *Wrapper classes convert primitives to objects; autoboxing and unboxing happen automatically.*

---

#### Enum

**What is Enum?**
- Special type for constants
- Fixed set of values
- Type-safe

```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

Day today = Day.MONDAY;

// In switch
switch(today) {
    case MONDAY:
        System.out.println("Start of week");
        break;
}
```

**Benefits:**
- Prevents invalid values
- Improves readability
- Type-safe

**Properties:**
- Implicitly `final`
- Extends `java.lang.Enum`
- Cannot create object with `new`

**💡 Interview One-Liner:** *Enum represents a fixed set of constants in a type-safe manner.*

---

#### Inner Classes

**What is Inner Class?**
- Class defined inside another class
- Can access outer class members

```java
class Outer {
    private int x = 10;
    
    class Inner {
        void display() {
            System.out.println(x);  // Access outer class
        }
    }
}

// Create object
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
inner.display();
```

**Why Inner Class?**
- Logical grouping
- Better encapsulation
- Tight coupling

**💡 Interview One-Liner:** *Inner class is defined inside another class and can access outer class members including private.*

---

#### Sealed Classes (Java 17)

**What are Sealed Classes?**
- Restrict which classes can extend/implement
- Controlled inheritance

```java
sealed class Shape permits Circle, Rectangle, Triangle {
}

final class Circle extends Shape { }
sealed class Rectangle extends Shape permits Square { }
non-sealed class Triangle extends Shape { }
```

**Rules:**
Child must be:
- `final` - Cannot be extended
- `sealed` - Restricts its subclasses
- `non-sealed` - Can be extended freely

**Benefits:**
- Controlled hierarchy
- Better security
- Pattern matching support

**💡 Interview One-Liner:** *Sealed classes restrict which classes can extend or implement them, providing controlled inheritance.*

---

#### Record Classes (Java 16)

**What is Record?**
- Data carrier class
- Reduces boilerplate code
- Immutable by default

```java
record Student(String name, int marks) { }

// Automatically provides:
// - Constructor
// - Getters: name(), marks()
// - equals(), hashCode(), toString()

Student s = new Student("Alice", 85);
System.out.println(s.name());  // Alice
```

**Properties:**
- All fields are `private final`
- Immutable
- Cannot extend other classes
- Can implement interfaces

**Use Cases:**
- DTO (Data Transfer Object)
- API request/response
- Simple data holders

**💡 Interview One-Liner:** *Record class creates immutable data carrier classes with automatic constructor, getters, equals, hashCode, and toString.*

---

## 🎯 Interview One-Liners

### Quick Revision

| **Topic** | **One-Liner Answer** |
|-----------|---------------------|
| **Java** | Object-oriented, platform-independent language where execution starts from main() |
| **String** | Immutable class stored in String Constant Pool for memory efficiency |
| **Encapsulation** | Data hiding achieved through private variables and public getters/setters |
| **Inheritance** | Acquiring properties of parent class for code reuse |
| **Polymorphism** | One method performing different actions based on object type |
| **Abstract Class** | Blueprint with abstract methods that must be implemented by child classes |
| **Interface** | Blueprint containing abstract methods; supports multiple inheritance |
| **Constructor** | Special method with no return type that initializes objects |
| **this** | Refers to current object |
| **super** | Refers to parent class object |
| **final** | Restricts modification: variable becomes constant, method cannot be overridden, class cannot be inherited |
| **static** | Belongs to class, shared by all objects, accessed without object creation |
| **Exception** | Runtime problem handled using try-catch-finally to prevent crashes |
| **Collection** | Framework for storing and manipulating groups of objects |
| **ArrayList** | Dynamic array allowing duplicates with fast random access |
| **Set** | Stores only unique elements |
| **Map** | Stores key-value pairs with unique keys |
| **Lambda** | Concise way to implement functional interfaces |
| **Stream API** | Processes collections in functional and declarative way |
| **Thread** | Lightweight sub-process for multitasking |
| **Synchronization** | Prevents race conditions by allowing one thread in critical section |
| **Wrapper Classes** | Convert primitives to objects with autoboxing/unboxing |
| **Enum** | Represents fixed set of constants in type-safe manner |
| **Sealed Class** | Restricts which classes can extend or implement |
| **Record** | Creates immutable data carrier with less boilerplate |

---

## 💡 How to Use

### For Beginners
1. Start with **Java Basics** section
2. Follow the sequence from basics to advanced
3. Practice code examples in your IDE
4. Try to explain concepts in your own words

### For Interview Preparation
1. Read topic-wise notes
2. Memorize **Interview One-Liners**
3. Practice coding questions
4. Review **Real-Life Examples**

### Best Practices
- Write code for each concept
- Create your own examples
- Teach concepts to others
- Solve coding challenges
- Review regularly

---

## 📌 Memory Management

### Memory Areas

| **Area** | **Stores** | **Scope** |
|----------|-----------|----------|
| **Heap** | Objects, instance variables | Until garbage collected |
| **Stack** | Local variables, references | Method lifetime |
| **Method Area** | Static variables, class metadata | Program lifetime |
| **String Pool** | String literals | Program lifetime |

---

## 🔑 Important Rules

### Class Rules
- One public class per `.java` file
- File name must match public class name
- Class names start with uppercase

### Constructor Rules
- Cannot be `static`
- Cannot be inherited
- No return type
- Runs once per object

### Inheritance Rules
- Child can access parent methods
- Parent cannot access child-specific methods
- Multiple inheritance not supported with classes
- Use `extends` for classes, `implements` for interfaces

### String Rules
- Use `equals()` for content comparison
- `==` compares reference
- Strings are immutable
- String pool improves efficiency

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/improvement`)
3. **Commit** your changes (`git commit -m 'Add improvement'`)
4. **Push** to branch (`git push origin feature/improvement`)
5. **Open** a Pull Request

### What to Contribute
- Fix typos or errors
- Add more examples
- Improve explanations
- Add new topics
- Create practice questions

---

## 📧 Contact

For questions, suggestions, or feedback:

- **GitHub Issues**: [Create an issue](https://github.com/yourusername/core-java-notes/issues)
- **Email**: your.email@example.com
- **LinkedIn**: [Your Profile](https://linkedin.com/in/yourprofile)

---

## ⭐ Show Your Support

If you found this helpful:
- ⭐ **Star** this repository
- 🍴 **Fork** for your reference
- 📢 **Share** with others
- 💬 **Provide feedback**

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Acknowledgments

- Java Documentation
- Community contributions
- Interview experiences
- Open-source resources

---

<div align="center">

**Made with ❤️ for Java Learners**

[![GitHub followers](https://img.shields.io/github/followers/yourusername?style=social)](https://github.com/yourusername)
[![GitHub stars](https://img.shields.io/github/stars/yourusername/core-java-notes?style=social)](https://github.com/yourusername/core-java-notes)

**Happy Learning! 🚀**

</div>