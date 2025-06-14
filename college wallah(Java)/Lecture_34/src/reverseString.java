import java.util.Scanner;

public class reverseString {
//    static String reverse(String s){
//        if(s.length()==0) return "";
//        String str = reverse(s.substring(0,s.length()-1));
//        char c = s.charAt(s.length()-1);
//        return  c+str;
//    }

    static String reverse(String s, int n){
        if(n==s.length()) return "";
        String str = reverse(s,n+1);
        char c = s.charAt(n);
        return str+c;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.nextLine();
//        System.out.println(reverse(s));
        System.out.println(reverse(s,0));
    }
}
