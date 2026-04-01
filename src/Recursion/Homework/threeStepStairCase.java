package Recursion.Homework;
import java.util.Scanner;
public class threeStepStairCase {
    public static int stair(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        return stair(n-1) + stair(n-2) + stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:- ");
        int n = sc.nextInt();
        System.out.println(stair(n));
    }
}
