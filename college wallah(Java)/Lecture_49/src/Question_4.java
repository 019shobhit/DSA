//Given a string s, return the number of palindromic substring in it.

public class Question_4 {
    static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                return  false;
            }
            i++;
            j--;
        }
        return  true;
    }
    public static void main(String[] args) {
        String str = "abcdcbz";
        int count =0;

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrome(str.substring(i,j))) count++;
            }
        }
        System.out.println(count);
    }
}
