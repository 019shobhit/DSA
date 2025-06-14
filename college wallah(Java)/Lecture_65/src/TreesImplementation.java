public class TreesImplementation {
    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }
    public static void print(Node root){
        if(root==null) return;
        System.out.print(root.val+" -> ");
        if(root.left != null) System.out.print(root.left.val+" , ");
        if(root.right!=null) System.out.print(root.right.val);
        System.out.println();
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        a.left=c;
        a.right=d;
        b.right=e;
        print(root);



    }
}
