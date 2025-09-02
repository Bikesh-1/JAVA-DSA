//pattern is
//        * * * * *
//        * * * * *
//        * * * * *
//        * * * * *

package PatternPrinting;

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number the row :- ");
        int m = sc.nextInt();



        for (int i = 1; i <= m; i++) {// row mltb kitna line hoga
            for (int j = 1; j <= m; j++) { // columns mtlb kitns start hoga
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}






