package Stack;
import java.util.Stack;
public class basicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        //peek
        System.out.println(st);
        System.out.println("size is : " + st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
    }
}
