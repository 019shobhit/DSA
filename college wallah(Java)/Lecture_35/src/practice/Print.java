package practice;

public class Print {
    public static void pr(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char c = str.charAt(0);
        str = str.substring(1);
        pr(str,ans+c);
        pr(str,ans);

    }
    public static void main(String[] args) {
        String str = "abc";
        pr(str,"");
    }
}
