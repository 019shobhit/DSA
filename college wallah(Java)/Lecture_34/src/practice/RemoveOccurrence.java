package practice;

public class RemoveOccurrence {
    public static String remove(String str , int idx, char c){
        if(str.length() == idx) return "";
        String ans = remove(str,idx+1,c);
        if(str.charAt(idx) == c) return ans;
        else return  str.charAt(idx)+ans;
    }
    public static void main(String[] args) {
        String str = "shobhit chauhan";
        System.out.println(remove(str,0,'h'));
    }
}
