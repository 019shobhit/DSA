import java.util.Scanner;

public class generateSpiral {
    static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n){
        int topRow =0, rightCol=n-1, bottomRow =n-1, leftCol=0;
        int[][] arr = new int[n][n];
        int num = 1;
        while(num<=n*n){
            for(int j=leftCol;j<=rightCol   ;j++){
                arr[topRow][j]= num++;
            }
            topRow++;
            for(int i=topRow;i<=bottomRow  ;i++){
                arr[i][rightCol]=num++;
            }
            rightCol--;
            for(int j=rightCol;j>=leftCol ;j--){
                arr[bottomRow][j] = num++;
            }
            bottomRow--;
            for(int i=bottomRow;i>=topRow ;i--){
                arr[i][leftCol] = num++;
            }
            leftCol++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Calling spiral function");
        int[][] arr = generateSpiralMatrix(n);
        System.out.println("Print arr");
        printMatrix(arr);
    }
}
