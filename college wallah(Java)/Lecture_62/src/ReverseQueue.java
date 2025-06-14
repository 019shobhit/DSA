import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Stack<Integer> st = new Stack<>();
        System.out.println(q);
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        System.out.println(st);
    }
}
