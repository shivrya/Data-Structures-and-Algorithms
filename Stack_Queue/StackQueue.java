package Data_Structures_Algorithms.Stack_Queue;

import java.util.Stack;

public class StackQueue {

    private Stack<Integer> input,output;

    public static void main(String[] args) {
        StackQueue q = new StackQueue();

        // List of commands
        String[] commands = {"StackQueue", "push", "push", 
                             "pop", "peek", "isEmpty"};
        // List of inputs
        int[][] inputs = {{}, {4}, {8}, {}, {}, {}};

    }

    public StackQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        int x = output.pop();

        while(!output.isEmpty()){
            input.push(output.pop());
        }
        return x;
      
    }

    public int peek() {
        while(!input.isEmpty()){
            output.push(input.pop());
        }
        int x = output.peek();

        while(!output.isEmpty()){
            input.push(output.pop());
        }
        return x;
        
    }

    public boolean isEmpty() {
        return input.isEmpty();
    }
    
}
