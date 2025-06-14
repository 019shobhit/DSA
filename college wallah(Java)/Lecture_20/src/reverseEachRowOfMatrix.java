import java.util.Scanner;

public class reverseEachRowOfMatrix {

    static Scanner sc = new Scanner(System.in);

    static int[][] inputMatrix(){
        System.out.println("Enter size of Matrix: ");
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
    static void outputMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static void revRowMatrix(int[][] arr){
        int x =arr.length,y=arr[0].length;
        int[][] ans = new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                ans[i][j]=arr[i][y-1-j];
            }
        }
        outputMatrix(ans);

    }
    public static void main(String[] args) {

        int[][] arr = inputMatrix();

        System.out.println("reverse matrix is :");
        revRowMatrix(arr);



    }
}
