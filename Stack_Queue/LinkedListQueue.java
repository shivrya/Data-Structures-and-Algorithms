package Data_Structures_Algorithms.Stack_Queue;

import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Integer> list;

    public static void main(String[] args) {
        // Creating a queue
        LinkedListQueue q = new LinkedListQueue();

        // Array of commands
        String[] commands = {"LinkedListQueue", "push", "push", 
                             "peek", "pop", "isEmpty"};
        // Array of inputs
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            if (commands[i].equals("push")) {
                q.push(inputs[i][0]);
                System.out.print("null ");
            } else if (commands[i].equals("pop")) {
                System.out.print(q.pop() + " ");
            } else if (commands[i].equals("peek")) {
                System.out.print(q.peek() + " ");
            } else if (commands[i].equals("isEmpty")) {
                System.out.print((q.isEmpty() ? "true" : "false") + " ");
            } else if (commands[i].equals("LinkedListQueue")) {
                System.out.print("null ");
            }
        }
    }

    public LinkedListQueue() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        return list.removeFirst();
      
    }

    public int peek() {
        return list.getFirst();
        
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
