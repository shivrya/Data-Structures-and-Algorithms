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

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("push")) {
                q.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(q.pop() + " ");
            } else if (commands[i].equals("peek")) {
                System.out.print(q.peek() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((q.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("StackQueue")) {
                System.out.print("null ");
            }
        }

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
