package practice;

public class InsertionSort {
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void sort(int[] arr){
        for(int i=1;i<arr.length-1;i++){
            int j =i;
            while(j>0 && arr[j] <arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,6,3,2,1,4,2,6};
        print(arr);
        sort(arr);
        print(arr);
    }
}
