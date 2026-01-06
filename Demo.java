public class Demo {
    public static void main(String[] args) {
        
        int x = 6;
        int y = 4;

        double a = 15.8;
        double b = 9.4;

    //    boolean res = x >= y;
    //    boolean res = x <= y;
    //    boolean res = x > y;
    //    boolean res = x < y;
    //    boolean res = x != y; 
    //    boolean res = x == y; 

        // boolean res = x>y && a>b;
        //  boolean res = x<y && a>b;
        //  boolean res = x>y || a>b;
         boolean res = x<y || a>b;

        boolean not = x < y;

        System.out.println(!not);
        System.out.println(res);
    }
}

/*
    # Comparison Operators - returns True / False (boolean)

    < - less than 
    > - greater than 
    ! - not
    == - equal to
    != - not equal to 
    <= - greater than equal to
    >= - less than equal to

    # Assignment Operators - assign the value

    = - assigment

    # Logical Operators

    * && - AND operator 
    - check all values are satisfy condition then only gives TRUE otherwise result will always be FALSE.

    * || - OR operator 
    - check any one value from all values are satisfy condition then  gives TRUE otherwise result will always be FALSE.

    * ! - NOT Operator
    - if we want check condtion is not true or reverse of resulting values that time we use ! operater.

      ex. var = !(true);
          var = false. 

*/
