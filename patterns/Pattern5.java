package Data_Structures_Algorithms.Patterns;


// *****
// ****
// ***
// **
// *

public class Pattern5 {

    public static void main(String[] args){
        int N = 5;

        pattern5(N);

    }

    public static void pattern5(int n){

        for(int i=n;i>0;i--){

            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    

}
