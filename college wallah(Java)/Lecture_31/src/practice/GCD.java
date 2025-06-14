package practice;

public class GCD {
    public static void main(String[] args) {
        int x = 12, y =24;
        int r= Math.min(x,y);
        int d = Math.max(x,y);
        while(r!=0){

            int temp =d%r;
            d=r;
            r=temp;

        }
        System.out.println(d);
    }
}
