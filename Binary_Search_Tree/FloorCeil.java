package Data_Structures_Algorithms.Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;

public class FloorCeil {

    public static void main(String[] args) {
        // Creating a sample BST
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(4);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(14);

        FloorCeil sol = new FloorCeil();
        int key = 11;  // Key to find floor and ceil for

        // Find and print floor and ceil values
        List<Integer> result = sol.floorCeilOfBST(root, key);
        System.out.println("Floor: " + result.get(0) + ", Ceil: " + result.get(1));
    }

    public List<Integer> floorCeilOfBST(TreeNode root, int key) {
            List<Integer> result = new ArrayList<>();
            int floor = -1;
            int ceil = -1;


            result.add(floor,ceil);
            return result;
    }

}
