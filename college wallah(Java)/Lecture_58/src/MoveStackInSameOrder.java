import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }

        Stack<Integer> cst = new Stack<>();
        while(!temp.isEmpty()){
            cst.push(temp.peek());
            st.push(temp.pop());
        }
        System.out.println(temp);
        System.out.println();
        System.out.println(st);
        System.out.println(cst);
    }
}
