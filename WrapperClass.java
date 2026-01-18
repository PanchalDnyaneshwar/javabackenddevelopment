public class WrapperClass {

    public static void main(String[] args) {

        int num = 7;

        // Autoboxing: primitive → object
        Integer n1 = num;
        System.out.println(n1);

        // Unboxing: object → primitive
        int num2 = n1;
        System.out.println(num2);

        // Converting String to int
        String digit = "24";
        int n2 = Integer.parseInt(digit);
        System.out.println(n2);
    }
}

/*
    Wrapper Class:

- Wrapper classes convert primitive data types into objects.
- Each primitive has its own wrapper class.

Primitive and Wrapper Mapping:

- int    → Integer
- double → Double
- char   → Character
- boolean → Boolean

Why Wrapper Classes?

- Some frameworks work only with objects.
- Collections store only objects.
- Needed for generics and APIs.

Autoboxing:

- Automatic conversion from primitive to object.
- Done by JVM.

Example:
Integer n1 = num;

Unboxing:

- Automatic conversion from object to primitive.
- Done by JVM.

Example:
int num2 = n1;

Parsing:

- Converting String to primitive.
- parseInt(), parseDouble(), etc.

Example:
Integer.parseInt("24");

Why Java is not purely OOP?

- Java supports primitive data types.
- Pure OOP languages allow only objects.

Important Interview Points:

- Wrapper classes are immutable.
- Wrapper classes are in java.lang package.
- Autoboxing and unboxing introduced in Java 5.

One-Line Interview Answer:

- Wrapper classes are used to convert primitive types into objects.

*/