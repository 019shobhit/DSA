package Lecture_3_Assingments;

import java.util.Scanner;

public class Question1_BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0,y=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int t = sc.nextInt();
                if(t==1){
                    x=i+1;
                    y=j+1;
                }
            }
        }
        int sum = Math.abs(x-3) + Math.abs(y-3);
        System.out.println(sum);
    }
}
