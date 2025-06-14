import java.util.Scanner;

public class BubbleSort {
    static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) return;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array to be created: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        sort(arr);
        System.out.println("Sorted Array: ");

    }
}
