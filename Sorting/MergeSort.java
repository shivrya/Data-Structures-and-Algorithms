package Data_Structures_Algorithms.Sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;

        System.out.println("Before Sorting Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        // Create an instance of the Solution class
        MergeSort sol = new MergeSort();
        // Function call to sort the array
        // int[] sortedArr = sol.mergeSort(arr);

        System.out.println("After Sorting Array: ");
        for (int i = 0; i < n; i++)
            // System.out.print(sortedArr[i] + " ");
        System.out.println();
    }

    public int[] mergeSort(int[] nums) {
        mergeSortHelper(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSortHelper(int[] nums, int low,int high){
        if(low>=high)
            return;
        
        int mid = (low+high)/2;
        mergeSortHelper(nums,low,mid);
        mergeSortHelper(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public void merge(int[] nums, int low, int mid, int high){}
}
