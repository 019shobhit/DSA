// Print the sum of the stream of integers in the input.
import java.util.Scanner;
public class StreamOfNums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=0,sum=0;

        while(n != -1){
            System.out.println("Add another number");
             n=sc.nextInt();
             sum+=n;
            System.out.println("The sum is " + sum);
        }


    }
}
