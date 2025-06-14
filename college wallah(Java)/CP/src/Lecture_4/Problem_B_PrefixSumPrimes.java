package Lecture_4;

import java.util.Scanner;

public class Problem_B_PrefixSumPrimes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int one=0;
        int two=0;
        while(n-- > 0){
            int t = sc.nextInt();
            if(t==2) two++;
            else one++;
        }
        if(two > 0){
            System.out.print(2+" ");
            two --;
        }
        if(one > 0 ){
            System.out.print(1+" ");
            one--;
        }
        for(int i=0;i<two;i++){
            System.out.print(2+" ");
        }
        for(int j=0;j<one;j++){
            System.out.print(1+" ");
        }
    }
}
