// find the last occurrence of a given element x, given that the given array is sorted. If no Occurrence of x is found then return-1.

public class LastOccurrence {

    static int lastOccurrence(int[] arr,int x){
        int fo=-1;
        int first =0,last=arr.length-1;
        while(first<=last){
            int mid =(last+first)/2;
            if(arr[mid]==x){
                fo=mid;
                first = mid+1;
            }
            else if(arr[mid]>x) last = mid-1;
            else first = mid +1;
        }
        return fo;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,3,4,4,4,4,4,5,5,6,7,8,8,9};
        int target = 3;
        System.out.println(lastOccurrence(arr,target));

    }
}

