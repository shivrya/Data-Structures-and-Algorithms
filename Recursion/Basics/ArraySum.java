package Data_Structures_Algorithms.Recursion.Basics;

public class ArraySum {

    public static void main(String[] args) {
        ArraySum solution = new ArraySum();
        int[] nums = {1, 2, 3, 100}; 
        int result = solution.arraySum(nums, nums.length); 
        System.out.println(result); 
    }

    public int arraySum(int[] num, int length){
        if(length==0)
            return 0;
        
        return num[length-1] + arraySum(num, length-1);
        
    }

}
