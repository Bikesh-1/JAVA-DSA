package QuestionParticeForLeetCodeHard;

public class SumOfTwoMatrices {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] srr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = arr[i][j] + srr[i][j];
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
