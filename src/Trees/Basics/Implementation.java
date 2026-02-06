package Trees.Basics;

class Node{
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.val = val;
    }
    void display(Node root){
        if (root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    int product(Node root){
        if (root==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
}
public class Implementation {
    static void display(Node root){
        if (root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    static void main() {
      Node a = new Node(1);
      Node b = new Node(4);
      Node c = new Node(3);
      Node d = new Node(2);
      Node e = new Node(6);
      Node f = new Node(5);
      a.left = b; a.right = c;
      b.left = d; b.right = e;
      c.left = f;

//      a.display(a);

      System.out.println(a.sum(a));
        System.out.println(a.product(a));
    }
}
