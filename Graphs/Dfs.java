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

    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> result = new ArrayList<>(V);
        boolean[] visited = new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i])
                dfs(i,adj,result,visited);
        }
        return result;
    }

    public void dfs(int node, List<List<Integer>> adj, List<Integer> result, boolean[] visited){
        result.add(node);
        visited[node] = true;

        for(int neighbor : adj.get(node)){
            if(!visited[neighbor])
                dfs(neighbor,adj,result,visited);
        }
    }
}
