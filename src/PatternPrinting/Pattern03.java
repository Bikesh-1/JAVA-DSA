//pattern printing
//        A B C D
//        A B C D
//        A B C D
package PatternPrinting;

public class Pattern03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <=4; j++) {
                System.out.print((char)(j+64) +" ");
            }
            System.out.println();
        }
    }
}
