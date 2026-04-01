package BinarySearch;

public class AlgoBinary {
    public static void main(String[] args) {
        int[] arr = {10,23,46,89,91,97,107,140,264};
        int n = arr.length;
        int target = 10;
        int low = 0, hi = n-1;
        boolean flag = false; // false means not present
        while(low<=hi){
            int mid = (low+hi)/2; // low + (high - low )/2
            if(arr[mid] == target){
                flag = true; break;
            }
            else if(arr[mid]>target) hi = mid - 1;
            else if(arr[mid]<target) low = mid + 1;
        }
        if(flag == true) System.out.println("Target present");
        else System.out.println("Traget not found");
    }
}
