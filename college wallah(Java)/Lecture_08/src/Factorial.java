// Print the first n factorial number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,fact=1;
        System.out.println("Enter number to get factorial of the number");
        num = sc.nextInt();
        for(int i=1;i<=num;i++){
            fact*= i;
        }
        System.out.println("The factorial is : "+fact);
    }
}
