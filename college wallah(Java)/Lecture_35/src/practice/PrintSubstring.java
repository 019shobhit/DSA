package practice;

public class PrintSubstring {
    public static void print(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char c = str.charAt(0);
        String smallStr = str.substring(1);
        print(smallStr,ans+c);
        print(smallStr,ans);

    }
    public static void main(String[] args) {
        String str = "sho";
        print(str,"");
    }
}
