import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        // add elements
        nums.add(45);
        nums.add(16);
        nums.add(30);

        // add at index
        nums.add(1, 99);

        // get element
        System.out.println("Element at index 2: " + nums.get(2));

        // update element
        nums.set(0, 100);

        // remove element
        nums.remove(2);

        // size
        System.out.println("Size: " + nums.size());

        // check contains
        System.out.println("Contains 16? " + nums.contains(16));

        // sort
        Collections.sort(nums);

        // iterate
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

/*

    Collection (Interface)
 |
 |-- List (Interface)
 |     |-- ArrayList
 |     |-- LinkedList
 |     |-- Vector
 |
 |-- Set (Interface)
 |     |-- HashSet
 |     |-- LinkedHashSet
 |     |-- TreeSet
 |
 |-- Queue (Interface)
       |-- PriorityQueue
       |-- ArrayDeque

Map (Not part of Collection)
 |
 |-- HashMap
 |-- LinkedHashMap
 |-- TreeMap
 |-- Hashtable

 Collection API:

- Framework for storing and manipulating objects.
- Located in java.util package.
- Works only with objects (not primitives).

List Interface:

- Allows duplicate values.
- Maintains insertion order.
- Index-based access.

add()
add(index, value)
get(index)
set(index, value)
remove(index)
size()
contains()

Set Interface:

- Does NOT allow duplicate values.
- No index-based access.
- Used for unique data.

add()
remove()
contains()
size()

Queue Interface:

- Follows FIFO (First In First Out).
- Used in scheduling, messaging.

offer()  → add element
poll()   → remove element
peek()   → view head

ArrayList:

- Implements List interface.
- Allows duplicate elements.
- Maintains insertion order.
- Dynamic size.
- Not thread-safe.

add()
add(index, value)
get(index)
set(index, value)
remove(index)
size()
contains()
clear()

- Collection Framework provides classes and interfaces
  to store, retrieve, and manipulate groups of objects.

*/