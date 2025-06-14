
public class questions {
    static void printArray(int[] arr){
//    static void swap(int a,int b){
//        System.out.println("A before swap is: "+a+" B before swap is:"+b);
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("A after swap is: "+a+" B after swap is:"+b);
//    }
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }

//    static int[] rivArr(int[] arr){
//        int n=arr.length;
//        int[] newArr = new int[n];
//        for(int i=0;i<n;i++){
//            newArr[i] = arr[n-i-1];
//        }
//        return newArr;
//    }
    static void swapInArray(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void rivInArray(int[] arr,int i,int j){
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
//    static int[] rotateArray(int[] arr,int x){
//        int n= arr.length;
//        x = x % n;
//        int[] ans=new int[n];
//        for(int i=0;i<n;i++){
//            if(x+i<n){
//                ans[i]=arr[x+i];
//            }
//            else{
//                ans[i]=arr[x+i-n];
//            }
//        }
//        return ans;
//    }
//    static int[] rotateArray(int[] arr,int x){
//        int n = arr.length;
//        x= x%n;
//        int j=0;
//        int[] ans = new int[n];
//        for(int i=n-x;i<n;i++){
//            ans[j++] = arr[i];
//        }
//        for(int i=0;i<n-x;i++){
//            ans[j++]=arr[i];
//        }
//    }
//        return  ans;
    static void rotateInArray(int[] arr,int x){
        int n= arr.length;
        x=x%n;
        rivInArray(arr,0,n-x-1);
        rivInArray(arr,n-x,n-1);
        rivInArray(arr,0,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        rotateInArray(arr,3);
        printArray(arr);
    }
}
