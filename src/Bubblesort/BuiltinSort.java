package Bubblesort;
import java.util.Arrays;
public class BuiltinSort {
    public static void main(String[] args) {
        int[] arr = {7,1,2,8,-4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
