import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        // Map interface reference
        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("D", 42);
        studentMarks.put("N", 53);
        studentMarks.put("Y", 78);
        studentMarks.put("A", 96);
        studentMarks.put("N", 15); 
        studentMarks.put("U", 23);

        System.out.println("Keys   : " + studentMarks.keySet());
        System.out.println("Values : " + studentMarks.values());

        // Iterating Map
        for (String key : studentMarks.keySet()) {
            System.out.println(key + " : " + studentMarks.get(key));
        }
    }
}


/*
    Map in Java:

- Map is an interface.
- Stores data in key-value pairs.
- Keys are unique.
- Values can be duplicate.

Why Map is Needed?

- Fast data lookup.
- Direct access using key.
- Represents real-world relationships.

Real Life Examples:

- Student → Marks
- Username → Password
- EmployeeID → EmployeeData

HashMap:

- Implements Map interface.
- No order maintained.
- Allows one null key.
- Allows multiple null values.
- Fast performance.

Important Map Methods:

- put(key, value)
- get(key)
- remove(key)
- containsKey(key)
- containsValue(value)
- keySet()
- values()

Important Behavior:

- Duplicate key overrides old value.
- Keys must be unique.

Map vs Collection (Interview):

- Collection stores only values.
- Map stores key-value pairs.
- Map is NOT part of Collection hierarchy.

Types of Map:

- HashMap → no order
- LinkedHashMap → insertion order
- TreeMap → sorted order
- Hashtable → synchronized (legacy)

Important Interview Points:

- HashMap is not thread-safe.
- TreeMap sorts keys.
- Hashtable is synchronized.
- Map does not allow duplicate keys.

*/