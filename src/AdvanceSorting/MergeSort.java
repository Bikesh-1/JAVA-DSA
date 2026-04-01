package AdvanceSorting;
public class MergeSort {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merging(int[] a,int[] b,int[] c){
        int i = 0, j= 0, k=0;
        while(i<a.length && j<b.length){
            if (a[i]<=b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(j<b.length) c[k++] = b[j++];
        while(i<a.length) c[k++] = a[i++];
    }
    public static void merge(int[] arr){
        int n = arr.length;
        if(n==1) return;
        // create two arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // copy posting
        for (int i = 0; i <n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i <n-n/2; i++) {
            b[i] = arr[i+n/2];
        }
        //magic
        merge(a);
        merge(b);
        //merge these a and b
        merging(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {80,30,70,20,50,60,10,40};
        print(arr);
        merge(arr);
        print(arr);
    }
}
