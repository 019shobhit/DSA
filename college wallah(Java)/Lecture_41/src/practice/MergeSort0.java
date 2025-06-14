package practice;

public class MergeSort0 {
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void sort(int[] arr,int l, int r){
        if(l>=r) return;
        int mid=(l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int i=0;i<n1;i++) arr1[i]=arr[i+l];
        for(int i=0;i<n2;i++) arr2[i]=arr[i+mid+1];
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                arr[k++]=arr1[i++];
            }else{
                arr[k++]=arr2[j++];
            }
        }
        while(i<n1){
            arr[k++]=arr1[i++];
        }
        while(j<n2) {
            arr[k++] = arr2[j++];
        }
        }
    public static void main(String[] args) {
        int[] arr = {1,6,7,9,6,3,1};
        print(arr);
        sort(arr,0,arr.length-1);
        print(arr);
    }
}
