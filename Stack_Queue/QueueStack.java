package Data_Structures_Algorithms.Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {

    Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        QueueStack st = new QueueStack();
        
        // Array of commands
        String[] commands = {"QueueStack", "push", "push", 
                             "pop", "top", "isEmpty"};
        int[][] inputs = {{}, {4}, {8}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    st.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(st.pop() + " ");
                    break;
                case "top":
                    System.out.print(st.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print(st.isEmpty() ? "true " : "false ");
                    break;
                case "QueueStack":
                    System.out.print("null ");
                    break;
            }
        }
    }
    public QueueStack() {
        
    }

    public void push(int x) {
        // Get size
        int s = q.size();
        // Add element
        q.add(x);

        // Move elements before new element to back
        for (int i = 0; i < s; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {
        
      
    }

    public int top() {
        
    }

    public boolean isEmpty() {
    }
}
