//Given a string,the task is toggle all the characters of a String i.e to convert Upper case to Lower case and vice versa.

import java.util.Scanner;


public class Question_3 {
    static void toggle(StringBuilder s){
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int asci = (int)c;
            if(asci >= 65 && asci <=90){
                char x = (char)(asci+32);
                s.setCharAt(i,x);
            }else if(asci >=97 && asci<=122){
                char temp = (char)(asci-32);
                s.setCharAt(i,temp);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        // toggle
        // ShoBHit -> shObhIT
        toggle(str);
        System.out.println(str);
    }
}
