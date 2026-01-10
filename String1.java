public class String1 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(); // Thread-safe
        System.out.println(sb.capacity());    // 16

        StringBuffer sb1 = new StringBuffer("Dnyaneshwar");
        sb1.append(" Panchal");
        System.out.println(sb1);
        System.out.println(sb1.capacity());  // (length * 2) + 2

        String name = sb1.toString();         // Convert to String
        System.out.println(name);

        StringBuilder sb2 = new StringBuilder(); // Not thread-safe
        System.out.println(sb2.capacity());      // 16

        StringBuilder sb3 = new StringBuilder("Swapnil");
        System.out.println(sb3.capacity());      // 16 + length

        System.out.println(sb3.charAt(5));
        System.out.println(sb3.hashCode());
    }
}

/*
    Mutable and Immutable String:

- Immutable String:
  String cannot be changed.
  Example: String

- Mutable String:
  Value can be changed.
  Example: StringBuffer, StringBuilder


StringBuffer:
- Mutable string class.
- Thread safe.
- Slow performance.
- Synchronized (multiple threads safe).
- Default capacity = 16.

Example:
StringBuffer sb = new StringBuffer();


StringBuilder:
- Mutable string class.
- Not thread safe.
- Faster than StringBuffer.
- Not synchronized.
- Default capacity = 16.

Example:
StringBuilder sb = new StringBuilder();


Capacity Rule:
- Default capacity = 16
- If string is passed:
  capacity = 16 + string length
- If capacity exceeded:
  new capacity = (old capacity * 2) + 2


append():
- Used to add text.
- Does not create new object.


toString():
- Converts StringBuffer/StringBuilder to String.


charAt(index):
- Returns character at given index.


hashCode():
- Returns hash value of object.


Interview Points:
- String → Immutable
- StringBuffer → Mutable + Thread safe
- StringBuilder → Mutable + Not thread safe
- Use StringBuilder when single thread
- Use StringBuffer when multiple threads

*/