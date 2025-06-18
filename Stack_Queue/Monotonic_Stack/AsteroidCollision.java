package Data_Structures_Algorithms.Stack_Queue.Monotonic_Stack;

import java.util.Stack;

public class AsteroidCollision {

    public static void main(String[] args) {
        int[] arr = {10, 20, -10};

        AsteroidCollision sol = new AsteroidCollision(); 
        
        int[] ans = sol.asteroidCollision(arr);
        
        System.out.print("The state of asteroids after collisions is: ");
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int n = asteroids.length;

        for(int i=0;i<n;i++){
            int current = asteroids[i];

            while(!stack.isEmpty() && current < 0 && stack.peek()>0){
                    if(Math.abs(current) == Math.abs(stack.peek())){
                        current = 0;
                        stack.pop();
                    }else if(Math.abs(current) > Math.abs(stack.peek())){
                        stack.pop();
                    }else if(Math.abs(current) < Math.abs(stack.peek())){
                        current = 0;
                    }
            }
            if(current!=0)
                stack.push(current);
        }
        int[]  arr = new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            arr[i] = stack.get(i);
        }
        return arr;
    }
}
