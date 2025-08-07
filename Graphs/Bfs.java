package Data_Structures_Algorithms.Graphs;

import java.util.*;

public class Bfs {

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

        List<Integer> bfs = sol.bfsOfGraph(V, adj);

        System.out.println("The BFS traversal of the given graph is: " + bfs);
    }

    public List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i])
                bfs(i,adj,visited,result);
        }
        return result;
    }

    public void bfs(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> result){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;

        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            result.add(currentNode);

            for(int neighbor : adj.get(currentNode)){
                if(!visited[neighbor]){
                    queue.offer(neighbor);
                     visited[neighbor] = true;
                }
            }
        }
    }


}
