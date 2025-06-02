package Data_Structures_Algorithms.Patterns;

public class Pattern2 {

    // *
    // **
    // ***
    // ****
    // *****

    public static void main(String[] args) {
        int N = 5;
        pattern2(N);
    }

    public static void pattern2(int n) {

        for(int i=1;i<=n;i++){
            
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
