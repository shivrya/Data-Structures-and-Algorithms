package Data_Structures_Algorithms.SlidingWindow_TwoPointer;

public class MaxConsecutiveOnes_Part3 {
    public static void main(String[] args) {
        int[] input = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 3;
        
        int length = longestOnes_2(input, k);
        
        // Print the result
        System.out.println("Length of longest substring with at most " + k + " zeros: " + length);
    }

    public static int longestOnes(int[] nums, int k) {
        //your code goes here

        int n = nums.length;
        int maxlength = 0;

        for(int i=0;i<n;i++){
            int zero = 0;

            for(int j=i;j<n;j++){
                if(nums[j]==0)
                    zero++;
                
                if(zero>k)
                    break;

                maxlength = Math.max(maxlength,j-i+1);
            }
        }
        return maxlength;   
    }

    // Better approach using 2 Pointers
    public static int longestOnes_2(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int zeroes = 0;
        int maxlength = 0;

        for(int right=0;right<n;right++){
            if(nums[right]==0)
                zeroes++;
            
            while(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
