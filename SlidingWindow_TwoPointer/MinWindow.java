package Data_Structures_Algorithms.SlidingWindow_TwoPointer;

public class MinWindow {

    public static void main(String[] args) {
        String s = "ddaaabbca";
        String t = "abc";

        String ans = minWindow(s, t);

        // Print the result
        System.out.println("Minimum length substring containing all characters from \"" + t + "\" is: " + ans);
    }

    // Brute force approach
    public static String minWindow(String s, String t) {
        int n = s.length();
        int startindex = -1;
        int minlength = Integer.MAX_VALUE;
        String output = "";


        for(int i=0;i<n;i++){
            int[] hash = new int[256];
            for(int j=0;j<t.length();j++){
                hash[t.charAt(j)]++;
            }
            int count = 0;

            for(int j=i;j<n;j++){
                if(hash[s.charAt(j)]>0){
                    count++;
                }
                hash[s.charAt(j)]--;

                if(count==t.length()){
                    if(j-i+1<minlength){
                        minlength = j-i+1;
                        startindex = i;
                    }
                break;
                }
            }
        }
        if(startindex!=-1)
            output = s.substring(startindex,startindex+minlength);
        
        return output;
    }

    // Better approach using two pointer technique
    public static String minWindow1(String s, String t) {
        String output = "";

        return output;
    }
}
