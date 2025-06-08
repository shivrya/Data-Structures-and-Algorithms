package Data_Structures_Algorithms.Stack_Queue;

import java.util.Arrays;
import java.util.List;

public class ArrayStack {

    private int[] stackArray;
    private int topIndex;

    public ArrayStack(){
        stackArray = new int[1000];
        topIndex = -1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        List<String> commands = Arrays.asList("ArrayStack", "push", "push", "top", "pop", "isEmpty");
        List<List<Integer>> inputs = Arrays.asList(Arrays.asList(), Arrays.asList(5), Arrays.asList(10), Arrays.asList(), Arrays.asList(), Arrays.asList());

        for (int i = 0; i < commands.size(); ++i) {
            switch (commands.get(i)) {
                case "push":
                    stack.push(inputs.get(i).get(0));
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(stack.pop() + " ");
                    break;
                case "top":
                    System.out.print(stack.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print((stack.isEmpty() ? "true" : "false") + " ");
                    break;
                case "ArrayStack":
                    System.out.print("null ");
                    break;
            }
        }

    }

    public void push(int x) {
        topIndex++;
        stackArray[topIndex] = x;
    }

    public int pop() {
        if(topIndex < 0){
            System.out.println("Stack is Empty");
            return -1;
        }
        int top =  stackArray[topIndex];
        topIndex--;
        return top;
    }

    public int top() {
        return stackArray[topIndex];
        
    }

    public boolean isEmpty() {
        return (topIndex < 0) ? true : false;
    }

}
