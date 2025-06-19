package Data_Structures_Algorithms.Stack_Queue.Monotonic_Stack;

public class RemoveKDigits {

    public static void main(String[] args) {
        String nums = "541892";
        int k = 2;
        
        /* Creating an instance of 
        Solution class */
        RemoveKDigits sol = new RemoveKDigits(); 
        
        /* Function call to find the smallest 
        possible integer after removing k digits */
        String ans = sol.removeKdigits(nums, k);
        
        System.out.println("The smallest possible integer after removing k digits is: " + ans);
    }

    public String removeKdigits(String nums, int k) {
        StringBuilder res = new StringBuilder();


        return res.toString();
    }

}
