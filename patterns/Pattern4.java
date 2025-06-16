package Data_Structures_Algorithms.Patterns;

public class Pattern4 {

    // 1
    // 22
    // 333
    // 4444
    // 55555

    public static void main(String[] args) {

        int N = 5;

        pattern4(N);
       
    }

    public static void pattern4(int n){

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println(" ");

        }

    }

}
