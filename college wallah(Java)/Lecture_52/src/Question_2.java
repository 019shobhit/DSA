//Finding the nth node from the end of the linked list.
public class Question_2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node NthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp !=null){
            size++;
            temp = temp.next;
        }
        int x = size - n +1;
        temp = head;
        for(int i=1;i<x;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static Node NthNode2(Node head,int n){
        Node left = head;
        Node right =  head;
        for(int i=0;i<n;i++){
            right = right.next;
        }
        while(right != null){
            right = right.next;
            left = left.next;
        }
        return left;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node deleteNthFromEnd(Node head, int n){
        Node left = head;
        Node right = head;
        for(int i=1;i<=n;i++){
            right = right.next;
        }
        if(right == null){
//            head.data = head.next.data;
//            head.next = head.next.next;
            head = head.next;
            return head;
        }
        while(right.next != null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(50);
        Node c = new Node(15);
        Node d = new Node(20);
        Node e = new Node(90);
        Node f = new Node(110);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        print(a);
        deleteNthFromEnd(a,6);
        a = deleteNthFromEnd(a,6);
        print(a);

    }
}
