package Data_Structures_Algorithms.BinaryTrees.Traversals;

import java.util.*;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;


    TreeNode(int value){
        this.value = value;
        left = null;
        right = null;
    }
}


public class PostorderTraversal {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PostorderTraversal sol = new PostorderTraversal();
        // Getting postorder traversal
        List<Integer> result = sol.postorder(root);

        // Printing the postorder traversal result
        System.out.print("Postorder traversal: ");
        printList(result);
    }

    static void printList(List<Integer> list) {
        // Iterate through the list and print each element
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public List<Integer> postorder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        recursivePostorder(root,result);

        return result;
    }

    public void recursivePostorder(TreeNode root, ArrayList result){

        if(root==null)
            return;
        
        recursivePostorder(root.left,result);
        recursivePostorder(root.right,result);
        result.add(root.value);
    }
}
