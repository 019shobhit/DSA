import java.util.Scanner;

public class Fibonacci {

    static int fib(int n){
        if (n==0 || n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fibonacci term to be foud: ");
        int n = sc. nextInt();
        System.out.println("the fibonacci term is:"+fib(n));
    }
}
