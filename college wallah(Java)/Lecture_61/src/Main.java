import java.util.LinkedList;
import java.util.Queue;

public  class Main {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        System.out.println(q1);

        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        while(!q2.isEmpty()){
            int temp = q2.poll();
            System.out.println(temp);
            q1.add(temp);
        }
        System.out.println(q1);
        System.out.println(q2);

    }
}