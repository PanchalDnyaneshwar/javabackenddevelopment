import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        
        Comparator<String> cmp = new Comparator<>() {
            
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(), o1.length());
            }

        //    public int compare(Integer o1, Integer o2)
        //     {
        //         if (o1 % 10 > o2 % 10) 
        //             return 1;
        //         else
        //             return -1;
        //     }

        };

        // List<Integer> nums = new ArrayList<>();
        
        // nums.add(45);
        // nums.add(78);
        // nums.add(14);
        // nums.add(89);
        // nums.add(11);

        List<String> strs = new ArrayList<>();
        strs.add("Dipak");
        strs.add("Dnyaneshwar");
        strs.add("Dinesh");
        strs.add("Swapnil");
        strs.add("Prasad");
        strs.add("Krishna");
        

        Collections.sort(strs, cmp);

        System.out.println(strs);

     }
}

/*
    Comparator in Java:

- Comparator is an interface.
- Used to define custom sorting logic.
- Located in java.util package.

Why Comparator is Needed?

- Default sorting may not be enough.
- Needed when we want custom order.
- Used when class cannot be modified.

Comparator vs Comparable:

Comparable:
- compareTo() method
- Used for natural ordering
- Class itself defines sorting

Comparator:
- compare() method
- External sorting logic
- Multiple sorting strategies possible

Comparator Method:

compare(o1, o2)

- returns positive → swap
- returns negative → no swap
- returns zero → equal

Collections.sort():

- Used to sort List.
- Can accept Comparator.

Syntax:
Collections.sort(list, comparator);

Real-Life Use Cases:

- Sort employees by salary
- Sort students by marks
- Sort products by price

Important Interview Points:

- Comparator is functional interface.
- Used for custom sorting.
- Allows multiple sorting logic.

*/