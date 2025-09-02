package Array.HomeworkQuestion;

public class Firstquestion {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            x *= arr[i];
        }
        System.out.println(x+" ");
    }
}
