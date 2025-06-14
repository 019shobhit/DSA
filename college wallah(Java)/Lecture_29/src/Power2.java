import java.util.Scanner;

public class Power2 {

    static int pow(int n,int p){
        if(p==1)
            return n;
        if(p%2==0){
            return pow(n,p/2) *pow(n,p/2);
        }
        else
            return n * pow(n,p/2) *pow(n,p/2);
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.print("Enter Power: ");
        int p = sc.nextInt();
        System.out.println("The value of power is: "+pow(n,p));
    }
}
