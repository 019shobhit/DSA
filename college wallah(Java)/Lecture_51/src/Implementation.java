public class Implementation {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static class SelfLinkedList{
        Node head;
        Node tail;
        int size =0;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAtBegning(int data){
            Node temp = new Node(data);
            if(head != null){
                temp.next = head;
            }
            head = temp;
            tail = temp;
            size++;
        }
        void insertinBetween(int idx , int data){
            Node x = new Node(data);
            Node temp = head;
            if(idx == 0){
                insertAtBegning(data);
                return;
            }
            else if(idx == size){
                insertAtEnd(data);
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            x.next = temp.next;
            temp.next = x;
            size ++;
        }
        void deleteAt(int idx){
            if(idx == 0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next=temp.next.next;
            if(idx == size) tail = temp;
            size--;
        }
        int getValueAt(int idx){
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp= temp.next;
            }
            return temp.data;
        }
        void displayll(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp .next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SelfLinkedList ll = new SelfLinkedList();
        ll.insertAtBegning(2);

        ll.insertAtEnd(10);

        ll.insertinBetween(1,5);
        ll.insertinBetween(0,100);

        ll.displayll();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        System.out.println(ll.getValueAt(2));

        ll.deleteAt(2);
        ll.displayll();

    }
}
