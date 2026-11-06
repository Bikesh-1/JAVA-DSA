package heap;
class Minheap{
    private int[] arr;
    private int size;
    Minheap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num){
        arr[size++] = num;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        if(idx==0) return;
        int parent = (idx-1)/2;
        if(arr[idx]<arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public void swap(int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int peak(){
        if(size==0){
            System.out.println("Heap is empty!");
            return -1;
        }
        return arr[0];
    }
    public int size(){
        return size;
    }
    public int remove() throws Exception{
        if(size == 0) throw new Exception("Heap is Empty!");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int i){
        int lc = 2*i + 1,rc = 2*i+2;
        int minIdx = i;
        if(lc>=size) return;
        if(lc<size && arr[minIdx]>arr[lc]) minIdx = lc;
        if(rc>=size) return;
        if(rc<size && arr[rc]<arr[minIdx]) minIdx = rc;
        if(i==minIdx) return;
        swap(i,minIdx);
        downHeapify(minIdx);
    }
}
public class ImplMinheapToArray {

    //heap is implement by array & visulaised as a complete binary tree
    public static void main(String[] args) {
        Minheap pq = new Minheap(10);
        pq.add(1);
        pq.add(6);
        pq.add(2);
    }
}
