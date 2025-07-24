package Data_Structures_Algorithms.Binary_Search_Tree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { data = val; left = null; right = null; }
}


public class BSTSearch {

    public static void main(String[] args) {
        // Creating a simple BST for demonstration
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        BSTSearch sol = new BSTSearch();
        TreeNode result = sol.searchBST(root, 2);
        if (result != null) {
            System.out.println("Node found with value: " + result.data);
        } else {
            System.out.println("Node not found");
        }
    }

    public TreeNode searchBST(TreeNode root, int val){
        if(root == null)
            return null;
        
        if(root.data == val)
            return root;
        else if(root.data > val){
            return searchBST(root.left,val);
        }
        return searchBST(root.right, val);
    }

}
