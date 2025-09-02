package Array.Questions;

public class SortArray0and1 {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,1,1,1};
        int n = arr.length;
        int x = 0;
        int y = 0;
        for (int i = 0; i <n; i++) {
            if(arr[i] == 0){
                y = arr[i];
                System.out.print(y+" ");
            }
        }
        for (int i = 0; i <n; i++) {
            if(arr[i] == 1){
                x = arr[i];
                System.out.print(x+" ");
            }
        }

    }
}
