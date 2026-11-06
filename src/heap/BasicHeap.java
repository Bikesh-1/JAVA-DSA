package heap;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
        pq.add(0);
        System.out.println(pq+" "+pq.peek());
        pq.add(-32);
        System.out.println(pq+" "+pq.peek());
    }
    public int maxProduct(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : nums){
            maxHeap.add(ele);
        }

        int a = maxHeap.remove()-1;
        int b = maxHeap.remove()-1;
        return a*b;
    }
}
