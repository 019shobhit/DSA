import java.util.Scanner;

public class addMatrix {
    static Scanner sc = new Scanner(System.in);
    static void printtwoDArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] input2DArray(){
        System.out.println("Enter sixe of Matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter Elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return  arr;
    }

    static int[][] sum2DArray(int[][] arr1,int[][] arr2){
        int[][] sum = new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                sum[i][j]= arr1[i][j]+arr2[i][j];
            }
            System.out.println();
        }
        return  sum;
    }

    public static void main(String[] args) {

        int[][] arr1 =input2DArray();
        int[][] arr2 =input2DArray();

        int[][] sum = sum2DArray(arr1,arr2);
        printtwoDArray(sum);
    }
}
