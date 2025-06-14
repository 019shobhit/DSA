import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static int height(Node root){
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root == null)return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void nthLevel(Node root,int level){
        if(root==null)return;
        if(level == 1){
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left,level-1);
        nthLevel(root.right,level-1);
    }
    public  static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null)q.add(root);
        while(!q.isEmpty()){
            Node temp = q.remove();
            if(temp.left != null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left=c;
        a.right=d;
        Node e = new Node(6);
        Node f= new Node(7);
        b.left=e;
        b.right=f;

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);

        System.out.println("level traversal");
        nthLevel(root,3);
        System.out.println("BFS");
        for(int i=1;i<=height(root);i++){
            nthLevel(root,i);
        }

        System.out.println("BFS");
        bfs(root);

    }
}