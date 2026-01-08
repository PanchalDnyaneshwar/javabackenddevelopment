public class SwitchSt {

    public static void main(String[] args) {

        int day = 5;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number");
        }
    }
}

/*
    switch Statement:
- Used to execute one block of code from multiple choices.
- It is cleaner than long if–else-if chains.

How it works:
- The value of the variable is matched with case values.
- Matching case code is executed.

break Keyword:
- Stops execution after a matching case.
- Prevents execution of next cases (fall-through).

default:
- Executes when no case matches.
- Optional but recommended.

Use Case:
- Best when checking one variable against fixed values.
- Example: days, menu options, status codes.

*/