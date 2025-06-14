package practice;

public class SumOfDigits {
    static int sumDigit(int n){
        if(n/10==0) return n;
        return (n%10)+sumDigit(n/10);
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumDigit(n));
    }
}
