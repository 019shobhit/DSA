package practive;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr= {{10,20,30,40,50},{60,70,80,90,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printMatrix(arr);
        System.out.println("Spiral order matrix");
        printSpiral(arr,arr.length,arr[0].length);
    }
    static void printSpiral(int[][] arr,int r,int c){
        int tr = 0;
        int br = r-1;
        int rc= c-1;
        int lc = 0;
        int count=0;

        while(count<r*c){
            //top row -> left to right
            for(int i=lc;i<=rc &&count<r*c;i++){
                System.out.print(arr[tr][i]+" ");
                count++;
            }

            //right col -> top to bottom
            tr++;
            for(int i=tr;i<=br && count<r*c;i++){
                System.out.print(arr[i][rc]+" ");
                count++;
            }
            rc--;
            //bottom row -> right to left
            for(int i=rc;i>=lc && count<r*c;i--){
                System.out.print(arr[br][i]+" ");
                count++;
            }
            br--;
            //left col -> bottom to top
            for(int i = br;i>=tr && count<r*c;i--){
                System.out.print(arr[i][lc]+" ");
                count++;
            }
            lc++;
        }

    }
    static void printMatrix(int[][] arr){
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
