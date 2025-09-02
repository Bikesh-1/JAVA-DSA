package Array.Questions;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        int smax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != max){
                if(arr[i]>smax){
                    smax = arr[i];
                }
            }

        }
        System.out.println(max);
        System.out.println(smax);
    }
}
