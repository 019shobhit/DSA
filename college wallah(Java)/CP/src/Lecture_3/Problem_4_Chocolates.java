package Lecture_3;

import java.util.Scanner;

public class Problem_4_Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        long max = arr[n-1];
        for(int i=n-1;i>0;i--){
            count+=max;
            max--;
            max = Math.min(max,arr[i-1]);
            if(max==0) break;
        }
        count+=max;
        System.out.println(count);
    }
}
