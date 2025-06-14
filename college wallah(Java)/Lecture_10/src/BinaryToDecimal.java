import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary Number to convert in Decimal");
        int num=sc.nextInt();
        int n,pw=1,bn=0;

        while(num>0){
            n=num%10;
            bn = bn+ n*pw;
            pw *=2;
            num/=10;
        }
        System.out.println(bn);
    }
}
