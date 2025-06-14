// Print the sum of the first n natural numbers with the help of while loop, where n is the input.
import java.util.Scanner;
public class WhileLoopSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int sum =0,i=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("The sum of first " + n + "Natural number is : " + sum);

    }
}
