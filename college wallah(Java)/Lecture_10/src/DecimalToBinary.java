import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to convert decimal number to binary number");
        int num=sc.nextInt();
        int d,pw=1,dec=0;

        while(num>0){
            d=num%2;
            dec = dec + d*pw;
            pw *=10;
            num/=2;
        }
        System.out.println(dec);
    }
}
