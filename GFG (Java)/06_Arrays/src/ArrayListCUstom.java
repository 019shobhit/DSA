import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCUstom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
//        for(int i : list){
//            System.out.println(i);
//        }
        list.add(2,25);
        System.out.println(list);

        Collections.reverse(list);

    }
}
