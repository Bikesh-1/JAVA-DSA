package leetcode;

import java.util.Arrays;

public class leetcode_977 {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,10};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(arr[i]*arr[i]);
            
            System.out.print(arr[i]+" ");

        }
        Arrays.sort(arr);
        System.out.println();
    }
}
