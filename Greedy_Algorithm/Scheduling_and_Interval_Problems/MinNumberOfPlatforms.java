package Data_Structures_Algorithms.Greedy_Algorithm.Scheduling_and_Interval_Problems;

public class MinNumberOfPlatforms {

        // Function to find minimum number of platforms required
        public int findPlatform(int[] Arrival, int[] Departure) {
            int n = Arrival.length;
    
            // To store the result
            int ans = 1;
    
            // Iterate on the trains platforms
            for (int i = 0; i < n; i++) {
                
                int count = 1;
    
                // Iterate on all the trains 
                for (int j = 0; j < n; j++) {
                    // Check with other trains
                    if (i != j) {
    
                        // Check for the overlapping trains 
                        if ((Arrival[i] >= Arrival[j] && Departure[j] >= Arrival[i])) {
                            // Increment count
                            count++;
                        }
    
                        // Update the minimum platforms needed
                        ans = Math.max(ans, count);
                    }
                }
            }
    
            // Return number of platforms
            return ans;
        }
}
