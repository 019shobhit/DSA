package practive;

public class FirstOccurence {
    static int search(int[] arr,int t){
        int l =0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==t) {
                ans=mid;
                r=mid-1;
            }
            else if(arr[mid] < t){
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,4,5,6,6,9};
        int target =2;
        System.out.println(search(arr,target));
    }
}
