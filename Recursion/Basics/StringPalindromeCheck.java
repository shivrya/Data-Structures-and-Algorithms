package Data_Structures_Algorithms.Recursion.Basics;

public class StringPalindromeCheck {

    public static void main(String[] args) {
        StringPalindromeCheck solution = new StringPalindromeCheck();
        System.out.println(solution.palindromeCheck("hannah")); // Output: true
        System.out.println(solution.palindromeCheck("aabbaaa")); // Output: false
        System.out.println(solution.palindromeCheck("aba")); // Output: true
    }

    public boolean palindromeCheck(String s) {
        return isPalindromOrNot(s, 0, s.length()-1);
    }

    public boolean isPalindromOrNot(String s,int start, int end){
        if(start >= end)
            return true;
        
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        start++;
        end--;
        return isPalindromOrNot(s,start,end);

    }

}
