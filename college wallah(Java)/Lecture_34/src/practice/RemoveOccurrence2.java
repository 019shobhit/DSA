package practice;

public class RemoveOccurrence2 {
    static String remove(String str, char c){
        if(str.isEmpty()) return  "";
        String ans = remove(str.substring(1),c);
        if(str.charAt(0) == c) {
            return ans;
        }
        else{
            return str.charAt(0)+ans;
        }
    }

    public static void main(String[] args) {
        String str = "shobhit chauhan";
        System.out.println(remove(str,'h'));
    }
}
