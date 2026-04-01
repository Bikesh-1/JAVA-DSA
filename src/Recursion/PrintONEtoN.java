package Recursion;

import java.util.Scanner;

public class PrintONEtoN {
    //static int n;  //global varialbe sab place par access hoga
    public static void numb(int x ,int n){
        if(x>n) return;
        System.out.println(x);
        numb(x+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :- ");
        int n = sc.nextInt();
        numb(1,n);
    }
}
