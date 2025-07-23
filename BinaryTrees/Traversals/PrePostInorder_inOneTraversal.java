package Data_Structures_Algorithms.BinaryTrees.Traversals;

import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.data  = value;
        left = null;
        right = null;
    }
}

public class PrePostInorder_inOneTraversal {
        public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PrePostInorder_inOneTraversal sol = new PrePostInorder_inOneTraversal();
        ArrayList<Integer> preorder = new ArrayList<>();
        ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> postorder = new ArrayList<>();
        sol.treeTraversal(root,preorder,inorder,postorder);

        // Print Preorder traversal
        System.out.print("Preorder traversal: ");
        for (int val : preorder) System.out.print(val + " ");
        System.out.println();

        // Print Inorder traversal
        System.out.print("Inorder traversal: ");
        for (int val : inorder) System.out.print(val + " ");
        System.out.println();

        // Print Postorder traversal
        System.out.print("Postorder traversal: ");
        for (int val : postorder) System.out.print(val + " ");
        System.out.println();
    }

    public void treeTraversal(TreeNode root, ArrayList<Integer> preorder, ArrayList<Integer> inorder,  ArrayList<Integer> postorder){

            if(root==null)
                return;
            
            preorder.add(root.data);
            treeTraversal(root.left, preorder, inorder, postorder);
            inorder.add(root.data);
            treeTraversal(root.left, preorder, inorder, postorder);
            postorder.add(root.data);
    }
}
