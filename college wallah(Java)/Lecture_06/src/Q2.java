import java.util.Scanner;

//Write a program to print the a vlue if it is divisible by 3 or 5.
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(num%3==0 || num%5 ==0){
            System.out.println("Yes divided by any one");
        }
        else {
            System.out.println("Not divided by any one");
        }
    }
}
