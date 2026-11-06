package HashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class BasicMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Bikesh",37);

        map.put("Dixit",19);
        map.put("Aman",07);
        map.put("Ankit",04);
        System.out.println(map);
        map.put("Bikesh",38);
        System.out.println(map);
        map.put("Biku",07);
        System.out.println(map);
        map.remove("Biku");
        System.out.println(map);
        map.remove("ram");
        System.out.println(map);
    }
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = {-1,-1};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                int j = map.get(rem);
                ans[0] = i;
                ans[1] = j;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }

    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            if (map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Integer freq : map.values()){
            set.add(freq);
            if(set.contains(freq)) return false;
            else return true;
        }
        return true;
    }

    public ArrayList<Integer> getMinMax(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int minVal = Math.min(min,arr[i]);
            int maxVal = Math.max(max,arr[i]);
            list.add(minVal);
            list.add(maxVal);
        }
        return list;
    }

    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i<n ; i++){
            set.add(nums[i]);
        }
        return set.size();
    }

    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length;i++){
            int ele = arr[i]%k;
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        for(int key : map.keySet()){
            int rem = k - key;
            if(!map.containsKey(rem)) return false;
            int keyFreq = map.get(key);
            int remFreq = map.get(rem);
            if(keyFreq!=remFreq) return false;
        }
        return true;
    }

    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer> fmap = new HashMap<>();
        HashMap<Character,Integer> smap = new HashMap<>();
        for(int i = 0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!fmap.containsKey(ch)) fmap.put(ch,i);
            smap.put(ch,i);
        }
        int count = 0;
        for(char ch: fmap.keySet()){
            int firstIndex = fmap.get(ch);
            int lastIndex = smap.get(ch);
            HashSet<Character> set = new HashSet<>();
            for(int i = firstIndex+1; i<= lastIndex-1;i++){
                set.add(s.charAt(i));
            }
            count += set.size();
        }
        return count;
    }
}
