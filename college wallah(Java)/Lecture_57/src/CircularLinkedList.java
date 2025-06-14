public class CircularLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head.next;
        System.out.print(head.val+" ");
        while(temp != head){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void findSum(Node head, int x){
        Node left =head;
        Node right = head.prev;
        while(left != right){
            if(left.val +right.val == x){
                System.out.println(left.val +" " + right.val);
                return ;
            }
            if(left.val +right.val > x){
                right = right.prev;
            }else{
                left = left.next;
            }
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(25);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n1;

        n2.prev= n1;
        n3.prev = n2;
        n4.prev = n3;
        n5.prev = n4;
        n1.prev = n5;

        display(n1);
        findSum(n1,45);
    }
}
