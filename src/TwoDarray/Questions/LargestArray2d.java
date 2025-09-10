package TwoDarray.Questions;

public class LargestArray2d {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{10,20,300},{50,60,70}};
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]>mx){
                    mx = arr[i][j];
                }
            }
        }
        System.out.println(mx+"");
    }
}
