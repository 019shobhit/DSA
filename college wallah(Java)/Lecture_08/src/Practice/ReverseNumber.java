package Practice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
        while(temp >0){
            int t = temp %10;
            rev = (rev*10)+t;
            temp/=10;
        }

        System.out.println(rev);
    }
}
