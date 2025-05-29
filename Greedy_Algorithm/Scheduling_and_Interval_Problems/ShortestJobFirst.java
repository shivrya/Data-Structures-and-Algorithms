package Data_Structures_Algorithms.Greedy_Algorithm.Scheduling_and_Interval_Problems;

import java.util.Arrays;

public class ShortestJobFirst {

    public static void main(String[] args) {
        int[] jobs = {1, 2, 3, 4};

        System.out.print("Array Representing Job Durations: ");
        for (int job : jobs) {
            System.out.print(job + " ");
        }
        System.out.println();

        long ans = solve(jobs);
        System.out.println("Total waiting time: " + ans);
    }

    public static long solve(int[] bt) {
        Arrays.sort(bt);
        long waitTime = 0;
        int processes = bt.length -1;

        for(int i=0;i<bt.length;i++){
            waitTime += processes * bt[i];
            processes--;
        }
        return waitTime/bt.length;
    }

}
