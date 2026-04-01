package leetcode;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int n = arr.length;
        for (int i = 0; i <=n-1 ; i++) {
            for (int j = i+1; j <=n-1; j++) {
                if (target == arr[i] + arr[j]){
                    System.out.println(i);
                    System.out.println(j);
                }

            }

        }
    }
}
