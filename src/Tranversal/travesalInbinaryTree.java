package Tranversal;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class travesalInbinaryTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        preoder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
    }
    private static  void preoder(Node root){
        if(root==null) return;
        System.out.println(root.val+" ");
        preoder(root.left);
        preoder(root.right);
    }
    private static  void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.val+" ");
        inorder(root.right);
    }
    private static  void postorder(Node root){
        if(root==null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.val+" ");
    }
}
