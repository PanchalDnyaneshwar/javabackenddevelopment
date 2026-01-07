public class SwitchSt {
    public static void main(String[] args) {
        
        int n = 5;

            switch (n) {

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wensday");
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
                    System.out.println("Invalid Day number");
                    break;
        }

        // if (n == 1)
        //     System.out.println("Monday");
        // else if (n == 2)
        //     System.out.println("Tuesday"); 
        // else if (n == 2)
        //     System.out.println("Tuesday"); 
        // else if (n == 2)
        //     System.out.println("Tuesday"); 
        // else if (n == 2)
        //     System.out.println("Tuesday"); 
        // else if (n == 2)
        //     System.out.println("Tuesday"); 
        // else
        //     System.out.println("Sunday");

    }
}

/*
    write less code than if else-if else in switch statement.
    According to  condition swich the perticular case code.
    important is write break keyword after every case which is prevent to runs next cases which is not ok as per conditions.
*/