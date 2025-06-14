public class basicLL {

    public static class Node{
        int data; // Value
        Node next; // Address of next node

        public Node(int data) {
            this.data = data;
//            this.next = next;
        }
    }
    static void display(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    static void displayrecursively(Node head){
        if(head == null) return;
        displayrecursively(head.next);
        System.out.print(head.data+" ");
    }
    static int findLength(Node head){
        int count =0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(8);
        Node e = new Node(10);
        Node f = new Node(12);
        Node g = new Node(14);
        a.next = b;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        e.next = f ;
        f.next = g ;

        display(a);
        System.out.println();
        displayrecursively(a);
        System.out.println();
        System.out.println("the length of Linked List is : " + findLength(a));

//        Node temp = a;
//        while(temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);
    }
}
