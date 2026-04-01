package Recursion.Homework;
import java.util.Scanner;
public class power {
    public static boolean powerofTwo(int n){
        if(n==1) return true;
        if(n<=0 || n%2!=0) return false;
        return powerofTwo(n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:-");
        int n = sc.nextInt();
        System.out.println(powerofTwo(n));
    }
}
