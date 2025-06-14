import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class reverseArrayList {

    private static ArrayList<Integer> list;

    static void reverse(ArrayList<Integer> list){
        int i=0, j=list.size()-1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(33);
          list.add(22);
        list.add(13);
        list.add(4);
                   list.add(5);

        System.out.println("Original List: "+list);
//        reverse(list);
        Collections.reverse(list);
        System.out.println("Reversed List: "+list);
        Collections.sort(list);
        System.out.println("Ascending Order List: "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order List: "+list);


    }
}
