public class Hello2 {
    public static void main(String[] args) {
        
        // Conversion - Automatic
        byte b;
        int a = 257;
       //  b = a; (X)
        System.out.println(a);

        // Type Casting - Explicite
        b = (byte)a;
         System.out.println(b);

        // Type promoting
        byte c = 14;
        byte d = 25;

        int res = c * d;
        System.out.println(res);
    }
}

/*
     Type - Conversion VS Casting vs Promoting

     * Conversion is assign two different variables types  smaller type values assign to the bigger value type.
     - ex. byte = int, float = int

     * Casting is explicitly convert bigger values in smaller type value and then assign bigger type values 
        assign to the smaller values type.

     - ex. int = (int) float, byte = (byte) int

     - Behind the scene when bigger value goes out the range of smaller type then it is used to (%10) on bigger value
         and then stores remender of the calculation. 
    
     * Promoting is when we perform any mathematical operations on same type of variable and resulting value is 
         cross the limit of the range of type then java can promote resulting value in bigger range type.

      - ex. byte * byte = int, int * int = float

*/