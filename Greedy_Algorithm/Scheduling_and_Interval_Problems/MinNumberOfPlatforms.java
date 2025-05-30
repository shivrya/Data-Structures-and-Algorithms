package Data_Structures_Algorithms.Greedy_Algorithm.Scheduling_and_Interval_Problems;

public class MinNumberOfPlatforms {

        public static void main(String[] args) {
            int[] arr = {900, 945, 955, 1100, 1500, 1800};
            int[] dep = {920, 1200, 1130, 1150, 1900, 2000};

            // Function call to find minimum number of platforms required
            int ans = findPlatform(arr, dep);

            System.out.println("Minimum number of Platforms required: " + ans);
        }

        // Function to find minimum number of platforms required
        public static int findPlatform(int[] Arrival, int[] Departure) {
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
