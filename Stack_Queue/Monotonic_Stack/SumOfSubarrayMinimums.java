package Data_Structures_Algorithms.Stack_Queue.Monotonic_Stack;

public class SumOfSubarrayMinimums {

    public static void main(String[] args) {
        int[] arr = {11, 81, 94,43,3};
        
        /* Creating an instance of 
        Solution class */
        SumOfSubarrayMinimums sol = new SumOfSubarrayMinimums(); 
        
        /* Function call to find the sum of the 
        minimum value in each subarray */
        int ans = sol.sumSubarrayMins(arr);
        
        System.out.println("The sum of minimum value in each subarray is: " + ans);
    }

    public int sumSubarrayMins(int[] arr){
        int sum = 0;
        int min =  0;
        int n = arr.length;

        for(int i=0;i<n;i++){
            min = arr[i];

            for(int j=i;j<n;j++){
                min = Math.min(min,arr[j]);
                sum += min;
            }
        }

        return sum;
    }

}
