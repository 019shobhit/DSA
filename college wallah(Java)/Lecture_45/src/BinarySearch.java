public class BinarySearch {
    static boolean binarySearch(int[] arr,int x){
        int n = arr.length;
        int l=0,r=n-1;
        while(l<=r){
            int mid =(l+r)/2;
            if(arr[mid] == x) return true;
            else if(arr[mid]> x) r = mid-1;
            else l=mid+1;
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 16;
        System.out.println(binarySearch(arr,target));
    }
}
