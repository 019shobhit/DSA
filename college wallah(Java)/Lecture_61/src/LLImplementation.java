public class LLImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class QueueLL{
        Node head=null;
        Node tail=null;
        int size = 0;
        void add(int data){
            Node n = new Node(data);
            if(size ==0){
                head =tail = n;
            }
            else{
                tail.next=n;
                tail = n;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int temp = head.data;
            head = head.next;
            size--;
            return  temp;
        }
        int peek(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.display();
    }
}
