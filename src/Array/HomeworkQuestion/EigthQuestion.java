package Array.HomeworkQuestion;

public class EigthQuestion {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,15};
        int n = arr.length;
        boolean isSorted = true;
        for (int i = 0; i < n-1; i++){
            if (arr[i] > arr[i + 1]) {   // check violation
                isSorted = false;
                break; // no need to check further
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
