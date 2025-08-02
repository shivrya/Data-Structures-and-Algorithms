package Data_Structures_Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        // Create an instance of solution class
        BubbleSort solution = new BubbleSort();

        int[] nums = {7, 4, 1, 5, 3};

        System.out.println("Array Before Using Bubble Sort: " + Arrays.toString(nums));

        // Function call for Bubble Sort
        solution.bubbleSort(nums);

        System.out.println("Array After Using Bubble Sort: " + Arrays.toString(nums));
    }

    public void bubbleSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j]  = tmp;
                }
            }
        }
    }
}
