package Data_Structures_Algorithms.Greedy_Algorithm.Scheduling_and_Interval_Problems;

import java.util.Arrays;

public class MaxMeetings {
        public static void main(String[] args) {
            // Start and end times of the meetings
            int[] start = {1, 3, 0, 5, 8, 5};
            int[] end = {2, 4, 6, 7, 9, 9};
            // Get the maximum number of meetings that can be held
            int maxMeetings = maxMeetings(start, end);
            // Output the maximum number of meetings
            System.out.println("Maximum number of meetings: " + maxMeetings);
        }

        public static int maxMeetings(int[] start, int[] end) {
           //your code goes here
           int[][] combined = new int[start.length][2];
    
           for(int i=0;i<start.length;i++){
                combined[i][0] = start[i];
                combined[i][1] = end[i];
           }
    
           Arrays.sort(combined, (a, b) -> a[1] - b[1]);
    
            int meeting = 1;
            int lastEndTime = combined[0][1];
    
            for(int i=1;i<start.length;i++){
                if(combined[i][0]>lastEndTime){
                    meeting++;
                    lastEndTime = combined[i][1];
                }
            }
            return meeting; 
        }
}
