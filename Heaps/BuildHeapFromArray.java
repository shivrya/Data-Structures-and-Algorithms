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
        sol.buildMinHeap(nums);

        // Output array
        System.out.println("Min-heap array: " + Arrays.toString(nums));
    }

    public void buildMinHeap(int[] nums) {

        for(int i=nums.length-1;i>=0;i--){
        //    heapifyDown(nums,i);
        }
    }

    public void heapifyDown(int[] nums, int ind){
        int leftchild = ind * 2 + 1;
        int rightchild = ind * 2 + 2;
        int smallest = ind;

        if(leftchild < nums.length && nums[smallest] > nums[leftchild]){
             smallest = leftchild;
        }
        if(rightchild < nums.length && nums[smallest] > nums[rightchild]){
         smallest = rightchild;
        }
        if(smallest!=ind){
         int tmp = nums[smallest];
         nums[smallest] = nums[ind];
         nums[ind] = tmp;
         heapifyDown(nums,smallest);
        }
    }
}
