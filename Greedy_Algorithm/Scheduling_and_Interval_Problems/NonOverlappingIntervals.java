package Data_Structures_Algorithms.Greedy_Algorithm.Scheduling_and_Interval_Problems;

import java.util.Arrays;

public class NonOverlappingIntervals {

    public static void main(String[] args) {
        NonOverlappingIntervals obj = new NonOverlappingIntervals();
        int[][] intervals = {{0, 5}, {3, 4}, {1, 2}, {5, 9}, {7, 9}};
        
        for (int i = 0; i < intervals.length; i++) {
            System.out.println("Interval " + (i + 1) + " Start: " + intervals[i][0] + " End: " + intervals[i][1]);
        }
        
        int ans = obj.MaximumNonOverlappingIntervals(intervals);
        System.out.println("Maximum Non-Overlapping Intervals: " + ans);
    }

    public int MaximumNonOverlappingIntervals(int[][] Intervals) {
        //your code goes here

        Arrays.sort(Intervals, NonOverlappingIntervals::comp);

        int meeting = 1;
        int n = Intervals.length;
        int lastEndTime = Intervals[0][1];

        for(int i=1;i<n;i++){
            if(Intervals[i][0]>= lastEndTime){
                meeting++;
                lastEndTime = Intervals[i][1];
            }

        }
        return  n - meeting;
    }

    public static int comp(int[] val1, int[] val2) {
        // Compare the ending times of the intervals
        return Integer.compare(val1[1], val2[1]);
    }

}
