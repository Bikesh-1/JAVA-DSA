package PatternPrinting;

public class Pattern04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=5-i; j++) {
//                System.out.print((char)(j+65) +" ");
//                System.out.print("*");
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
