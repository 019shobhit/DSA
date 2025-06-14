// Write a Program to print the value if it is even and divisible by 3.

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check number is even and divisible by 3");
        int num = sc.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println(num + " is even and Divisible by 3");
        }
        else {
            System.out.println(num + "it is not");
        }
    }
}
