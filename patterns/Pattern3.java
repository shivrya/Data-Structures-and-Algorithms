package Data_Structures_Algorithms.Patterns;

public class Pattern3 {


    // *
    // **
    // ***
    // ****
    // *****

    public static void pattern3(int n) {
        
        // Outer loop which will loop for the rows.
        for (int i = 1; i <= n; i++) {
            
            // Inner loop which loops for the columns.
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            /* As soon as stars for each iteration are printed,
             move to the next row and give a line break */
            System.out.println();
        }
    }

}
