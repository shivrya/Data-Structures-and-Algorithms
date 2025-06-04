package Data_Structures_Algorithms.SlidingWindow_TwoPointer;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s = "AABABBA";
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

            int maxlength = 0;


            return maxlength;


            
        }
}
