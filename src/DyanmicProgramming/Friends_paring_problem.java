package DyanmicProgramming;

import java.util.*;

public class Friends_paring_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pair(n,dp));
    }
    private static int pair(int n,int[] dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=  pair(n-1,dp) + (n-1)*pair(n-2,dp);
    }
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        s = s.trim();
        String[] arr = s.split(" ");
        for(int i = arr.length-1 ; i>=0 ; i--){
            ans.append(arr[i]+" ");
        }
        return ans.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        String s = strs[0];
        String t = strs[n-1];
        String ans = "";
        
        int m = s.length();
        int o = t.length();
        int i = 0 ;
        if(m>o){
            while(i<o){
                if(s.charAt(i)==t.charAt(i)){
                    ans += s.charAt(i);
                }
                i++;
            }
        }
        if(m<o){
            while(i<m){
                if(s.charAt(i)==t.charAt(i)){
                    ans += s.charAt(i);
                }
                i++;
            }
        }
        return ans;
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int count = 0;
        int n = triangle.size();
        for(int i = 0 ; i<n ; i++){
            int m = triangle.get(i).size();
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j<m ; j++){
                min = Math.min(triangle.get(i).get(j),min);
                count+=min;
            }
        }
        return count;
    }
    public int firstStableIndex(int[] nums, int k) {
        ArrayList<Integer> minList = new ArrayList<>();
        ArrayList<Integer> maxList = new ArrayList<>();
        int index = 0;
        maxList.add(nums[0]);
        for (int ele : nums){
            minList.add(ele);
        }
        int i = 1;
        while(i<minList.size()){
            int max = Collections.max(maxList);
            int min = Collections.min(minList);
            if(max-min<=k){
                return i;
            }else{
                maxList.add(minList.get(i));
                minList.remove(i);
                i++;
            }
            i++;
        }
        return -1;
    }
}
