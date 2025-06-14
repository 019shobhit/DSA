import java.util.Scanner;

public class transposeMatrix {
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    static int[][] findTranspose(int[][] arr,int row,int col){
        int[][] ans =new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                ans[i][j]= arr[j][i];
            }
        }
        return ans;
    }

    static void transposeInPlace(int[][] arr,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i+1;j<r;j++){
                int temp =arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }

    static void rotate(int[][] arr,int n){
        transposeInPlace(arr,n,n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                reverseArray(arr[i]);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of 2D Array");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr= new int[r][c];
        for(int i=0;i<r;i++){
        System.out.println("Enter "+i+" row Elements: ");
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        printArray(arr);
        System.out.println("Transpose Array: ");
//        int[][] ans = findTranspose(arr,r,c);
//        transposeInPlace(arr,r,c);
        rotate(arr,r);
        printArray(arr);
    }
}
