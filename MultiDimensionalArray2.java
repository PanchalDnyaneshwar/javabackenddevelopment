public class MultiDimensionalArray2 {

    public static void main(String[] args) {

        // Jagged array (rows with different column sizes)
        int[][] nums = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[4];

        // Fill array with random values
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // Print array using enhanced for loop
        for (int[] row : nums) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

/*
    Jagged Array:
- A 2D array where each row can have different sizes.
- Also called an irregular array.

Declaration:
int[][] nums = new int[3][];

Row Sizes:
nums[0] = new int[3];
nums[1] = new int[2];
nums[2] = new int[4];

Enhanced for loop:
- Used to iterate through arrays easily.
- No need to use index.
- Best for reading/printing data.

Use Case:
- When rows have different number of values.
- Example: student marks for different subjects.

*/