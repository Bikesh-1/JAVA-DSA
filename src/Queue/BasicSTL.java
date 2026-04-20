package Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q2 = new LinkedList<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);
        q2.add(6);
        System.out.println(q2.size());
        System.out.println(q2);
        q2.remove();
        System.out.println(q2);
        q2.poll();
        System.out.println(q2);
        System.out.println(q2.element());
        System.out.println(q2.peek());
    }
}
