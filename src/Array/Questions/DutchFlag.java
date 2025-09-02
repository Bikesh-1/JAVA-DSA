package Array.Questions;

public class DutchFlag {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,1,2,1,2,0,0};
        int  n = arr.length;
        int i = 0 , j = 0 , k = n-1;
        while (j<=k){
            if(arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            } else if (arr[j]==1) {
                j++;
            } else if (arr[j] == 2) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
