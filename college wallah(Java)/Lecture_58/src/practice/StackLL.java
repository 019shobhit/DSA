package practice;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public  class StackLL {
    public static class Stack{
        Node head=null;
        Node tail=null;

        void push(int data){
            Node n = new Node(data);
            if(head == null){
                head = n;
                tail = n;
            }
            else{
                n.next=head;
                head=n;
            }
        }

        int pop(){
            if(head==null){
                System.out.println("empty stack");
                return -1;
            }
            else{
                int temp = head.data;
                head=head.next;
                return temp;
            }
        }

        void print(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args){
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(0);
        st.push(50);

        st.print();

    }
}