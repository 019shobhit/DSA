import java.util.Scanner;

public class MergeSort_ {
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void merge(int[] arr, int l,int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int [] right = new int[n2];
        for(int i=0;i<n1;i++) left[i]=arr[l+i];
        for(int i=0;i<n2;i++) right[i]=arr[mid+1+i];
        int i,j,k;
        i=0;j=0;k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1) arr[k++]=left[i++];
        while(j<n2) arr[k++]=right[j++];
    }

    static void mergeSort(int[] arr,int l, int r){
        if(l >= r) return;

        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of The array: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sort");
        printArray(arr);
        System.out.println("Array after sort");
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
