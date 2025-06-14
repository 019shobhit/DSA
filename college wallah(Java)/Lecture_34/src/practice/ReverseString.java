package practice;

public class ReverseString {
    static String reverse(String str , int idx){
        if(0> idx ) return "";
        return str.charAt(idx)+reverse(str.substring(0,idx),idx-1);
    }
    public static void main(String[] args) {
        String str = "Shobhit chauhan";
        System.out.println(reverse(str,str.length()-1));
    }
}
