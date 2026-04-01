package Recursion;
public class TransArrayUsingRec {
    public static void print(int i , int[] arr){
        if(i==0) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr = {4,7,3,8,7,6,7,6,1,2};
        print(0,arr);
    }
}
