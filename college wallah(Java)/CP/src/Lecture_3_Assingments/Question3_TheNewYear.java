package Lecture_3_Assingments;

import java.util.Arrays;
import java.util.Scanner;

public class Question3_TheNewYear {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = arr[2]-arr[0];
        System.out.println(ans);
    }
}
