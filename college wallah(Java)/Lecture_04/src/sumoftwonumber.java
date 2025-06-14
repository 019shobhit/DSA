import java.util.Scanner;
public class sumoftwonumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2=sc.nextInt();
        int sum = n1+n2;
        System.out.println("The sum of the numbers are" + sum);

    }
}
