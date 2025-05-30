package Data_Structures_Algorithms.SlidingWindow_TwoPointer;

public class MaxScore {
        public int maxScore(int[] cardScore, int k) {
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
