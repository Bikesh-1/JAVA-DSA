package leetcode;

public class Leetcode_283 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12,0};
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i]==0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
