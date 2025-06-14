import java.util.Scanner;

public class rangeQuery{
    static int[] prefixSumArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n= sc.nextInt();
        System.out.println("Enter "+n+" Elements: ");
        int[] arr = new int[n+1];
        for(int i=1;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int[] newArr =prefixSumArray(arr);

        System.out.println("Enter number of  Queries you want");
        int q = sc.nextInt();

        while(q-->0){
            System.out.println("Enter range: ");
            int a = sc.nextInt();
            int b= sc.nextInt();
            int ans = newArr[b]-newArr[a];

            System.out.println("The sum is: "+ans);

        }


    }

}
