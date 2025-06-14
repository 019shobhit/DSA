public class SizeMAxSumHeight {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static int size(Node root){
        if(root== null) return 0;
        return size(root.left)+size(root.right)+1;
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left),max(root.right)));
    }
    public static int height(Node root){
        if(root == null) return 0;
        if(root.left==null && root.right==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;
        Node c = new Node(14);
        Node d = new Node(5);
        a.left=c;
        a.right=d;
        Node e = new Node(6);
        Node f = new Node(10);
        b.right=e;
        d.right=f;

        preOrder(root);
        System.out.println();
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println("Height of Binary tree is: "+height(root));
    }
}
