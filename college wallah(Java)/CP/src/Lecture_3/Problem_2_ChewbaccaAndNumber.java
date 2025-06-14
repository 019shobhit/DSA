package Lecture_3;

import java.util.Scanner;

public class Problem_2_ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            int x = s.charAt(i) - '0';
            if(i==0 && x==9){
                sb.append("9");
            }
            else {
                int temp = Math.min(x, 9 - x);
                sb.append(temp);
            }
        }
        System.out.println(sb);

        sc.close();
    }
}
