package compositePattern;

import java.util.Scanner;
import java.util.Stack;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:-");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <=n; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public String reverseParentheses(String s) {
        int n = s.length();
        StringBuilder checking = new StringBuilder();
        String ans = "";
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            if(s.charAt(i)==')'){
                while(s.charAt(i)==')'){
                    checking.append(st.pop());
                }
                for (int j = 0; j < checking.length(); j++) {
                    st.push(checking.charAt(j));
                }
                checking.setLength(0);
            }
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            ans += st.pop();
        }
        
        return ans;
    }
}
