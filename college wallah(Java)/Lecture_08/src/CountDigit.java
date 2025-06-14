// Count the number of digit entered by the user
import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i=0,tempn;
        System.out.println("Enter number to count digit of the number");
        n=sc.nextInt();
        tempn=n;
        while(tempn>0){
            tempn/=10;
            i++;
        }
        System.out.println("The total digit in "+n+" is : "+i);
    }
}
