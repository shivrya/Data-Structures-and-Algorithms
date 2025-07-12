package Data_Structures_Algorithms.BinaryTrees;

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

public class InorderTraversal {

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        InorderTraversal sol = new InorderTraversal();
        // Getting inorder traversal
        List<Integer> result =  sol.inorder(root);

        // Displaying the inorder traversal result
        System.out.print("Inorder Traversal: ");
        // Output each value in the inorder traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public List<Integer> inorder(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();

        recursiveInorder(root,result);
        return result;
    }

    public void recursiveInorder(TreeNode root, ArrayList result){
        if(root==null)
            return;
        
        recursiveInorder(root.left, result);
        result.add(root.value);
        recursiveInorder(root.right, result);
    }
}
