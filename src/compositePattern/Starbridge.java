package compositePattern;

import java.util.Scanner;

public class Starbridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:- ");
        int n = sc.nextInt();
        for (int i = 0; i < 2*n-1; i++) {
            System.out.print("*" +" ");
        }
        System.out.println();
        int m = n - 1;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m+1-i; j++) {
                System.out.print("*" +" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print(" " +" ");
            }
            for (int j = 1; j <= m+1-i; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }

    }
}
