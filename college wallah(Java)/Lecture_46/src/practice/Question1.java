package practice;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,1,2,3,4};
        int n = arr.length;
        int l=0;
        int r = n-1;
        int mid;
        int min=-1;
        while(l<=r){
            mid=(l+r)/2;
            if(arr[mid] >arr[n-1]){
                l=mid+1;
            }else{
                min=mid;
                r=mid-1;
            }
        }
        System.out.println(min);
    }
}
