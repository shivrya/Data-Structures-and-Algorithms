package Data_Structures_Algorithms.Graphs;

import java.util.Arrays;
import java.util.List;

public class ConnectedComponents {

    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> edges = Arrays.asList(
            Arrays.asList(0, 1),
            Arrays.asList(1, 2)
        );

        /* Creating an instance of 
        Solution class */
        ConnectedComponents sol = new ConnectedComponents();

        /* Function call to find the number of 
        connected components in the given graph */
        // int ans = sol.findNumberOfComponent(V, edges);

        // System.out.println("The number of components in the given graph is: " + ans);
    }

}
