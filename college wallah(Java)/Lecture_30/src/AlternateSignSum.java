import java.util.Scanner;

public class AlternateSignSum {
    static int sum(int n){
        if(n%2==0){
            if(n==0) return 0;
            return sum(n-1) -n;
        }

        else{
            if(n==0) return 0;
            return sum(n-1)+n;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
