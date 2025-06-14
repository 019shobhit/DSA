import java.lang.reflect.Array;
import java.util.ArrayList;
public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        // Add new Element
        l1.add(5);
        l1.add(10);
        l1.add(15);
        l1.add(20);
//        get an element at index
//        System.out.println(l1.get(0));
//        print with f or loop
//        for(int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i)+" ");
//        }
//        directly calling
//        System.out.println(l1);

//        insert ellement in between
//        l1.add(1,50);
//        System.out.println(l1);

//        modifing element at any index
//        l1.set(2,100);
//        System.out.println(l1);

//        remove index from any index
//        l1.remove(1);
//        System.out.println(l1);

//        remove specefic element without index
//        System.out.println(l1.remove(Integer.valueOf(15)));
        System.out.println(l1);

//        checking if an element exist or not
        boolean check = l1.contains(Integer.valueOf(11));
        System.out.println(check);

    }
}
