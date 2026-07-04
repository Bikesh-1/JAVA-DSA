package BinaryTree;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class implementation {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        display(a);
        System.out.println();
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(size(a));
    }
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    public static int level(Node root){
        if(root == null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static  void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left); //left subtree
        display(root.right); //right subtree
    }
}
