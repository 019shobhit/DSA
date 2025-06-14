import java.util.Scanner;

public class Question_3_1 {

    static void toggle(String s){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int asci = (int)c;
            if(asci >= 65 && asci <=90){
                char temp = (char)(asci+32);
                s = s.substring(0,i) + temp + s.substring(i+1);
            }
            else if(asci >=97 && asci<=122) {
                char temp = (char) (asci - 32);
                s = s.substring(0,i) + temp + s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
