package Data_Structures_Algorithms.Maths;

import java.util.ArrayList;
import java.util.Arrays;

// print all prime number from 1 to N

public class PrintAllPrimes {

    public static void main(String[] args) {
        int n = 7;
        
        /* Creating an instance of 
        Solution class */
        PrintAllPrimes sol = new PrintAllPrimes(); 
        
        // Function call to get all primes till N
        ArrayList<Integer> ans = sol.primeTillN(n);
        
        System.out.println("All primes till N are: ");
        for(int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
    
    public ArrayList<Integer> primeTillN(int n) {
            //your code goes here

            boolean[] isPrime = new boolean[n+1];
            Arrays.fill(isPrime, true);
            ArrayList<Integer> answer = new ArrayList<>();

            for(int i=2;i<=n;i++){

                if(isPrime[i]){

                    answer.add(i);

                    for(int j=i*2;j<=n;j+=i){
                        isPrime[j] = false;
                    }
                }
            }
            return answer;

        }



}
