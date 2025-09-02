package Array.HomeworkQuestion;

public class SecondQuestion {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i]>secondLargest ) {

                secondLargest = arr[i];
            }
        }
        System.out.print("This largest " + largest+" ");
        System.out.print("This Second-largest " + secondLargest+" ");
    }
}
