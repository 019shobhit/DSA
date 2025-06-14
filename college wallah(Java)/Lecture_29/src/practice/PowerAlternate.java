package practice;

public class PowerAlternate {
    static int pow(int x,int y){
        if(y==1) return x;
        int small = pow(x,y/2);
        if(y%2==0) {
            return small*small;
        }
        else{
            return x*small*small;
        }
    }
    public static void main(String[] args) {
        int x=2,y=50;
        System.out.println(pow(x,y));
    }
}
