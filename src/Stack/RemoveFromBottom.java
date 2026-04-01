package Stack;

import java.util.Stack;

public class RemoveFromBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        Stack<Integer> rt = new Stack<>();
        while (st.size()>1){
            int x = st.pop();
            rt.push(x);
        }
        st.pop();
        while (rt.size()>0){
            int y = rt.pop();
            st.push(y);
        }

        System.out.println(st);
    }
}
