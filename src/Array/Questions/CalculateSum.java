package Array.Questions;

public class CalculateSum {
    public static void main(String[] args) {

        int[] arr = {10,40,56,89,96,46};
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i <=n-1; i++) {
            sum += arr[i];

        }
        System.out.print(sum +" ");
    }
}
