class Student {

    int rollNo;
    String name;
    double marks;
}

public class ObjectArray {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 64;
        s1.name = "Dnyaneshwar";
        s1.marks = 78.51;

        Student s2 = new Student();
        s2.rollNo = 65;
        s2.name = "Panchal";
        s2.marks = 68.54;

        // Array of Student objects
        Student[] students = { s1, s2 };

        // Enhanced for-each loop
        for (Student s : students) {
            System.out.println(
                "Name: " + s.name +
                " | Roll No: " + s.rollNo +
                " | Marks: " + s.marks
            );
        }
    }
}

/*
    Object Array:
- An array that stores objects instead of primitive values.
- Each element of the array holds a reference to an object.

Example:
Student[] students = new Student[2];

for-each loop:
- Used to traverse arrays easily.
- No index handling required.
- Syntax:
  for (Type variable : array)

Use Case:
- Best for storing and processing multiple objects.
- Example: students, employees, products.

*/