import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4);

        int result = nums.stream()
                        .filter(n -> n%2 == 0)
                        .map(n -> n*2)
                        .sorted()
                     // .reduce(0, (i, c) -> i + c);
                        .reduce(0, Integer :: sum);

         System.out.println(result);
        //strms.forEach(n -> System.out.println(n));
    }
}

/*
    Stream API in Java:

- Stream API is used to process collections.
- Introduced in Java 8.
- Works on data in a functional style.

Why Stream API is Needed?

- Reduces boilerplate code.
- Improves readability.
- Makes data processing easier.
- Supports functional programming.

Important Point:

- Stream does NOT store data.
- It only processes data from collection.

Stream Pipeline:

Collection → Stream → Operations → Result

Common Stream Operations:

filter() → select elements
map()    → transform elements
sorted() → sort elements
forEach()→ iterate elements
reduce() → combine elements

Stream Characteristics:

- No modification of original data.
- Lazy evaluation.
- One-time use only.
Important Interview Points:

- Stream API introduced in Java 8.
- Stream supports lambda expressions.
- Stream operations are functional.
- Streams can be sequential or parallel.
- Stream API is used to process collections
  in a functional and declarative way.
*/