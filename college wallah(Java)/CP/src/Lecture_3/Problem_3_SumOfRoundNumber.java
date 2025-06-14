package Lecture_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_3_SumOfRoundNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-- > 0){
            String s = sc.next();

            ArrayList<StringBuilder> list = new ArrayList<>();


            for(int i=0;i<s.length();i++){
                StringBuilder sb = new StringBuilder();
                if(s.charAt(i) != '0' ){
                    sb.append(s.charAt(i));
                    for(int j=0;j<s.length()-i-1;j++){
                        sb.append('0');
                    }
                }
                if(!sb.isEmpty()) {
                    list.add(sb);
                }
            }
            System.out.println(list.size());
            for(StringBuilder x : list){
                System.out.print(x+" ");
            }

        }
    }
}
