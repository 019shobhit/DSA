package practice;

import java.util.ArrayList;

public class ReturnSubsequences {
    static ArrayList<String> ssq(String str){
        ArrayList<String> list = new ArrayList<>();
        if(str.isEmpty()){
            list.add(" ");
            return list;
        }

        char c = str.charAt(0);
        ArrayList<String> smallList = ssq(str.substring(1));
        for(String i : smallList){
            list.add(c+i);
            list.add(i);
        }
        return  list;
    }
    public static void main(String[] args) {
        String str = "sho";
        ArrayList<String> list= ssq(str);
        System.out.println(list);
    }
}
