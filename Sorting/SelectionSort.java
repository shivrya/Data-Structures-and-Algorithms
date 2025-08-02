package Data_Structures_Algorithms.Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 2, 8};
    
        System.out.print("Original array: ");
        for (int num : arr) {
          System.out.print(num + " ");
        }
        System.out.println();
    
        // create an instance of solution class
        SelectionSort solution = new SelectionSort();
    
        // function call for selection sort
        solution.selectionSort(arr);
    
        System.out.print("Sorted array: ");
        for (int num : arr) {
          System.out.print(num + " ");
        }
        System.out.println();
      }

      public void selectionSort(int[] nums){

        for(int i=0;i<nums.length;i++){
            int smallestIndex = i;

            for(int j=i+1;j<nums.length;j++){
                if(nums[smallestIndex] > nums[j])
                    smallestIndex = j;
            }

            int tmp = nums[smallestIndex];
            nums[smallestIndex] = nums[i];
            nums[i] = tmp;
        }
      }

}
