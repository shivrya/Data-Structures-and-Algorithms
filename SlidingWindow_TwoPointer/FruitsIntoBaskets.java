package Data_Structures_Algorithms.SlidingWindow_TwoPointer;

import java.util.*;

public class FruitsIntoBaskets {

    public static void main(String[] args) {
        int[] input = {1,2,3,2,2};  
        
        int length = totalFruits(input);
        
        // Print the result
        System.out.println("Maximum fruits the basket can have: " + length);
    }

    // BRUTE FORCE
    public static int totalFruits(int[] fruits) {
        int maxlength = 0;
        int n = fruits.length;

        for(int left=0;left<n;left++){
                HashSet<Integer> set = new HashSet<>();
    
                for(int right=left;right<n;right++){
    
                    set.add(fruits[right]);
    
                    if(set.size()>2){
                            break;
                    }
                    if(set.size()==2)
                        maxlength = Math.max(maxlength,right-left+1);
                }
            }
        return maxlength;
    }

    
}
