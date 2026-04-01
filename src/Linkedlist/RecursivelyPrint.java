package Linkedlist;

public class RecursivelyPrint {
    public static void display(Node head){
        if(head==null) return;
        System.out.println(head.val);
        display(head.next);
    }
    public static void main(String[] args) {

    }
}
