package Data_Structures_Algorithms.BinaryTrees;

import java.util.*;

public class BoundaryTraversal {

        public static void main(String[] args) {
            // Creating a sample binary tree
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            root.right.left = new TreeNode(6);
            root.right.right = new TreeNode(7);
    
            BoundaryTraversal solution = new BoundaryTraversal();
    
            // Get the boundary traversal
            // List<Integer> result = solution.boundary(root);
    
            // Print the result
            System.out.print("Boundary Traversal: ");
            printResult(result);
        }

        public static void printResult(List<Integer> result) {
            for (int val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
        }


}
