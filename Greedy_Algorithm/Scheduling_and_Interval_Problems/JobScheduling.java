package Data_Structures_Algorithms.Greedy_Algorithm.Scheduling_and_Interval_Problems;

import java.util.Arrays;

public class JobScheduling {


    public static void main(String[] args) {
        int[][] jobs = {{1, 4, 20}, {2, 1, 10}, {3, 1, 40}, {4, 1, 30}};

        int[] result = JobScheduling(jobs);

        // Output the result
        System.out.println("Number of Jobs: " + result[0]);
        System.out.println("Maximum Profit: " + result[1]);
    }

    public static int[] JobScheduling(int[][] Jobs) {
        // Arrays.sort(Jobs, (a, b) -> b[2] - a[2]);
        
        int count = 0;
        int profit = 0;
        int n = Jobs.length;
        int maxDeadline = -1;

        for(int[] deadline : Jobs){
            maxDeadline = Math.max(maxDeadline,deadline[1]);
        }

        int[] hash = new int[maxDeadline+1];
        Arrays.fill(hash,-1);

        for(int i=0;i<n;i++){
            for(int j=Jobs[i][1];j>0;j--){
                if(hash[j]==-1){
                    count++;
                    profit += Jobs[i][2];
                    hash[j] = Jobs[i][0];
                    break;
                }
            }
        }
        return new int[]{count,profit};
    }

}
