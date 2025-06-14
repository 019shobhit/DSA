import java.util.Scanner;

public class GCDalternatemethod {

    static int gcd(int x,int y){
       while(x%y != 0){
           int temp = x%y;
           x = y;
           y = temp;
       }
       return y;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
    }
}
