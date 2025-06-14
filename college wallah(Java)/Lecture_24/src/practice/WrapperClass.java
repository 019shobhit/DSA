package practice;
import java.util.ArrayList;
import java.util.Collections;

public class WrapperClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(100);
        list.add(15);
        list.add(40);
        list.add(5);
        list.add(55);

        list2.add("abc");
        list2.add("aabc");
        list2.add("bbc");
        list2.add("zzc");
        list2.add("shobhitc");
        list.sort(Collections.reverseOrder());
//        Collections.sort(list2,Collections.reverseOrder());
        list.sort(Collections.reverseOrder());
        System.out.println(list);
        System.out.println(list2);
    }
}
