package practice;

public class CheckPalindrome {
    static boolean check(String str,int l , int r){
        if(l>r) return true;
        if(str.charAt(l) == str.charAt(r)) return check(str,l+1,r-1);
        else  return  false;
    }
    public static void main(String[] args) {
        String str = "abcdeba";
        if(check(str,0,str.length()-1)){
            System.out.println("Yes Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
