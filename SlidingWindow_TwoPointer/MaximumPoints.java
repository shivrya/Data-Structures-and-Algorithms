package Data_Structures_Algorithms.SlidingWindow_TwoPointer;

public class MaximumPoints {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        
        // Create an instance of the Solution class
        MaximumPoints sol = new MaximumPoints();

        int result = sol.maxScore(nums, 3);

        // Output the maximum score
        System.out.println("The maximum score is:");
        System.out.println(result);
    }

    public int maxScore(int[] nums, int k){

        int leftsum = 0;
        int right = nums.length -1;

        for(int i=0;i<k;i++){
            leftsum += nums[i];
        }
        int maxScore = leftsum;

        for(int i=k-1;i>=0;i--){
            leftsum -= nums[i];
            leftsum += nums[right];
            right--;
            maxScore = Math.max(leftsum,maxScore);
        }
        return maxScore;
    }
}
