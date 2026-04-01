package Recursion;

import java.util.Scanner;

public class A_raisedto_b {
    public static int power(int a,int b ){
        if (b==0) return 1;
        int ans = (a)*power(a,b-1);
        return ans;
    }
//    public static int power2(int a,int b ){
//        if (b==0) return 1;
//        int ans = power2(a,b/2);
//        if(b%2==0) return ans * ans;
//        else return ans * ans * a;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :- ");
        int a = sc.nextInt();
        System.out.print("Enter b:- ");
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
}
