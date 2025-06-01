package Data_Structures_Algorithms.SlidingWindow_TwoPointer;

import java.util.HashSet;

public class LongestNonRepeatingSubstring {

    public static void main(String[] args) {
        String input = "cadbzabcd";
        
        int length = longestNonRepeatingSubstring(input);
        
        // Print the result
        System.out.println("Length of longest substring without repeating characters: " + length);
    }

    public static int longestNonRepeatingSubstring(String s) {
        int n = s.length();
        
        int maxlength = 0;

        // APPROACH 1:
        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
       
            for(int j=i+1;j<n;j++){
                if(set.contains(s.charAt(j))){
                    break;
                } 
                set.add(s.charAt(j));
                maxlength = Math.max(maxlength,j-i+1);
            }
        }
        return maxlength;

        // APPROACH 2:
        // for(int i=0;i<n;i++){

        //     int[] hash = new int[256];
        //     hash[s.charAt(i)] =1;
       
        //     for(int j=i+1;j<n;j++){

        //         if(hash[s.charAt(j)]==1){
        //             break;
        //         } 
        //         hash[s.charAt(j)]=1;
        //         maxlength = Math.max(maxlength,j-i+1);
        //     }
        // }
        // return maxlength;
        
    }
}
