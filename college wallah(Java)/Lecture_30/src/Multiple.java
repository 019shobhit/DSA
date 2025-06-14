import java.util.Scanner;

public class Multiple {

    static void mul(int n,int m){
        if(m ==0) return;
        mul(n,m-1);
        System.out.println(n*m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.print("How many times multiply: ");
        int m = sc.nextInt();
        mul(n,m);
    }
}
