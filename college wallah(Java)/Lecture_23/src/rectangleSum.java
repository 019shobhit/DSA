import java.util.Scanner;

public class rectangleSum {

    static int printSum(int[][] arr, int r1,int c1,int r2,int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }
        return  sum;
    }
    static void prefixSumRow(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    static void prefixSumCol(int[][] arr){
        for(int j=0;j<arr[0].length;j++){
            for(int i=1;i<arr.length;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }
    }


    static int findSum(int[][] arr,int r1,int c1,int r2,int c2){
        int sum=0;
        prefixSumRow(arr);
        for(int i=r1;i<=r2;i++){
            if(c1>=1)
                sum += arr[i][c2]-arr[i][c1-1];
            else
                sum +=arr[i][c2];
        }
        return sum;
    }

    static int findsumNext(int[][] arr,int r1,int c1,int r2, int c2){
        int sum ,left=0,up=0,leftUp=0,ans;
//        prefixSumRow(arr);
        prefixSumCol(arr);
        sum = arr[r2][c2];
        if(r1>=1)
            left = arr[r1-1][c2];
        if(c1>=1)
            up = arr[r2][c1-1];
        if(r1>=1 && c1>=1)
            leftUp = arr[r1-1][c1-1];

        ans = sum + leftUp - left - up ;
        return  ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int r =sc.nextInt();
        int c = sc.nextInt();
        int[][] arr= new int[r][c];
        for(int i=0;i<r;i++){
            System.out.println("Enter Elements of Row: "+i);
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter Rectangle Boundries r1 c1 r2 c2:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        System.out.println("The sum of the Rectangle is : "+printSum(arr,r1,c1,r2,c2));
        System.out.println("The sum of the Rectangle is : "+findSum(arr,r1,c1,r2,c2));
        System.out.println("The sum of the Rectangle is : "+findsumNext(arr,r1,c1,r2,c2));

    }
}
