package Data_Structures_Algorithms.Greedy_Algorithm.Scheduling_and_Interval_Problems;

import java.util.Arrays;

public class ShortestJobFirst {

    public long solve(int[] bt) {
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
