// Find the square root of the given non negative value x. Round it off to the nearest floor integer value.

public class Problrm {

    static int search(int x){
        int start=0, end=x;
        int ans =-1;
        while(start<=end){
            int mid = (start+end)/2;
            long val = mid *mid;
            if(val == x) return  mid;
            else if(val > x) end = mid -1;
            else{
                ans = mid;
                start = mid+1;
            }
        }
        return  ans;
    }
    public static void main(String[] args) {
        System.out.println(search(296));
    }

}
