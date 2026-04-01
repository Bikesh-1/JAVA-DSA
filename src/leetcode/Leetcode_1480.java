package leetcode;

public class Leetcode_1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int j = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(i!=0){
                arr[i] = arr[i] + arr[j];
                j++;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
