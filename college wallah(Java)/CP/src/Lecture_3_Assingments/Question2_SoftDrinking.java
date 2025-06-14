package Lecture_3_Assingments;

import java.util.Scanner;

public class Question2_SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bottle = sc.nextInt();
        int ml = sc.nextInt();
        int lemon=sc.nextInt();
        int slice = sc.nextInt();
        int salt = sc.nextInt();
        int reqMl = sc.nextInt();
        int reqSalt = sc.nextInt();

        int totalMl = bottle*ml;
        int totalSlice = lemon*slice;

        int count=0;
        while(totalMl >= reqMl*n && salt >=reqSalt*n && totalSlice >=n){
            count++;
            totalMl-=(reqMl*n);
            salt-=(reqSalt*n);
            totalSlice -=n;
        }
        System.out.println(count);
    }
}
