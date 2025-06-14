package Lecture_4;

import java.util.Scanner;

public class Problem_A_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n-=2;
        boolean flag = true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("2 "+n);
        }
        else{
            System.out.println("-1");
        }
    }
}
