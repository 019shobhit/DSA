import java.util.Scanner;

public class sortArray {

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr,int i,int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
//    static void sortZerosAndOnes(int[] arr){
//        int count0=0,n=arr.length;
//        for(int i=0;i<n;i++){
//            if(arr[i]==0)
//                count0++;
//        }
//        for(int i=0;i<n;i++){
//            if(i<count0)
//                arr[i]=0;
//            else
//                arr[i]=1;
//        }
//    }
    static void sortZerosAndOnes(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]==0)
                i++;
            if(arr[j]==1)
                j--;
        }
    }
    static void sortOddsAndEven(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]%2==1 && arr[j]%2==0){
                swap(arr,i,j);
                i++;
                j--;
            }
            if(arr[i]%2==0)
                i++;
            if(arr[j]%2==1)
                j--;
        }
    }

    static int[] sortSquare(int[] arr){
        int n=arr.length;
        int i=0,j=n-1,k=n-1;
        int ans[] =new int[n];
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k--]=arr[i]*arr[i];
                i++;
            }
            else{
                ans[k--]=arr[j]*arr[j];
                j--;
            }
        }
        return  ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Origenel Array");
        printArray(arr);
        System.out.println();
        System.out.println("Sorted Array");
        int[] newarr = sortSquare(arr);
        printArray(newarr);

    }
}
