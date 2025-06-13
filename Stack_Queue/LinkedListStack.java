package Data_Structures_Algorithms.Stack_Queue;

import java.util.LinkedList;

public class LinkedListStack {

    private LinkedList<Integer> list;

    public static void main(String[] args) {
        // Creating a stack
        LinkedListStack st = new LinkedListStack();

        // Array of commands
        String[] commands = {"LinkedListStack", "push", "push", 
                             "pop", "top", "isEmpty"};
        // Array of inputs
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                st.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(st.pop() + " ");
            } else if (commands[i].equals("top")) {
                System.out.print(st.top() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((st.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("LinkedListStack")) {
                System.out.print("null ");
            }
        }
    }

    public LinkedListStack() {
        list = new LinkedList<>();
    }

    public void push(int x) {
       list.add(x);
    }

    public int pop() {
        return list.removeLast();
      
    }

    public int top() {
        return list.getLast();
        
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
