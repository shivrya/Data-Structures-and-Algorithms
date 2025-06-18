package Data_Structures_Algorithms.Stack_Queue.Monotonic_Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 3, 2, 4};
        
        /* Creating an instance of 
        Solution class */
        NextGreatestElement sol = new NextGreatestElement(); 
        
        /* Function call to find the next greater element
        for each element in the array */
        int[] ans = sol.nextLargerElement(arr);
        
        System.out.println("The next greater elements are: ");
        for(int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }


    // Brute Force approach
    public int[] nextLargerElement(int[] arr) {
        int[] result = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                    if(arr[j]>arr[i]){
                        result[i]=arr[j];
                        break;
                    }else{
                        result[i] = -1;
                    }
                }
            }
        return result;
    }

}
