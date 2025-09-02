package Array;

import java.util.Scanner;

public class TakingInputinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        for (int i = 0; i <= 6; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <=6 ; i++){
            System.out.println(arr[i]+" ");

        }

    }
}
