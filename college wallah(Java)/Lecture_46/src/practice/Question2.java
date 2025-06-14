package practice;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,1,2,3,4};
        int n = arr.length;
        int l =0;
        int r = n-1;
        int target=8;
        int ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            }
            if(arr[mid] > arr[n-1]){
                if(arr[l] <=target && arr[mid]>target){
                    r=mid-1;
                }else l=mid+1;
            }
            else{
                if(arr[mid]<= target && arr[r] >= target){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }
        System.out.println(ans);
    }
}
