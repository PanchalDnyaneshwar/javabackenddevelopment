
class Calculator {

    public int addition(int a, int b)
    {
        int res = a + b;
        return res;
    }
}


class Oops1 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;

        Calculator calc = new Calculator();
        int res = calc.addition(num1, num2);
        System.out.println(res);
    }
}



/*
    # Object Oriented Programming - in real world everything is an Object.

    * and every OBJECT have PROPERTIES and BEHAVIOUR.

    - We are creating object in java with the help of NEW keyword.

    * what is class in java ?
    - Class is DESIGN or BLUEPRINT of how we want our OBJECT look like.
    - ex. APPLE comapny gives branding as like "DESIGN in CALIFORNIA and ASSEMBLE in CHINA".
    - so for like this designing in any OBJECT in java we need CLASS.

    " we can perfoem any action (BEHAVIOUR) in java with help of MWTHODS and it have return type"
    


 */
