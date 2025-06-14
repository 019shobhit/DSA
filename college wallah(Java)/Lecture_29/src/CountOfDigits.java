import java.util.Scanner;

public class CountOfDigits {

    static  int cd(int n ){
        if(n==0){
            return 0;
        }
        return 1+cd(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to fond Digit of that number: ");
        int n= sc.nextInt();
        System.out.println("The total digit is : "+ cd(n));
    }
}
