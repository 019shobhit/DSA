package practice;

public class SelectionSort{
    public static void print(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min_idx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] <arr[min_idx])min_idx=j;
            }
            if(i != arr[i]){
                int temp = arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,45,6,7,9,2,1,5};
        print(arr);
        sort(arr);
        print(arr);

    }
}
