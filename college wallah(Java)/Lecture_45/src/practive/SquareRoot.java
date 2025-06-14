package practive;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 80;
        int l =1;
        int r=n;
        int ans =-1;
        while(l<=r){
            int  mid=(l+r)/2;
            if(mid*mid == n) {
                ans=mid;
                break;
            }
            else if(mid*mid <n){
                ans=mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        System.out.println(ans);
    }
}
