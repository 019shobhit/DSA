package practive;

public class BinarySearch {
    public static int search(int[] arr, int t){
        int i=0,j=arr.length-1;
        int count=0;
        while(i<=j){
            count++;
        System.out.println(count);
            int mid = (i+j)/2;
            if(arr[mid]==t)return mid;
            else if(arr[mid] <t){
                i=mid+1;
            }
            else {
                j=mid-1;
            }
        }
        return  -1;
    }
    public static int se(int[] arr, int t, int l, int r){
        if(l > r) return -1;
        int mid = (l+r)/2;
        if(arr[mid]==t) return mid;
        else if(arr[mid] < t) return se(arr,t,mid+1,r);
        else return se(arr,t,l,mid-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,9,12};
        int target = 9;
        System.out.println(search(arr,target));
        System.out.println(se(arr,target,0,arr.length-1));
    }
}
