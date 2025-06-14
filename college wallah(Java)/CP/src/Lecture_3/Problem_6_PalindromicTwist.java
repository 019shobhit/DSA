package Lecture_3;

import java.util.Scanner;

public class Problem_6_PalindromicTwist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while(x-- >0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.next();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.charAt(i)-'a';
            }
            int i=0;
            int j= n-1;
            boolean flag = true;
            while(i<j){
                int d=Math.abs(arr[i]-arr[j]);
                if( d==2|| d==0){
                    i++;
                    j--;
                }
                else{
                    flag = false;
                    break;
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
}
