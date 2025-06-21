package Data_Structures_Algorithms.Recursion.Basics;

public class Factorial {

    public static void main(String[] args) {
        Factorial solution = new Factorial();
        int N = 5; // Example input
        System.out.println("Factorial of " + N + " is " + solution.factorial(N));
    }
    public int factorial(int N){
        if(N==0||N==1)
            return 1;
        
        return N* factorial(N-1);

    }
}
