package heap;

import java.util.*;

public class kthSmallestElement {
//    public static void main(String[] args) {
//        int[] arr = {10,2,3,8,-6,-2,9,-12};
//        int k = 4;
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        for(int ele : arr){
//            pq.add(ele);
//            if(pq.size()>k) pq.remove();
//        }
//        System.out.println(pq.peek());
//    }
//    public class Pair{
//        int ele;
//        int diff;
//        Pair(int ele , int diff){
//            this.ele = ele;
//            this.diff = diff;
//        }
//    }

    public class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele , int freq){
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair p){
            return this.freq -p.freq;
        }
    }
    public void wiggleSort(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int[] ans = new int[n];
        int i = 1;
        int j = n-1;
        while(i<n){
            ans[i] = arr[j];
            i+=2;
            j--;
        }
        i=0;
        while(i<n-1 && j!=0){
            ans[i]=arr[j];
            i+=2;
            j--;
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        while(left<=right && top<=bottom){
            list.add(matrix[top][left]);
            left++;
            list.add(matrix[top][left]);
            top++;
            list.add(matrix[top][right]);
            right--;
            list.add(matrix[bottom][right]);
            bottom--;
        }
        return list;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i = 0; i<n ; i++){
            int maxArray = candies[i]+extraCandies;
            for(int j = 0 ; j<n ; j++){
                if(i==j) continue;
                if(maxArray>candies[j]){
                    list.add(true);
                }else{
                    list.add(false);
                }
            }
        }
        return list;
    }
}


