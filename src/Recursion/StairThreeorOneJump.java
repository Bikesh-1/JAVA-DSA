package Recursion;

import java.util.Scanner;

public class StairThreeorOneJump {
    public static int oddstair(int n){
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (n == 3) return 2;
        return oddstair(n-1) + oddstair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.println(oddstair(n));
    }
}
