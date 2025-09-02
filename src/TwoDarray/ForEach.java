package TwoDarray;

public class ForEach {
    public static void main(String[] args) {
        int[][] b = {{1,2,3},{4,5,6}};
        for (int[] ele : b){
            for (int x :ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println(b[i][j]+" ");
//            }
//
//        }

    }
}
