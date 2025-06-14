public class ArrayImplementation {
    static class Stack{
        private int[] arr = new int[5];
        int idx =0;
        // push function
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full !");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        // peek function
        int peek(){
            if(idx==0)  {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        // pop function
        int pop(){
            if(idx==0)  {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]= 0;
            idx--;
            return top;
        }
        // print function
        void print(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
        }
        // size function
        int size(){
            return idx;
        }
        //Check empty function
        boolean isEmpty(){
            if (idx== 0)return  true;
            return  false;
        }
        // Check Full function
        boolean isFull(){
            if(idx == arr.length) return  true;
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
