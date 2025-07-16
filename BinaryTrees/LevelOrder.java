package Data_Structures_Algorithms.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

class Tuple{
    TreeNode node;
    int col;
    int row;

    Tuple(TreeNode node, int col, int row){
        this.node = node;
        this.col = col;
        this.row = row;
    }
 }

public class LevelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        LevelOrder solution = new LevelOrder();
        List<List<Integer>> result = solution.verticalTraversal(root);

        System.out.println("Vertical Traversal:");
        for (List column : result) {
            System.out.println(column);
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        return result;
    }

}
