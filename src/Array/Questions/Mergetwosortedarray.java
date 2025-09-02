package Array.Questions;

public class Mergetwosortedarray {
    public static void main(String[] args) {
        int [] a = {10,40,50,70};
        int [] b = {20,30,60,80,90,100};
        int i = 0;
        int j = 0;
        int k = 0;
        int n = a.length;
        int m = b.length;
        int[] c = new int[n + m];
        while (i < n && j < m){
            if (a[i]<=b[j]){
                c[k] = a[i];
                i++ ;
                k++;
            } else if (a[i]>=b[j]) {
                c[k] = b[j];
                k++;
                j++;

            }

        }
        if(i== a.length){
            while(j<b.length){
                c[k] = b[j];
                j++;k++;
            }
        }
        if(j== b.length){
            while(i<a.length){
                c[k] = a[i];
                i++; k++;
            }
        }
        for (int ele : c){
            System.out.print(ele+" ");
        }

    }
}
