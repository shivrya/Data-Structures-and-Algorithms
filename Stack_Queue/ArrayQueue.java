package Data_Structures_Algorithms.Stack_Queue;

public class ArrayQueue {

    private int[] arr;
    private int start;
    private int end;
    private int size;

    public ArrayQueue() {
        size = 1000;
        arr = new int[size];
        start = 0;
        end = -1;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        String[] commands = {"ArrayQueue", "push", "push", 
                             "peek", "pop", "isEmpty"};
        int[][] inputs = {{}, {5}, {10}, {}, {}, {}};

        for (int i = 0; i < commands.length; ++i) {
            switch (commands[i]) {
                case "push":
                    queue.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(queue.pop() + " ");
                    break;
                case "peek":
                    System.out.print(queue.peek() + " ");
                    break;
                case "isEmpty":
                    System.out.print(queue.isEmpty() ? "true " : "false ");
                    break;
                case "ArrayQueue":
                    System.out.print("null ");
                    break;
            }
        }
    }

    public void push(int x) {
        end++;
        if(end > size){
            System.out.println("Not enough size");
            return;
        }
        arr[end] = x;
    }

    public int pop() {
        if(end < 0)
            return 0;
        
        int x = arr[start];
        start++;
        return x;
    }

    public int peek() {
        return arr[start];
    }

    public boolean isEmpty() {
        return (end < start) ? true : false;
    }
}
