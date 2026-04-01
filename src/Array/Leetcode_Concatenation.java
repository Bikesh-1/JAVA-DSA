package Array;

public class Leetcode_Concatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int n = nums.length;
        int[] ans =new int[2*n];
        for (int i = 0; i <=n-1; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        
    }
}
