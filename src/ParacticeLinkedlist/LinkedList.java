package ParacticeLinkedlist;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class PSLL{
    private Node head;
    private Node tail;
    private Node size;
    void insertAtStart(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            tail = temp;
        }else {
            temp.next=head;
            head = temp;
        }
    }
}


public class LinkedList {
    public static void main(String[] args) {

    }
}
