//Reverse the digit of a number
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter number to get reverse of the number");
        num = sc.nextInt();
        int tempnum;
        tempnum=num;
        int revnum=0;
        while(tempnum>0){
            revnum=(revnum*10) + (tempnum%10);
            tempnum/=10;
        }
        System.out.println("old number is "+num+" and new number is : "+revnum);
    }
}
