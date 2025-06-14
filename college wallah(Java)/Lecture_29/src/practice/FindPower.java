package practice;

public class FindPower {
    static int pow(int x,int y){
        if(y==1) return x;
        return x*pow(x,y-1);
    }
    public static void main(String[] args) {
        int x =2;
        int y=5;
        System.out.println(pow(x,y));
    }
}
