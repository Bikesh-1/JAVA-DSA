package Linkedlist;
class SLL{
    private Node head;
    private Node tail;
    private int size;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp;
            tail = temp;
        }else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtStart(int val){
        Node temp = new Node(val);
        if(head == null){
            head = temp;
            tail = temp;
        }else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtAny(int idx , int val){
        if(idx==0){
            insertAtEnd(val);
            return;
        }
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid Index");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i = 1; i<=idx-1;i++){
            x= x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int get(int idx){
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            System.out.println("Invalid index");
            return -1;
        }
        Node temp = head;
        for (int i = 1; i <= idx ; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void deleteAtHead(){
        if(head == null) System.out.println("list is empty");
        head = head.next;
        size--;
    }
    void delete(int idx){
        if(idx ==0){
            deleteAtHead();
            return;
        }
        if(head == null) System.out.println("list is empty");
        if(idx<0 || idx>=size) System.out.println("Invalid index");
        Node temp = head;
        for (int i = 1; i <= idx-1; i++) {
            temp = temp.next;
        }
        if(temp.next==tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println(size);
    }
}
public class ImplementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtStart(40);
        list.insertAtEnd(50);
        list.insertAtAny(4,10);
    }
}
