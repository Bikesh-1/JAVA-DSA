package Array;

public class Copyofarray {
    public static void main(String[] args) {
        int[] arr = {30,10,40,23,89,34};
        for (int ele : arr){
            System.out.println(ele+" ");
        }
        System.out.println();
        int[] nums = arr;
    }
}
