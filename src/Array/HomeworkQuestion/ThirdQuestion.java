package Array.HomeworkQuestion;

public class ThirdQuestion {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,5,6,2,1,7,98};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.print(min+" ");
    }
}
