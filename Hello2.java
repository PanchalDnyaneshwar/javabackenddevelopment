public class Hello2 {

    public static void main(String[] args) {

        // Automatic Type Conversion (Widening)
        int a = 257;
        System.out.println(a);

        // Explicit Type Casting (Narrowing)
        byte b = (byte) a;
        System.out.println(b);

        // Type Promotion in expressions
        byte c = 14;
        byte d = 25;

        int result = c * d; // byte * byte → int
        System.out.println(result);
    }
}

/*
    Type Conversion (Widening):
- Smaller data type is automatically converted to a bigger data type.
- No data loss.
- Example: byte → int, int → float

Type Casting (Narrowing):
- Bigger data type is explicitly converted to a smaller data type.
- Data loss may occur.
- Syntax: (type) value
- Example: byte b = (byte) intValue

Casting Behind the Scene:
- If the value is out of range, Java wraps the value.
- Example: 257 % 256 = 1 → stored in byte

Type Promotion:
- During arithmetic operations, Java promotes smaller data types.
- byte, short, char → int
- Example: byte * byte → int

*/