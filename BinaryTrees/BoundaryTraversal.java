package Data_Structures_Algorithms.BinaryTrees;

import java.util.*;

class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { 
                data = val; 
                left = null;
                right = null; }
}

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
            List<Integer> result = solution.boundary(root);
    
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

        public List<Integer> boundary(TreeNode root) {
            //your code goes here
            List<Integer> result = new ArrayList<>();
    
            if(root==null)
                return result;
            
            if(!isLeaf(root))
                result.add(root.data);
            
            addLeftBoundary(root,result);
            addLeafNodes(root,result);
            // addRightBoundary(root,result);
            return result;
        }
        public boolean isLeaf(TreeNode root){
            return root.left==null && root.right==null;
        }


        public void addLeftBoundary(TreeNode root, List<Integer> result){

            TreeNode current = root.left;
            
            while(current!=null){
                if(!isLeaf(current)){
                    result.add(current.data);
                }
                if(current.left!=null){
                    current=current.left;
                }
                else {
                    current = current.right;
                }
            }
        }

        public void addLeafNodes(TreeNode root, List<Integer> result){

            if(isLeaf(root)){
                result.add(root.data);
                return;
            }        
            if(root.left!=null)
                addLeafNodes(root.left,result);
            
            if(root.right!=null)
                addLeafNodes(root.right,result);
        }


}
