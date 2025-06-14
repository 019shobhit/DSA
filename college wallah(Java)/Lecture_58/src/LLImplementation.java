public class LLImplementation {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    static class Stack{
        private Node head= null;
        int count =0;
        // push function
        void push(int x){
            Node node = new Node(x);
            node.next = head;
            head = node;
            count++;
        }
        // print function
        void print(){
            Node temp = head;
            helper(temp);
        }
        private void helper(Node h){
            if(h== null)return;
            int x = h.val;
            helper(h.next);
            System.out.print(x+" ");
        }
        // size function
        int size(){
            return  count;
        }
        // pop function
        int pop(){
            if(head == null){
                System.out.println("Stack is Empty !");
                return -1;
            }
            int x = head.val;
            head = head.next;
            count--;
            return  x;
        }
        // peek function
        int peek(){
            if(head == null){
                System.out.println("Stack is Empty !");
                return -1;
            }
            return head.val;
        }
        // check isEmpty function
        boolean isEmpty(){
            if(count == 0) return  true;
            return  false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.print();
        System.out.println();
        System.out.println(st.size());
        System.out.println(st.pop());
        st.print();
    }
}
