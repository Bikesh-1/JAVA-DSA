package HashMap;
import java.util.HashSet;
public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        System.out.println(set);
        //search true/false
        System.out.println(set.contains(50));
    }
}
