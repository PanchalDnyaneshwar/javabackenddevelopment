import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        // Set interface reference
        Set<Integer> set = new HashSet<>();

        set.add(4);
        set.add(10);
        set.add(4);   // duplicate - ignored

        System.out.println("Class: " + set.getClass());
        System.out.println("Size: " + set.size());

        // Iterating Set
        for (int n : set) {
            System.out.println(n);
        }
    }
}

/*
    Set in Java:

- Set is an interface.
- Does NOT allow duplicate elements.
- Stores only unique values.

Important Properties of Set:

- No duplicate values allowed.
- No index-based access.
- Order is not guaranteed (HashSet).

HashSet:

- Implements Set interface.
- Uses hashing technique.
- Fast performance.
- Does NOT maintain insertion order.

Set vs List (Interview):

- List → allows duplicates, maintains order
- Set → no duplicates, order not guaranteed

Types of Set:

- HashSet → fastest, no order
- LinkedHashSet → maintains insertion order
- TreeSet → sorted order

Use Cases of Set:

- Unique IDs
- Email addresses
- Roll numbers

Important Interview Points:

- Set does not allow duplicates.
- HashSet allows only one null value.
- TreeSet does not allow null.

One-Line Interview Answer:

- Set is a collection that stores only unique elements.

*/