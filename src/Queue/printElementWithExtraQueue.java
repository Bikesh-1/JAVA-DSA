package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class printElementWithExtraQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (q.size()>0){
            System.out.print(q.peek()+" ");
            q1.add(q.remove());
        }
        while(q1.size()>0){
            q.add(q1.remove());
        }
    }
}
