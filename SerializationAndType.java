import java.io.*;

// Functional Interface
@FunctionalInterface
interface A {
    void show();
}

// Serializable class
class Student implements Serializable {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationAndType {

    public static void main(String[] args) throws Exception {

        // Lambda expression (Functional Interface)
        A obj = () -> System.out.println("Showing using Lambda");
        obj.show();

        // Serialization
        Student s1 = new Student(1, "Dnyaneshwar");

        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();

        // Deserialization
        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s2 = (Student) ois.readObject();
        ois.close();

        System.out.println(s2.id + " " + s2.name);
    }
}

/*
    Serialization in Java:

- Serialization means converting object into byte stream.
- Used to save object state into file or send over network.

Deserialization in Java:

- Deserialization means converting byte stream back into object.
- Used to restore object state.

Why Serialization is used?

- To store object in file.
- To send object over network.
- Used in distributed systems.

Real Life Example:

- Saving user session.
- Saving game state.
- Transferring object between server and client.

Serializable Interface:

- Marker interface.
- No methods.
- Used to tell JVM class is serializable.

Example:
class Student implements Serializable

Interface in Java:

- Interface is a blueprint of class.
- Contains abstract methods.
- Used to achieve abstraction.

Types of Interfaces:

1) Normal Interface:
- More than one abstract method.

2) Functional Interface:
- Only one abstract method.
- Also called SAM (Single Abstract Method).
- Used in Lambda expressions.

Example:
@FunctionalInterface
interface A {
    void show();
}

3) Marker Interface:

- Interface with no methods.
- Used to mark a class.
- Example: Serializable, Cloneable

Why Functional Interface?

- Enables Lambda expressions.
- Reduces boilerplate code.
- Improves readability.

Important Interview Points:

- Serialization converts object to byte stream.
- Deserialization restores object.
- Serializable is marker interface.
- Functional interface has only one abstract method.
- Lambda works only with functional interface.

One-Line Interview Answers:

- Serialization is the process of converting object into byte stream.
- Functional interface contains exactly one abstract method.
- Marker interface provides metadata to JVM.

*/