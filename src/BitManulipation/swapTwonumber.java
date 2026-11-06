package BitManulipation;

import java.util.*;

public class swapTwonumber {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        // a = a-b;
        //b = a-b;
        //a = a-b;
        System.out.println(a+" "+b);
    }
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            int freq = 0;
            if(map.containsKey(ele-1) ){
                map.put(ele,freq+1);
            }else{
                map.put(ele,0);
            }
        }
        int maxfreq = 0;
        for (int freq : map.values()) {
            maxfreq = Math.max(maxfreq, freq);
        }
        return maxfreq;
    }

    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : nums){
            ans.add(ele);
        }
        while (!ans.isEmpty()){
            list.add(ans.poll());
        }
        int[] arr = new int[n];
        for(int i = 0; i< n ; i++){
            arr[i] = list.get(i);
        }
        return arr;

    }
}
