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
    # Loop - iteration
        - Repeating same thing but condition based

        * Types of Loop
        - while, do while and for  and  nested loop

        * we can use any loop at any scenario and any point but best practices is :

        " For Loop " 
        - when we know finite iteration and condition well.
        - ex. print 1-100 numbers

        " While Loop " 
        - when we dont about end of itearation well.
        - ex. reading any file 

        " Do While Loop "
        - when we dont about condition but we have to run code atleast once 
        - ex. security checks 
        

*/