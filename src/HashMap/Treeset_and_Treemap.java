package HashMap;

import java.util.TreeSet;

public class Treeset_and_Treemap {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        System.out.println(set);
        for(int ele : set){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
