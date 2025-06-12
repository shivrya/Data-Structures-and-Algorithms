package Data_Structures_Algorithms.Stack_Queue;

import java.util.Stack;

public class BalancedParanthesis {

    public static void main(String[] args) {
        String str = "()[{}()]]";
       
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
        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));

        for(int i=1;i<str.length();i++){
            Character latest = str.charAt(i);
            if(!stack.isEmpty()){
                if(latest==')'){
                    if(stack.peek()=='(')
                        stack.pop();
                    else
                        stack.push(latest);

                }else if(latest=='}'){
                    if(stack.peek()=='{')
                        stack.pop();
                    else
                        stack.push(latest);

                }else if(latest==']'){
                    if(stack.peek()=='[')
                        stack.pop();
                    else
                        stack.push(latest);

                }else{
                    stack.push(latest);
                }
            }else{
                stack.push(str.charAt(i));
            }
        }
        // System.out.println(stack.size());
        return stack.isEmpty();
    }

}
