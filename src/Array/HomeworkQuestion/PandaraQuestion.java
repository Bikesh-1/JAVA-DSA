package Array.HomeworkQuestion;
public class PandaraQuestion {
    public static void main(String[] args) {
        int [] arr = {10,30,40,50,60,20};
        int n = arr.length;
        int traget = 80;
        boolean threesum = false;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == traget) {
                        System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        threesum = true;
                    }
                    
                }
            }
        }
        if (!threesum) {
            System.out.println("No triplet equals target");
        }
    }
}
