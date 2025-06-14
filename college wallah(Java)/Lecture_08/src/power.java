// Given two number a and b. Find a raise to the power b
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,pow;
        System.out.println("Enter number and then power");
        num = sc.nextInt();
        pow = sc.nextInt();
        int result=1;

        for(int i=1;i<=pow;i++){
            result*=num;
        }
        System.out.println("The output of "+num+"^"+pow+" is : "+result);
    }
}
