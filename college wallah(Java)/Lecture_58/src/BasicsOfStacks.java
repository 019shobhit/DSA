import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
//        int[] arr = new int[5];
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
//        System.out.println(st.peek());
//        System.out.println(st);
//        System.out.println("Size of stack is: "+st.size());
//        st.pop();
        System.out.println(st);
        while(st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());
    }

}
