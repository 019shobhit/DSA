import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(12);
        dq.addFirst(13);
        dq.addFirst(14);
        System.out.println(dq);
    }
}
