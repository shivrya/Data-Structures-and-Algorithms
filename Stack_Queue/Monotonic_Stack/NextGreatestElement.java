package Data_Structures_Algorithms.Stack_Queue.Monotonic_Stack;

import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 3, 2, 4};
        
        /* Creating an instance of 
        Solution class */
        NextGreatestElement sol = new NextGreatestElement(); 
        
        /* Function call to find the next greater element
        for each element in the array */
        int[] ans = sol.nextLargerElement1(arr);
        
        System.out.println("The next greater elements are: ");
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }


    // Brute Force approach
    public int[] nextLargerElement(int[] arr) {
        int[] result = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                    if(arr[j]>arr[i]){
                        result[i]=arr[j];
                        break;
                    }else{
                        result[i] = -1;
                    }
                }
            }
        return result;
    }

    // Optimal Approach Using Stack
    public int[] nextLargerElement1(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        for(int i=n-1;i>=0;i--){

            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                result[i] = -1;
                
            }else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
