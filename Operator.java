public class Operator {

    public static void main(String[] args) {
        
        int num = 5;
        int num1 = 8;

        int Addition = num + num1;  // 12
        int Substraction = num - num1; // -3
        int Multiplication = num * num1; // 40 
        int Divide = num / num1;   // 0
        int Modulus = num % num1;  // 5

        // Similar but not same operation those behave diffrent.

       // num++;
       // num = num + 1;
       // ++num;
        num += 1;

        // num--;
        // num = num - 1;
        // --num;
        num -= 1;

        System.out.println(num);

        System.out.println(" Add : " + Addition + " Sub : " + Substraction +
        " Mul : "+ Multiplication + " Div : " + Divide + " Mod : " + Modulus);
    }
}

/*
    # Operators 

    Post-Increment (var++) - Increament Value by one after fetch the value.
    Pre-Increment (++var) - Increament Value by one before fetch the value.
    Post-Decrement (var--) - Decreament Value by one after fetch the value.
    Pre-Decrement (--var) - Decreament Value by one before fetch the value.
    Modulus (%)  - It will gives remender.
    Divide (/) - It will gives quotient.
    Multply (*) - It will gives Multiplication.
    Addition (+) - It will gives Addition.
    Substraction (-) - It will gives Subtraction.

*/