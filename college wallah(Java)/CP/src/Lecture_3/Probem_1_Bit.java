package Lecture_3;

import java.util.Scanner;

public class Probem_1_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count=0;
        while(n-- > 0){
            String str=sc.nextLine();
            if(str.contains("++")){
                count++;
            }
            else {
                count--;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
