package Practice;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count =0;
        System.out.println(n);
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}
