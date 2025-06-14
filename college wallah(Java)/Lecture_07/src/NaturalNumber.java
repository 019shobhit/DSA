// print first n natural number
import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n= sc.nextInt();
        int num = 1;
//        Using While Loop
        while(num<=n){
            System.out.println(num);
            num++;
        }

//        Using Do-While loop
//        do{
//            System.out.println(num);
//            num++;
//        }while(num <= n);

//        Using For Loop
//        for(int i=1;i<=n;i++){
//            System.out.println(i);
//        }
    }
}
