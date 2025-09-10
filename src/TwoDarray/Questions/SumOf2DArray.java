package TwoDarray.Questions;

public class SumOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,5,6},{10,20,30},{50,60,70}};
        int mx = 0;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx += arr[i][j];
            }
        }
        System.out.println(mx+"");
    }
}
