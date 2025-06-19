package Data_Structures_Algorithms.Stack_Queue.FAQ;

public class Trapping_Rainwater {

    public static void main(String[] args) {
        int[] heights = {4, 2, 0, 3, 2, 5};
        
        // Creating an instance of Solution class
        Trapping_Rainwater sol = new Trapping_Rainwater();
        
        // Function call to get the trapped water
        int ans = sol.trap(heights);
        
        System.out.println("The trapped rainwater is: " + ans);
    }

    public int trap(int[] height) {

        int total = 0;
        int leftmax = 0;
        int rightmax = 0;
        int left = 0;
        int right = height.length - 1;

        while(left<right){
            if(height[left] < height[right]){
                if(height[left]<leftmax){
                    total += leftmax - height[left];
                }else{
                    leftmax = height[left];
                }
                left = left + 1;
            }else{
                if(height[right]<rightmax){
                    total += rightmax - height[right];
                }else{
                    rightmax = height[right];
                }
                right = right-1;
            }
        }
        return total;
    }

}
