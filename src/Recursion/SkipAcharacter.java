package Recursion;

public class SkipAcharacter {
    public static void skip(int i,String s , String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!='k') ans += s.charAt(i);
        skip(i+1,s,ans);
    }
    public static void main(String[] args) {
        String s = "Bikesh kumar";
        skip(0,s,"");
    }
    public String toggleCase(String s) {
        int n = s.length();
        String ans = "";
        for(int i = 0; i<n ; i++){
            int asc = s.length();
            if(asc>=65 && asc<=90){
                ans += (char)(asc+32);
            }else{
                ans += (char)(asc-32);
            }
        }
        return ans;
    }
}
