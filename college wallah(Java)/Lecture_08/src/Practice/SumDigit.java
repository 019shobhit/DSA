package Practice;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long n = num;
        int sum =0;
        while(n>0){
            sum+=(n%10);
            n/=10;
        }
        System.out.println(sum);
    }
}
