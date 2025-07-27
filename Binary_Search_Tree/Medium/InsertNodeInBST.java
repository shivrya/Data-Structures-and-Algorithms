package Data_Structures_Algorithms.Binary_Search_Tree.Medium;

class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { data = val; left = null; right = null; }
 }

public class InsertNodeInBST {

    public static void main(String[] args) {
        InsertNodeInBST solution = new InsertNodeInBST();
        
        // Create a sample BST: [4, 2, 7, 1, 3]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        
        int val = 5;
        root = solution.insertIntoBST(root, val);
        
        // Print the BST in-order to verify the insertion
        // solution.printInOrder(root); // Output should be: 1 2 3 4 5 7
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        return new TreeNode(val);
    
        if(root.data > val){
            if(root.left==null)
                root.left = new TreeNode(val);
            else
                insertIntoBST(root.left,val);
        }else{
            if(root.right==null)
                root.right = new TreeNode(val);
            else
                insertIntoBST(root.right,val);
        }
        return root;
    }

}
