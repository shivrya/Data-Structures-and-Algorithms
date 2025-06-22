package Data_Structures_Algorithms.Recursion.Basics;

public class PrimeOrNot {

    public static void main(String[] args) {
        PrimeOrNot solution = new PrimeOrNot();
        int num = 8; 
        boolean result = solution.checkPrime(num); 
        System.out.println(result); 
    }

    public boolean checkPrime(int num) {

        if(num==1)
            return false;
        if(num==2)
            return true;
        
        return isPrime(num, num/2);
    }

    public boolean isPrime(int num, int divisor){
        boolean isPrime = false;

        if(divisor == 1)
            return true;
        if(num%divisor==0)
            return false;
        
        return isPrime(num,--divisor);
    }
}
