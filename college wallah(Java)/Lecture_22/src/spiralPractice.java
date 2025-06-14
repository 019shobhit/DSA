import java.util.Scanner;

public class spiralPractice {
    static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void spiralArray(int[][] arr,int r, int c){
       int topRow =0 , rightCol = c-1, bottomRow = r-1 , leftCol = 0;
       int count =0;
       while(count<r*c){
           for(int j=leftCol;j<=rightCol && count<r*c;j++){
               System.out.print(arr[topRow][j]+" ");
               count++;
           }
               topRow++;
           for(int i=topRow;i<=bottomRow && count<r*c;i++){
               System.out.print(arr[i][rightCol]+" ");
               count++;
           }
               rightCol--;
           for(int j=rightCol;j>=leftCol && count<r*c;j--){
               System.out.print(arr[bottomRow][j]+" ");
               count++;
           }
               bottomRow--;
           for(int i=bottomRow;i>=topRow && count<r*c;i--){
               System.out.print(arr[i][leftCol]+" ");
               count++;
           }
               leftCol++;

       }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr= new int[r][c];

        for(int i=0;i<r;i++){
            System.out.println("Enter Elements of "+i+" Row:");
            for(int j=0;j<c;j++){
                 arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("Entered Matrix");
        printMatrix(arr);

        System.out.println("Spiral Array is:");
        spiralArray(arr,r,c);

    }
}
