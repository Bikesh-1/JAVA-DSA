package leetcode;

public class leetcode_121 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        for (int i = n-1; i >= 0 ; i--) {
            if(arr[i]<9){
                arr[i]++;
                break;
            }
            arr[i] = 0;
        }

        System.out.println();
    }
}
