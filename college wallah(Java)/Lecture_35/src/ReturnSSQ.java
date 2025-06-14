import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReturnSSQ {
    static ArrayList<String> getSSQ(String str){
        ArrayList<String > ans = new ArrayList<>();
        if(str.isEmpty()){
            ans.add("");
            return ans;
        }
        char curr = str.charAt(0);
        ArrayList<String> smallAns = getSSQ(str.substring(1));
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "Vanshi";
        ArrayList<String> ans = getSSQ(str);
        for(String s : ans){
            System.out.println(s);
        }
    }
}
