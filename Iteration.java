public class Iteration {
    public static void main(String[] args) {
        
       // int i = 1;

        // while (i <= 4) {
            
        //     System.out.println("Dnyaneshwar " + i);
        //     i++;

        //     int num = 1;

        //     while (num <= 4)  {
        //         System.out.println("Panchal " +  num);
        //         num++;
        //     }
        // }

        // System.out.println( "Bye " + i);


        int num2 = 0;

        do{
            System.out.println("Hello");
        }while(num2 > 2);

            int i=1;
        for(; i<=5;)
        {
            System.out.println("Day " + i);

            for(int j=9; j<=18; j++)
            {
                System.out.println("    " + j);
            }
             i++;
        }
    }
}

/*
    Loop (Iteration):
- Used to repeat the same task based on a condition.

Types of Loops in Java:

1) while loop:
- Condition is checked first.
- Loop runs only if condition is true.
- Used when end condition is not clearly known.
- Example: reading a file.

2) do-while loop:
- Executes code at least once.
- Condition is checked after execution.
- Example: login or security checks.

3) for loop:
- Used when number of iterations is known.
- Best for fixed ranges.
- Example: print numbers from 1 to 100.

Nested Loop:
- One loop inside another loop.
- Used for tables, patterns, schedules, etc.

*/