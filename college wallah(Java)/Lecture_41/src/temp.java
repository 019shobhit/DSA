import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class temp {
    public static void main(String[] args) {
        String[] arr = {"cocoa", "software", "horse", "hot", "hoarse", "shore", "internet", "heros"};
        String w = "horse";

        List<String> list = find(w,arr);
        System.out.println(list);
    }

    public static List<String> find(String s, String[] arr) {
        List<String> list = new ArrayList<>();
        String st = strSort(s);

        for (String c : arr) {
            if (st.equals(strSort(c))) {
                list.add(c);
            }
        }
        return list;
    }

    public static String strSort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static List<String> findAnagrams(String w, String[] arr) {
        List<String> list = new ArrayList<>();
        String sortedW = sortStr(w);

        for (String word : arr) {
            if (sortedW.equals(sortStr(word))) {
                list.add(word);
            }
        }

        return list;
    }

    public static String sortStr(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}

