package QuestionParticeForLeetCodeHard;
import java.util.ArrayList;
public class waveform {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < m ; i++){
            for(int j = 0 ; j < n ; j++){

                if(i%2!=0){
                    int a = 0, b = m-1;
                    while(a<b){
                        int temp = arr[i][a];
                        arr[i][a] = arr[i][b];
                        arr[i][b] = temp;
                        a++;
                        b--;
                    }
                }
                ans.add(arr[i][j]);
            }
        }
        System.out.println(ans);
    }
}
