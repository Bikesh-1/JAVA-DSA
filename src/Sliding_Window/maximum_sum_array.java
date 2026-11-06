package Sliding_Window;
public class maximum_sum_array {
    public static void main(String[] args) {
        int[] arr = {10,20,1,3,-40,80,10};
        int k = 3;
        int n = arr.length;
        int maxSum  = -1;
        int i = 0 , j = k-1 , sum = 0;
        for(int a = 0; a<=k-1;a++){
            sum+=arr[a];
        }
        i++;j++;
        while(j<n){
            sum = sum - arr[i-1]+arr[j];
            maxSum = Math.max(maxSum,sum);
            i++; j++;
        }
        System.out.println(maxSum);
    }
}
