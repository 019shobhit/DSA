package Lecture_3;

import java.util.Scanner;

public class Problem_7_RoomsAndStaircases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.next();
            int i=0;;
            int j=n-1;
            int max =n;
            while(i<=j){
                if(s.charAt(i) =='1' || s.charAt(j)=='1'){
                    max = Math.max(max,(n-i)*2);
                    break;
                }
                i++;
                j--;
            }
            System.out.println(max);
        }
    }
}
