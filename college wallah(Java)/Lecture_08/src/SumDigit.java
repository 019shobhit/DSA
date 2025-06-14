//Find the sum of digit entered by the user
import java.util.Scanner;
public class SumDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,tempnum;
        System.out.println("Enter number to get the sum of the digit");
        num = sc.nextInt();
        tempnum=num;
        int sum=0;
        while(tempnum>0){
            sum+=tempnum%10;
            tempnum/=10;
        }
        System.out.println("The sum of the digits are: "+sum);
    }
}
