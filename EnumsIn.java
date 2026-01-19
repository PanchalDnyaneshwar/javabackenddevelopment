enum Result {
    RUNNING, STOPPED, FAILED, SUCCESSFUL
}

public class EnumsIn {

    public static void main(String[] args) {

        Result[] res = Result.values();

        int i = 5;

        if (i > 5)
            System.out.println(Result.FAILED);
        else if (i == 5)
            System.out.println(Result.STOPPED);
        else if (i >= 1)
            System.out.println(Result.SUCCESSFUL);
        else
            System.out.println(Result.RUNNING);

        for (Result r : res) {
            System.out.println(r);
        }
    }
}

/*
 * Enum in Java:
 * 
 * - Enum is a special type used to define constants.
 * - Enum values are fixed.
 * - Enum improves code readability.
 * 
 * Enum Benefits:
 * 
 * - Prevents invalid values.
 * - Improves maintainability.
 * - Easy to understand.
 * 
 * Important Interview Points:
 * 
 * - Enum is implicitly final.
 * - Enum extends java.lang.Enum.
 * - Cannot create enum object using new.
 * 
 * Enum Properties:
 * 
 * - Enum constants are public static final by default.
 * - Enum can be used in switch statements.
 * - Enum can have methods and variables.
 * 
 * One-Line Interview Answer:
 * 
 * - Enum is used to represent a fixed set of constants in Java.
 * 
 */