package Array;

public class SmallerandLarger {
    public static void main(String[] args) {
        int[] arr = {1,5,8,12,12,12,19};
        int n = arr.length;
        int target = 12;
        int maxCount = 0;
        int minCount = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>=target) maxCount++;
            if(arr[i]<target) minCount++;
        }
        System.out.println(maxCount+" "+minCount);
        System.out.println();
    }
}
