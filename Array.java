public class Array {

    public static void main(String[] args) {

        // Creating array with fixed size
        int[] arr = new int[5];

        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;

        // Traversing array using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


/*
    Array in Java:
- Array is used to store multiple values of the same data type.
- Array size is fixed once created.

Why Array:
- Easy to manage large number of values.
- Stores data in an ordered manner using index.

Array Declaration:
int[] arr = {1, 2, 3};
int[] arr = new int[5];

Index:
- Index starts from 0.
- Last index = length - 1

Loop with Array:
- Loops are commonly used to access array elements.
- arr.length gives total size of array.

*/