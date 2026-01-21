import java.util.ArrayList;
import java.util.Collection;

public class CollectionJava {

    public static void main(String[] args) {

        // Collection interface reference
        Collection<Integer> c = new ArrayList<>();

        c.add(12);
        c.add(14);
        c.add(20);

        // for-each loop to iterate collection
        for (int n : c) {
            System.out.println(n);
        }
    }
}

/*
    Collection API in Java:

- Collection API is a framework.
- Used to store and manipulate group of objects.
- Located in java.util package.

Why Collection API?

- Dynamic size (no fixed size like array).
- Provides ready-made methods.
- Improves performance and code readability.

Collection Interface:

- Root interface of Collection framework.
- Represents group of objects.
- Does NOT store primitives (only objects).

Example:
Collection<Integer> c;

Common Methods of Collection Interface:

- add()
- remove()
- size()
- contains()
- clear()

Collection vs Collections:

Collection (Interface):
- Interface
- Used to store objects
- Part of Collection hierarchy

Collections (Class):
- Utility class
- Contains static helper methods
- Used for sorting, searching, etc.

Example:

Collections.sort(list);
Collections.reverse(list);

ArrayList:

- Implements List interface.
- Allows duplicate values.
- Maintains insertion order.
- Not thread-safe.

Why use Interface Reference?

Collection<Integer> c = new ArrayList<>();

- Achieves loose coupling.
- Easy to change implementation.

Important Interview Points:

- Collection stores objects, not primitives.
- ArrayList allows duplicates.
- Collection API is part of java.util.
- Collections is a utility class.

One-Line Interview Answer:

- Collection API is a framework that provides
  classes and interfaces to store and manipulate
  groups of objects.

*/