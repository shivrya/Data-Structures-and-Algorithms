package Data_Structures_Algorithms.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dfs {

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).addAll(Arrays.asList(2, 3, 1));
        adj.get(1).add(0);
        adj.get(2).addAll(Arrays.asList(0, 4));
        adj.get(3).add(0);
        adj.get(4).add(2);

        Bfs sol = new Bfs();

        List<Integer> dfs = sol.bfsOfGraph(V, adj);

        System.out.println("The DFS traversal of the given graph is: " + dfs);
    }



}
