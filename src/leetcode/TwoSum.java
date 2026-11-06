package leetcode;

import java.util.*;

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
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        int j = 0,k = 0;
        while(j<pos.size() && k<neg.size()){
            list.add(pos.get(j));
            j++;
            list.add(neg.get(k));
            k++;
        }
        int[] ans = new int[list.size()];
        for(int l = 0; l < list.size(); l++){
            ans[l] = list.get(l);
        }

        return ans;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i<n ; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = i+1; j<n ; j++){
                int left = j+1;
                int right = n-1;
                while(left<right){
                    int sum = nums[i]+nums[j] + nums[left] + nums[right];
                    if(sum>target){
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }
    public boolean anagramStrings(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n!=m) return false;
        else{
          if (s.contains(t)) return true;
          else return false;
        }
    }
    public boolean validPalindrome(String s) {
        List<Integer> list = new ArrayList<>();
        int m = list.size();
        int n = s.length();
        int i = 0;
        int j = n-1;
        int count = 1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else if(count!=0 && (s.charAt(i)==s.charAt(j-1))){
                j--;
                count--;
            } else if (count!=0 && (s.charAt(i+1)==s.charAt(j))) {
                    i++;
                    count--;
            }
        }
        if(i==j&& count == 0 || count == 1) return true;
        else return false;
    }
    public int minMergedInteger(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        int min = Integer.MAX_VALUE;
        while(j<n){
            String ans = "";
            ans += nums[i];
            ans += nums[j];
            int num = Integer.parseInt(ans);
            min = Math.min(min,num);
            i++;
            j++;
        }
        return min;
    }

    public String largestNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for(int i  = n-1 ; i>=n-1 ; i--){
            sb.append(nums[i]);
        }
        return sb.toString();
    }
}
