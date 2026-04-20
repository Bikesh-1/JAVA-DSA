package Queue.Question;
import java.util.*;
public class ReverseQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (q.size()>0){
            st.push(q.remove());
        }
        System.out.println(st);
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
