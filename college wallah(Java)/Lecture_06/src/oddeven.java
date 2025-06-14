// Print "odd" if the input value is odd, otherwise print "even".
// Note: Input value is between 1 and 10^6.
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + " Is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
}
