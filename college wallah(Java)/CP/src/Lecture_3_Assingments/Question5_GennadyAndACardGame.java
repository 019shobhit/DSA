package Lecture_3_Assingments;

import java.util.Scanner;

public class Question5_GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        sc.nextLine();
        String[] arr = new String[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.next();
        }
        char a= inp.charAt(0);
        char b= inp.charAt(1);
        boolean flag = false;
        for(int i=0;i<5;i++){
            if(a==arr[i].charAt(0) || b==arr[i].charAt(1)){
                flag = true;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
