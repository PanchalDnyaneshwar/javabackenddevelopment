public class StringDemo {

    public static void main(String[] args) {

        // String created using new keyword (Heap memory)
        String course = new String("Java Fullstack");

        // String literals (String Constant Pool)
        String name = "Dnyaneshwar";
        String pen = "Dnyaneshwar";

        System.out.println(name);

        // String is immutable → new object is created
        name = name + " Panchal";
        System.out.println(name);

        // Content comparison
        System.out.println(name.equals(pen));

        // String methods
        System.out.println(course.charAt(6));
        System.out.println(course.equals("Java Fullstack"));
        System.out.println("Start " + course.concat(name));

        // Original string remains unchanged
        System.out.println(course);
    }
}


/*
    String in Java:
- String is a class in Java.
- Used to store text or characters.
- Not a primitive data type.

String Immutability:
- String value cannot be changed.
- Any modification creates a new String object.

Example:
String name = "Java";
name = name + " Developer";

Ways to Create String:
- Using string literal.
- Using new keyword.

Example:
String s1 = "Java";              // String literal
String s2 = new String("Java");  // new keyword

String Constant Pool (SCP):
- Special memory area inside heap.
- Stores only one copy of same string value.
- Helps save memory.

String Comparison:
- == compares reference (address).
- equals() compares value (content).
- Always use equals() for strings.

Common String Methods:
- charAt(index) → get character
- equals() → compare strings
- concat() → join strings
- length() → get string length

Memory Concept:
- String objects → Heap memory
- String literals → String Constant Pool
- Reference variables → Stack memory

Use Case:
- Used for names, messages, passwords, and user input.

*/