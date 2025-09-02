package Array.Questions;

public class doubletArray {
    public static void main(String[] args) {
     int arr[] = {1,5,9,3,4,7};
     int x = 2;
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j]== x){
                    System.out.println(arr[i] +" " +arr[j]);
                }
            }
        }
    }
}
