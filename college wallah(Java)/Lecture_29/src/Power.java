import java.util.Scanner;

public class Power {

    static int pow(int n,int p){
        if(p==1)
            return n;
        return n * pow(n,p-1);
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
