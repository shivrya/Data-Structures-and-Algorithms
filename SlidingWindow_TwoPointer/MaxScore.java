package Data_Structures_Algorithms.SlidingWindow_TwoPointer;

public class MaxScore {

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6};

            int result = maxScore(nums, 3);

            // Output the maximum score
            System.out.println("The maximum score is:");
            System.out.println(result);
        }
        public static int maxScore(int[] cardScore, int k) {
            int leftsum = 0;
            int maxsum = 0;
            int n = cardScore.length;
            int index = n - 1;
    
            for(int i=0;i<k;i++){
                leftsum+=cardScore[i];
                maxsum = Math.max(leftsum,maxsum);
            }
    
            for(int i=k-1;i>=0;i--){
                leftsum += cardScore[index];
                leftsum -= cardScore[i];
                maxsum = Math.max(maxsum,leftsum);
                index--;
            }
            return maxsum;
        }
}
