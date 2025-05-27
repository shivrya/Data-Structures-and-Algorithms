package Data_Structures_Algorithms.Patterns;

public class Pattern1 {
    /* 
       *****
       *****
       *****
       *****
       *****  
    */


    public static void main(String[] args) {
        int N = 5;

        pattern1(N);
    }

    public static void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
