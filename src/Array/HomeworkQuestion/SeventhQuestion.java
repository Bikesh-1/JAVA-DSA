package Array.HomeworkQuestion;

public class SeventhQuestion {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i]>max){
                max =arr[i];
            }

        }
        int smax = arr[0];
        for (int i = 0; i <n; i++) {
            if(arr[i] != max){
                if (arr[i]>smax){
                    smax = arr[i];
                }
            }

        }
        int tmax = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i] != max && arr[i] != smax){
                if (arr[i]>tmax){
                    tmax = arr[i];
                }
            }
        }
        System.out.print(tmax+" ");
    }
}
