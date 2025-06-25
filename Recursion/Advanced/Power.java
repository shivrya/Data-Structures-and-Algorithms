package Data_Structures_Algorithms.Recursion.Advanced;

public class Power {

    public static void main(String[] args) {
        Power sol = new Power();
        double x = 2.0;
        int n = 10;

        // Calculate x raised to n
        double result = sol.myPow(x, n);

        // Print the result
        System.out.println(x + "^" + n + " = " + result);
    }

    public double myPow(double x, int n){
        if(n==0)
            return 1.0;
        
        if(n < 0){
            x= 1/x;
            n *= -1;
        }

        if(n%2==0)
            myPow(x*x,n/2);
        

        return x * myPow(x,--n);
    }

}
