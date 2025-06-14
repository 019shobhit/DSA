package Lecture_3_Assingments;

import java.util.Scanner;

public class Question4_NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        for(char c : s.toCharArray()){
            if(c=='4' || c=='7'){
                count++;
            }
        }
        if(count==4 || count==7){
        System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
