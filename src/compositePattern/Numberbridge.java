package compositePattern;
import java.util.Scanner;
public class Numberbridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:-");
        int n = sc.nextInt();
        for (int i = 1; i <=2*n-1; i++){
            System.out.print(i +" ");
        }
        System.out.println();
        int m = n-1;
        for (int i = 1; i <=m ; i++) {
            int a = 1;
            for (int j = 1; j <=m+1-i; j++) {
                System.out.print(a++ +" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print(" " +" ");
                a++;
            }
            for (int j = 5; j <= m+5-i; j++) {
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
