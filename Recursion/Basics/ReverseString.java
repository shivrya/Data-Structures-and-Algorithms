package Data_Structures_Algorithms.Recursion.Basics;

import java.util.ArrayList;

    public class ReverseString {
        public static void main(String[] args) {
            ReverseString solution = new ReverseString();
            ArrayList<Character> s = new ArrayList<>();
            s.add('l');
            s.add('l');
            s.add('l');
            s.add('l');
            s.add('l');
            
            // Function call to reverse the given string
            ArrayList<Character> reversed = solution.reverseString(s);
            System.out.println(reversed);
        }

        public ArrayList<Character> reverseString(ArrayList<Character> s){
            newReverseString(s,0,s.size()-1);
            return s;
            
        }
        public void newReverseString(ArrayList<Character> s, int start, int end){
            if(start >= end)
                return;
            
            char tmp = s.get(start);
            s.set(start,s.get(end));
            s.set(end,tmp);
            start++;
            end--;

            newReverseString(s, start, end);


        }

}
