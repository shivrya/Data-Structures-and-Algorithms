package Data_Structures_Algorithms.SlidingWindow_TwoPointer;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s = "BAABAABBBAAA";
        int k = 2;

        int length = characterReplacement(s, k);

        // Print the result
        System.out.println("Maximum length of substring with at most " + k + " characters replaced: " + length);
    }
    
    public static int characterReplacement(String s, int k) {

            // sum of frequency of all other frequncies apart from the largest
            // character should not exceed k

            // maximum subarray where there are at max k number of elements apart from
            // the largest occuring element.

            // it could one other character occuring k+1 times
            // it could be difference character occuring k+1 times

            int maxfrequency = 0;
            int left = 0;
            int right = 0;
            int n = s.length();
            int[] hash = new int[26];
            int maxlength = 0;

            while(right<n){
                hash[s.charAt(right)-'A']++;
                maxfrequency = Math.max(maxfrequency,hash[s.charAt(right)-'A']);
                int changesrequired = (right-left+1) - maxfrequency;
    
                while(changesrequired > k){
                    hash[s.charAt(left)-'A']--;
                    left++;
                    for(int i=0;i<26;i++){
                        if(hash[i]>maxfrequency)
                            maxfrequency = hash[i];
                    }
                    changesrequired = (right-left+1) - maxfrequency;
                }
                maxlength = Math.max(maxlength,right-left+1);
                right++;
            }
            return maxlength;
        }
}
