package Array.Questions;
public class PrintRollnoMarkLessThen35 {
    public static void main(String[] args) {
        int[] arr = {10,85,96,41,72,22,15,16,94,30,35,24};
        int n = arr.length;
        for (int i = 0; i <=n-1; i++) {
            if (arr[i]<35){
                System.out.print(i +" ");
            }

        }
    }
}
