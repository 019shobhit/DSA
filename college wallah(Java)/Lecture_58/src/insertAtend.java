import java.util.Stack;

public class insertAtend {

    public static void print(Stack<Integer> st){
        if(st.size() == 0) return;
        int x = st.pop();
        print(st);
        System.out.print(x+" ");;
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        print(st);

    }
}
