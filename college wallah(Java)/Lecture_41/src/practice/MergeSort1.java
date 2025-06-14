package practice;

public class MergeSort1 {
    public static void print(int[]arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int n1=mid+1-l;
        int n2=r-mid;
        int[] left= new int[n1];
        int[] right= new int[n2];
        for(int i=0;i<n1;i++) left[i]=arr[i+l];
        for(int i=0;i<n2;i++) right[i]=arr[i+mid+1];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                arr[k++]=left[i++];
            }else arr[k++]=right[j++];
        }
        while (i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }
    }
    public static void sort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,90,73,5,74,20};
        print(arr);
        sort(arr,0,arr.length-1);
        print(arr);
    }
}
