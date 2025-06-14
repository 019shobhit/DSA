import java.util.Scanner;

public class printSpiral {

    static void printMatrix(int[][] arr,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] arr,int r,int c){
        int topRow =0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int te =0;
        while(te<r*c){
//            topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && te<r*c;j++){
                System.out.print(arr[topRow][j]+" ");
                te++;
            }
            topRow++;

//            rightcol -> topRow to bottomRow
            for(int i=topRow;i<=bottomRow && te<r*c;i++){
                System.out.print(arr[i][rightCol]+" ");
                te++;
            }
            rightCol--;

//            bottomrRow -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && te<r*c;j--){
                System.out.print(arr[bottomRow][j]+" ");
                te++;
            }
            bottomRow--;


//            leftCol -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && te<r*c;i--){
                System.out.print(arr[i][leftCol]+" ");
                te++;
            }
            leftCol++;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Matrix: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            System.out.println("Enter "+i+"Row Elements");
            for(int j=0;j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Array");
        printMatrix(arr,row,col);

        System.out.println("Spirel order");
        printSpiralOrder(arr,row,col);

    }
}
