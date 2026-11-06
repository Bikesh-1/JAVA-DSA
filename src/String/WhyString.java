package String;

import java.util.*;

public class WhyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        if(N*K <= P) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i < n ; i++){
            ans.add(i);
        }
        for(int i = 0 ; i < n ; i++){
            if(ans.contains(nums[i])){
                ans.remove(nums[i]);
            }
        }
        return ans;
    }
    public int lengthOfLastWord(String s) {
        int n =  s.length();
        int i = n-1;
        int count = 0;
        if(s.charAt(n-1)==' '){
            i--;
        }
        while (i>=0){
             if (s.charAt(i)!=' ' && s.charAt(i-1)!=' ') {
                count++;
                i--;
                break;
            }
        }
        return count;
    }
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        int[] multiple = new int[n];
        int count = 0;
        for(int i = 1 ; i <= n ; i++){
            multiple[i-1] = k*i;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        for(int i = 0 ; i<n ; i++){
            if (!set.contains(multiple[i])){
                count += multiple[i];
                break;
            }
        }
        return count;
    }
}


