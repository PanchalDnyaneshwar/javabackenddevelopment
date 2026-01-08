public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        // Filling and printing 2D array
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
    Multidimensional Array:
- An array of arrays.
- Used to store data in rows and columns (table format).

Declaration:
int[][] arr = new int[rows][columns];

Accessing Values:
- arr[i][j]
- i → row index
- j → column index

Nested Loop:
- Outer loop → rows
- Inner loop → columns

Math.random():
- Generates a random number between 0.0 and 1.0
- (int)(Math.random() * 10) → random number from 0 to 9

*/