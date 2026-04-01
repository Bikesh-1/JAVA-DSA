package Recursion.Homework;

public class PrintIndex {
    public static int print(int i,int[] arr,int target){
        if(i== arr.length) return -1;
        if(target==arr[i]) return i;
//        System.out.print(i+" ");
        return print(i+1,arr,target);
    }
    public static void main(String[] args) {
        int[] arr = {4,7,3,8,7,6,7,6,1,2};
        System.out.println(print(0,arr,10));
    }
}
