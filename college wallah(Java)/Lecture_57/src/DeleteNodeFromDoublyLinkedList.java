public class DeleteNodeFromDoublyLinkedList {
    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void display2(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
    }
    public static Node deleteFromHead(Node head){
        head = head.next;
        head.prev = null;
        return  head;
    }
    public static void deleteFromEnd(Node head){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
    }
    public static void deleteInBetween(Node head,int x){
        Node temp = head;
        while(temp.next.val != x){
            temp = temp.next;
        }
        temp.next=temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        n2.prev= n1;
        n3.prev = n2;
        n4.prev = n3;
        n5.prev= n4;

        display(n1);
        System.out.println();
//        Node head = deleteFromHead(n1);
//        display(head);
//        System.out.println();

//        deleteFromEnd(head);
//        display(head);
        deleteInBetween(n1,30);
display2(n5);
    }
}
