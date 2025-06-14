package practice;

public class BubbleSort {
    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(flag) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,9,7,6,3,14,65,5};
        print(arr);
        sort(arr);
        print(arr);
    }
}
