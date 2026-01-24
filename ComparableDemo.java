import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {

    int age;
    double marks;

    public Student(int age, double marks) {
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", marks=" + marks + "]";
    }

    // Natural ordering (by age)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        // Custom sorting (by marks)
        Comparator<Student> marksComparator =
                (s1, s2) -> Double.compare(s1.marks, s2.marks);

        List<Student> students = new ArrayList<>();

        students.add(new Student(18, 78.51));
        students.add(new Student(20, 77.91));
        students.add(new Student(24, 65.51));
        students.add(new Student(22, 99.51));

        // Natural sorting (age)
        // Collections.sort(students);

        // Custom sorting (marks)
        Collections.sort(students, marksComparator);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}


/*

    Comparable in Java:

- Comparable is an interface.
- Used for natural sorting.
- Sorting logic is inside the class.
- Class compares itself.

Comparable Method:

compareTo(Object o)

- returns positive → greater
- returns negative → smaller
- returns zero → equal

Comparator in Java:

- Comparator is an interface.
- Used for custom sorting.
- Sorting logic is outside the class.
- Also called third-party sorting.

Key Difference (Very Important):

Comparable:
- compareTo()
- Inside the class
- Only one sorting logic

Comparator:
- compare()
- Outside the class
- Multiple sorting logic possible

When to Use Comparable?

- When class has a natural order.
- Example: age, roll number, id

When to Use Comparator?

- When multiple sorting logic is needed.
- Example: marks, name, salary

Interview One-Line Answer:

- Comparable is used when a class compares itself,
  Comparator is used when comparison logic is external.
- Comparator is functional interface.
- Comparator supports Lambda.
- Collections.sort() supports both.

*/