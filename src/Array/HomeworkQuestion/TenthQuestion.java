package Array.HomeworkQuestion;

public class TenthQuestion {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        int n = arr.length;
        int [] x = new int[n];
        int [] y = new int [n];
        for (int i = 0; i <n; i++) {
            if (i%2==0){
                x[i] = 10 + arr[i];
            } else if (i%2!=0) {
                y[i] = 2*arr[i];
            }
            int z = x[i] + y[i];
            System.out.print(z+" ");
        }

    }
}
