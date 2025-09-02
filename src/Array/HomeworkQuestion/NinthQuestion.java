package Array.HomeworkQuestion;

public class NinthQuestion {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40};
        int sumEven = 0;
        int sumOdd = 0;
        int difference = 0;
        int n = arr.length;
        for (int i = 0; i <n; i++) {
            if (i%2 == 0){
                sumEven += arr[i];
            } else if (i%2 != 0) {
                sumOdd += arr[i];
            }
        }
        difference = sumEven - sumOdd;
        System.out.println(difference+" ");
    }
}
