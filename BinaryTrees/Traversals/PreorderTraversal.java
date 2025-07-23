
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

public class PreorderTraversal {

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PreorderTraversal sol = new PreorderTraversal();
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
        List<Integer> result = new ArrayList<>();

        iterativePreorder(root, result);
        return result;
        
    }

    public void iterativePreorder(TreeNode root, List<Integer> result){
        Stack<TreeNode> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()){
            TreeNode newRoot = st.pop();
            result.add(newRoot.value);

            if(newRoot.right!=null)
                st.push(newRoot.right);
            if(newRoot.left!=null)
                st.push(newRoot.left);
        }
    }

    public void recursiveInorder(TreeNode root, ArrayList result){
        
        if(root==null)
            return;
    
        recursiveInorder(root.left,result);
        result.add(root.value);
        recursiveInorder(root.right, result);
    }

}
