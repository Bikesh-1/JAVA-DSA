package Array.Questions;

public class MergeSortedarrayM_2 {
    public static void main(String[] args) {
        int [] a = {10,20,30,40};
        int [] b = {50,60,70,80,90,100};
        int n = a.length;
        int m = b.length;
        int [] c = new int[m+n];
        int i = n-1;
        int j = m-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if (a[i]>=b[j]){
                c[k]=a[i];
                i--;
                k--;
            } else if (a[i]<=b[j]) {
                c[k] = b[j];
                j--;
                k--;
            }
        }
        if(i== 0){
            while(j<m){
                c[k] = b[j];
                j--;k--;
            }
        }
        if(j== 0){
            while(i<n){
                c[k] = a[i];
                i--; k--;
            }
        }
        for (int ele : c){
            System.out.print(ele+" ");
        }
    }
}
