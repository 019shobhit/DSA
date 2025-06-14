import java.util.Scanner;

public class GCDbruteForceAproach {

    static int gcd(int x,int y){
        int i;
        if(x>y) i=y;
        else i=x;
        while(i>0){
            if(x%i==0 && y%i==0){
                return  i;
            }
            i--;
        }
        return  1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
    }
}
