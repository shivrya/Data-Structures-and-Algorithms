package Data_Structures_Algorithms.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        data = val;
        left = null;
        right = null;
    }
}

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
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(root,0,0));

        while(!queue.isEmpty()){
            Tuple current = queue.poll();
            TreeNode node = current.node;
            int col = current.col;
            int row = current.row;

            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).offer(node.data);

            if(node.left!=null)
                queue.offer(new Tuple(node.left,col-1,row+1));
            if(node.right!=null)
                queue.offer(new Tuple(node.right,col+1,row+1));
        }

        for(TreeMap<Integer, PriorityQueue<Integer>> ymap : map.values()){
            List<Integer> answer = new ArrayList<>();

            for(PriorityQueue<Integer> n : ymap.values()){
                while(!n.isEmpty()){
                    answer.add(n.poll());
                }
            }
            result.add(answer);
        }
        return result;
    }
}
