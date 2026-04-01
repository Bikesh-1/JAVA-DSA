package DoubleLinkedList;
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}
class DLL{
    dNode head;
    dNode tail;
    int size;
    void dispaly(){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void instertAtTail(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void instertAthead(int val){
        dNode temp = new dNode(val);
        if(size == 0) head = tail = temp;
        else {
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insertAtAny(int idx , int val){
        if(idx==0){
            instertAthead(val);
            return;
        }
        if(idx==size){
            instertAtTail(val);
            return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid Index");
            return;
        }

        dNode temp = new dNode(val);
        dNode x = head;
        for(int i = 1; i<=idx-1;i++){
            x= x.next;
        }
        dNode y = x.next;
        x.next = temp; temp.prev = x;
        y.prev = temp; temp.next = y;
        size++;
    }
    void deleteAtHead() throws Error{
        if(size==0) throw new Error ("List is Empty");
        head = head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail() throws Error{
        if(size==0) throw new Error ("List is Empty");
        tail = tail.prev;
        tail.next = null;
        size--;
    }
}

public class Intizatio {
    public static void print(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp= temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node){
        dNode temp = node;
        while(temp.prev!=null){
            temp= temp.prev;
        }
        //now temp is at head
        print(temp);
    }
    public static void main(String[] args) {
//        dNode a = new dNode(10);
//        dNode b = new dNode(20);
//        dNode c = new dNode(30);
//        dNode d = new dNode(40);
//        a.next = b; b.prev = a;
//        b.next = c; c.prev = b;
//        c.next = d; d.prev = c;
//        print(a);
//        printReverse(d);
//        display(c);
        DLL list = new DLL();
        list.instertAthead(10);
        list.instertAthead(20);
        list.instertAthead(30);
        list.dispaly();
        list.instertAthead(40);
        list.dispaly();
        System.out.println(list.size);
        list.insertAtAny(2,80);
        list.dispaly();

    }
}
