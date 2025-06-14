import java.util.Scanner;

public class Questions {

    static int findRepeatingNumber(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

//    static int findMax(int[] arr){
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max)
//                max=arr[i];
//        }
//        return max;
//    }
//    static int secondMax(int[] arr){
//        int max = findMax(arr);
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==max){
//                arr[i]= Integer.MIN_VALUE;
//            }
//        }
//        int max2=findMax(arr);
//        return max2;
//    }
//
//    static int findUnique(int[]arr){
//        int n= arr.length;
//        for(int i=0;i<n-1;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]==arr[j]){
//                    arr[i]=-1;
//                    arr[j]=-1;
//                }
//            }
//        }
//        int ans=-1;
//        for(int i=0;i<n;i++){
//            if(arr[i]>0){
//                ans = arr[i];
//            }
//        }
//        return ans;
//    }
//
//    static int pairSum(int[] arr,int target){
//        int count =0;
//        for(int i=0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//    static int triplateSum(int[]arr,int target){
//        int count =0,n=arr.length;
//        for(int i=0;i<n-2;i++){
//            for(int j=i+1;j<n-1;j++){
//                for(int k=j+1;k<n;k++){
//                    if(arr[i]+arr[j]+arr[k] == target){
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;
//    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of an array to create an array: ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter "+n+" Elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
//        int x;
//        System.out.println("Enter target sum to be searhed in the array: ");
//        x = sc.nextInt();


//        System.out.println("Total pairs avilable is :"+pairSum(arr,x));
//        System.out.println("Total Triplet pairs are: "+triplateSum(arr,x));
//        System.out.println("Unique element is "+findUnique(arr));
//        System.out.println("Second Max value is "+secondMax(arr));
        System.out.println("The repeated number is : "+findRepeatingNumber(arr));

    }
}
