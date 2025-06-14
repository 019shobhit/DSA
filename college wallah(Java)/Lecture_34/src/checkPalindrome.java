import java.util.Scanner;

public class checkPalindrome {
    static boolean check(String s , int x, int y){
        if(x>=y) return true;
        if(s.charAt(x)!=s.charAt(y)) return false;
        return check(s,x+1,y-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.nextLine();
        if(check(s,0,s.length()-1)){
            System.out.println("Yes Palindrome String");
        }
        else
            System.out.println("Not a Palindrome String");
    }
}
