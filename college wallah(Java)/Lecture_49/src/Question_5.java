// Java program to reverse each word in string.

import java.util.Scanner;

public class Question_5 {
    static void reverse(StringBuilder s){
        int i=0,j=s.length()-1;
        while(i<j){
            char temp = s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    static String reverseSentence(String str){
        String ans="";
        StringBuilder s = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                s.append(ch);
            }
            else{
                reverse(s);
                ans += s;
                ans +=" ";
//                s.delete(0,s.length());
                s = new StringBuilder("");
            }
        }
        reverse(s);
        ans += s;
        return  ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverseSentence(str);
        System.out.println(ans);
    }
}
