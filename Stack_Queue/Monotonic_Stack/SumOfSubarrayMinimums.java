package Data_Structures_Algorithms.Stack_Queue.Monotonic_Stack;

import java.util.Stack;

public class SumOfSubarrayMinimums {

    public static void main(String[] args) {
        int[] arr = {11, 81, 94,43,3};
        
        /* Creating an instance of 
        Solution class */
        SumOfSubarrayMinimums sol = new SumOfSubarrayMinimums(); 
        
        /* Function call to find the sum of the 
        minimum value in each subarray */
        int ans = sol.sumSubarrayMins1(arr);
        
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

    // OPTIMAL SOLUTION
    public int sumSubarrayMins1(int[] arr){
       
        int[] previousSmaller = previousSmaller(arr);
        int[] nextSmaller = nextSmaller(arr);
        int sum = 0;
        int MOD = 1000000007;


        for(int i=0;i<arr.length;i++){
            int left = i - previousSmaller[i];
            int right = nextSmaller[i] - i ;
            sum = (sum + (int)(((long)left * right % MOD) * arr[i] % MOD)) % MOD;

        }
        return sum;
   
    }

    public int[] previousSmaller(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        for(int i=0;i<arr.length;i++){

            while(!stack.isEmpty() &&  arr[stack.peek()]> arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(i);
        }
        return result;

    }
    public int[] nextSmaller(int[] arr ){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            while(!stack.isEmpty() &&  arr[stack.peek()]>= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                result[i] = arr.length;
            }else{
                result[i] = stack.peek();
            }
            stack.push(i);
        }

        return result;
    }

}
