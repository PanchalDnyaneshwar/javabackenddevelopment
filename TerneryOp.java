public class TerneryOp {
    public static void main(String[] args) {
        
        int num = 4;
        int result = 0;


        // if (num % 2 == 0) 
        //     result = 10;
        // else
        //     result = 20;

        result = num % 2 == 0 ? 10 : num <= 0 ? 5 : 20;

        System.out.println(result);
    }
}

/*
    syntax ?:
    Ternery Operator is Shorter syntax for if-else conditional statement 
    we can write in one line 
    Also we are able used for many conditions.
*/
