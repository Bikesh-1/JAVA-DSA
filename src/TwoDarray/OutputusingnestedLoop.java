package TwoDarray;

import java.util.Scanner;

public class OutputusingnestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[2][3];
        //length
        int m = arr.length; // row
        int n = arr[0].length; //column

        //input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
