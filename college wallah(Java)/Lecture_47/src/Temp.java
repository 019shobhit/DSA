class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class Temp {
    public static class ll {
        Node head=null;
        Node tail=null;
        public static Node addFirst(int data, Node head) {
            Node n = new Node(data);
            if (head == null) {

                System.out.println("Node added in starting with value of" + data);
                return n;
            } else {
                n.next = head;
                head.prev = n;

                System.out.println("Node added in starting with value of" + data);
                return n;
            }
        }

        void addLast(int data) {
            Node n = new Node(data);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }

        public static Node df(Node head) {
            if (head == null || head.next == null) {
                return null;
            } else {
                return head.next;
            }
        }

        public static Node dl(Node head) {
            if (head == null || head.next == null) {
                return null;
            } else {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
                return head;
            }
        }


        void print(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Node head = null;

        head = addFirst(10, head);
        head = addFirst(20, head);
        head = addFirst(30, head);
        head = addLast(50, head);
        head = addLast(60, head);

        print(head);
        System.out.println("...............................................");

        head = df(head);
        head = dl(head);

        print(head);
    }
}