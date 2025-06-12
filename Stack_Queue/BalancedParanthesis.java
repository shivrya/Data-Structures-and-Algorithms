package Data_Structures_Algorithms.Stack_Queue;

public class BalancedParanthesis {

    public static void main(String[] args) {
        String str = "()[{}()]";
       
        /* Creating an instance of 
        Solution class */
        BalancedParanthesis sol = new BalancedParanthesis();
       
        /* Function call to check if the 
        string is valid */
        boolean ans = sol.isValid(str);
       
        if(ans)
            System.out.println("The given string is valid.");
        else 
            System.out.println("The given string is invalid.");
    }

    public boolean isValid(String str) {

        return true;
    }

}
