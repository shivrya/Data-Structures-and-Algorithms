package Data_Structures_Algorithms.BinaryTrees.Traversals;

import java.util.*;

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value){ 
        this.value = value;
    }
}

public class BinaryTree {

    private Node root;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree abc = new BinaryTree();
        abc.populate(scanner);
        abc.show();
    }

    public void populate(Scanner scanner){
        System.out.println("enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("do you want to enter left of: "+node.value);
        boolean left = scanner.nextBoolean();

        if(left){
            System.out.println("enter the value of the left of"+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }

        System.out.println("do you want to enter right of: "+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("enter the value of right of:"+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }

    public void show(){
        show(root);
    }

    public void show(Node root){

        if(root==null)
            return;
        System.out.println(root.value);
        show(root.left);
        show(root.right);
    }

}
