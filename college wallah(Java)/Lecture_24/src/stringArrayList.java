import java.util.ArrayList;
import java.util.Collections;

public class stringArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("shobhit");
        list.add("ujjwal");
        list.add("arryan");
        list.add("shivam");
        System.out.println("Orignal String list: "+list);
        Collections.sort(list);
        System.out.println("Sorted string is: "+list);

    }
}
