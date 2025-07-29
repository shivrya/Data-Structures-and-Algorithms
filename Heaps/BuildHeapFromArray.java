package Data_Structures_Algorithms.Heaps;

import java.util.Arrays;

public class BuildHeapFromArray {

    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 7, 1, 7};

        // Input array
        System.out.println("Input array: " + Arrays.toString(nums));

        // Creating an object of the Solution class
        BuildHeapFromArray sol = new BuildHeapFromArray();

        // Function call to convert the given array into a min-heap
        // sol.buildMinHeap(nums);

        // Output array
        System.out.println("Min-heap array: " + Arrays.toString(nums));
    }

}
