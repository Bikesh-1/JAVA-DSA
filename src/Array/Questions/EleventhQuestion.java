package Array.Questions;

public class EleventhQuestion {
    public static void main(String[] args) {
        int[] arr = {10,30,30,20};
        int n = arr.length;
        int [] reverse = new int[n];
        for (int i = 0; i <n ; i++) {
            reverse[i] = arr[n - 1 - i];
            if (arr[i] == reverse[i]){
                System.out.print("This is plaindrom");
            }else {
                System.out.println("This is not");
            }

        }

    }
}
