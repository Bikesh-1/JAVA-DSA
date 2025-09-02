package Array.HomeworkQuestion;

public class FourthQuestion {
    public static void main(String[] args) {
        int [] arr = {15,12,89,71,62,11,62};
        int n = arr.length;
        int dub = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i]){
                dub = arr[i];

            }

        }
        System.out.print(dub +" ");
    }
}
