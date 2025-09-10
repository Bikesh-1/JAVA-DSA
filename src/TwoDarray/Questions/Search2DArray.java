package TwoDarray.Questions;

public class Search2DArray {
    public static void main(String[] args) {
        int [][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean flag = false;
        int traget = 150;
        int m = arr.length,n=arr[0].length;
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]==traget)
                flag = true;
                break;

            }


        }
        if (flag==true) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
