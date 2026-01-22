import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        // TreeSet maintains sorted order
        TreeSet<Integer> ts = new TreeSet<>();

        // Collection reference
        Collection<Integer> al = new ArrayList<>();
        al.add(19);
        al.add(20);
        al.add(21);
        al.add(22);

        ts.add(12);
        ts.addAll(al);   // add collection to TreeSet

        // Using Iterator
        Iterator<Integer> itr = ts.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Enhanced for loop (alternative)
        // for (int num : ts) {
        //     System.out.println(num);
        // }
    }
}

/*
    TreeSet in Java:

- TreeSet implements Set interface.
- Stores elements in sorted order.
- Does NOT allow duplicate values.

Important Properties of TreeSet:

- Sorted (ascending by default).
- No duplicate elements.
- Does NOT allow null values.

TreeSet vs HashSet:

- HashSet → fast, no order
- TreeSet → sorted, slower than HashSet

Iterator in Java:

- Used to traverse collections.
- Works with all Collection types.
- Forward direction only.

Iterator Methods:

- hasNext() → checks next element
- next() → returns next element
- remove() → removes element

Why Iterator is Used?

- Safe traversal.
- Avoids ConcurrentModificationException.
- Works with Set, List, Queue.

When to Use Iterator?

- When you don’t need index.
- When working with Set or TreeSet.

Important Interview Points:

- TreeSet stores unique sorted values.
- TreeSet does not allow null.
- Iterator supports forward traversal only.

*/