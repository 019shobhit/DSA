public class MergeSort {
    static void mergrSort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid = (l+r) / 2;
        mergrSort(arr,l,mid);
        mergrSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void merge(int[] arr,int l, int mid, int r){
        int n1 = mid+1-l;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++) left[i] = arr[l+i];
        for(j=0;j<n2;j++) right[j] = arr[mid+j+1];
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2 ){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++] =right[j++];
        }
        while (i<n1)
            arr[k++]=left[i++];
        while (j<n2)
            arr[k++]=right[j++];
    }
    public static void main(String[] args) {
        int[] arr = {7,20,4,11,8,2};
        mergrSort(arr,0,arr.length-1);
        System.out.println("Sorted Array");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
