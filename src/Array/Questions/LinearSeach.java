package Array.Questions;

import java.util.Scanner;

public class LinearSeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x:-");
        int x = sc.nextInt();
        System.out.println("Enter the array size:-");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        // solution
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (arr[i]==x){
                flag = true;
                break;
            }
        }
        if (flag==true) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
