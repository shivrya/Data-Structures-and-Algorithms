package Data_Structures_Algorithms.SlidingWindow_TwoPointer;

import java.util.*;

public class FruitsIntoBaskets {

    public static void main(String[] args) {
        int[] input = {1,2,3,2,2};  
        
        int length = totalFruits1(input);
        
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

    // OPTIMAL APPROACH
    public static int totalFruits1(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxlength = 0;

        while(right<fruits.length){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){
                map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);

                if(map.get(fruits[left])==0)
                    map.remove(fruits[left]);
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);
            right++;
        }
        return maxlength;
    }
}
