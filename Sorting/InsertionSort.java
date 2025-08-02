package Data_Structures_Algorithms.Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        // Create an instance of solution class
        InsertionSort solution = new InsertionSort();
        
        int[] nums = {13, 46, 24, 52, 20, 9};
        
        System.out.println("Before Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Function call for insertion sort
        solution.insertionSort(nums);
        
        System.out.println("After Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void insertionSort(int[] nums){

        for(int i=0;i<nums.length;i++){
            int j = i;

            while(j>0 && nums[j-1] > nums[j]){
                int tmp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = tmp;
                j--;
            }
        }
    }

}
