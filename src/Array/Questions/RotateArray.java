package Array.Questions;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rotation:-");
        int k = sc.nextInt();

        int [] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        k = k%n;
        for (int i = 0; i <n-k-1; i++) {
            int temp = arr[i];
            arr[i] = arr[n-k-1];
            arr[n-k-1] = temp;
        }
        for (int i = n-k; i <n-1; i++) {
            int temp = arr[n-k];
            arr[n-k] = arr[n-1];
            arr[n-1] = temp;
        }
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
