package Stack.ImplementationOfArray;

public class linkedlistImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty!");
                return -1;
            }
            return head.val;
        }
        void displayrec(Node h){
            if(h==null)
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void revdisplay(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();
        System.out.println(st.size);
    }
}
