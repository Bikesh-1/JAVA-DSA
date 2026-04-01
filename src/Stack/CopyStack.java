package Stack;

import java.util.Scanner;
import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
//        int n;
//        System.out.println("Enter the number element:-");
//        n = sc.nextInt();
//        System.out.println("Enter the elements: ");
//        for (int i = 1; i <= n; i++) {
//            int x = sc.nextInt();
//            st.push(x);
//        }
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        //reverse order
        Stack<Integer> gst = new Stack<>();
        while(st.size()>0){
            gst.push(st.pop());
        }
        System.out.println(gst);

        Stack<Integer> rst = new Stack<>();
        while(gst.size()>0){
            rst.push(gst.pop());
        }
        System.out.println(rst);
    }
}
