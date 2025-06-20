import java.util.Scanner;

public class SumOfDigits {
    static int findSum(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + findSum(n/10);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get digit sum");
        int n = sc.nextInt();
        System.out.println("The Sum of all Digits is: "+findSum(n));
    }
}
