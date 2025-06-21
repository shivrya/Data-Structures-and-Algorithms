package Data_Structures_Algorithms.Recursion.Basics;

public class SumOfFirstNNumbers {
    int count = 1;

    public static void main(String[] args) {
        SumOfFirstNNumbers sum = new SumOfFirstNNumbers();
        int total = sum.SumOfFirstNNumbers(10);
        System.out.println(total);
    }

    public int SumOfFirstNNumbers(int N){
        if(0 == N)
            return 0;

        return N + SumOfFirstNNumbers(N-1);
        
    }

}
